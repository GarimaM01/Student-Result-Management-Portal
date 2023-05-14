/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
/**
 *
 * @author Meteor
 */
public class coursedatasql {
public void CourseUpdate(char op, int sr_no, String coursecode, String coursename, String semoryear, int totalsemoryear) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement1","root","micro_code01");
        PreparedStatement ps;

        if (op == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO courses(coursecode, coursename, semoryear, totalsemoryear) VALUES (?,?,?,?)");
                ps.setString(1, coursecode.toUpperCase());
                ps.setString(2, coursename);
                ps.setString(3, semoryear);
                ps.setInt(4, totalsemoryear);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Course Added Successfully");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (op == 'u') {
            try {
                ps = con.prepareStatement("UPDATE courses SET coursecode = ?, coursename = ?, semoryear = ?, totalsemoryear = ? WHERE sr_no = ?");
                ps.setString(1, coursecode);
                ps.setString(2, coursename);
                ps.setString(3, semoryear);
                ps.setInt(4, totalsemoryear);
                ps.setInt(5, sr_no);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Course Data Updated");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (op == 'd') {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "The Score will be also deleted", "Delete Course", JOptionPane.OK_CANCEL_OPTION, 0);

            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                    ps = con.prepareStatement("DELETE FROM courses WHERE sr_no = ?");

                    ps.setInt(1, sr_no);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Course Deleted");
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(coursedatasql.class.getName()).log(Level.SEVERE, null, ex);
    }

}
    

public boolean isCourseExist(String coursename) {

    boolean isExist = false;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement1","root","micro_code01");
        PreparedStatement ps;
        
        ps = con.prepareStatement("SELECT * FROM courses WHERE coursename = ?");
        ps.setString(1, coursename);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            isExist = true;

        }

    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(coursedatasql.class.getName()).log(Level.SEVERE, null, ex);
    }

    return isExist;
}

public void courseTable(JTable table) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement1","root","micro_code01");
        PreparedStatement ps;

        ps = con.prepareStatement("SELECT * FROM courses");

        ResultSet rs = ps.executeQuery();
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        Object[] row;

        while (rs.next()) {
            row = new Object[5];
            row[0] = rs.getInt(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            row[4] = rs.getInt(5);

            model.addRow(row);

        }

    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(coursedatasql.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public int getCourseId(String courseLabel) {

    int courseId = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement1","root","micro_code01");
        PreparedStatement ps;

        ps = con.prepareStatement("SELECT * FROM courses WHERE coursename = ?");
        ps.setString(1, courseLabel);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            courseId = rs.getInt("sr_no");

        }

    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(coursedatasql.class.getName()).log(Level.SEVERE, null, ex);
    }
    return courseId;
}

public void courseTablecombo(JComboBox combobox) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement1","root","micro_code01");
        PreparedStatement ps;

        ps = con.prepareStatement("SELECT * FROM courses");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            combobox.addItem(rs.getString(3));

        }

    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(coursedatasql.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}