package Students;


import Connection.MyConnection;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class studentdatasql {

    public void StudentUpdate(char op, String coursecode, Integer semoryear, Long registerNo, String optionalsubject,
            String firstname, String lastname, String emailid, String contactnumber, String dateofbirth, String gender,
            String address, String state, String city, Integer pincode, String fathername, String fatheroccupation, String mothername,
            String motheroccupation, String lastlogin, String userid, String password, Byte activestatus, 
            String admissiondate, byte[] profilepic) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO students(coursecode, semoryear, registerNo, optionalsubject,"
                        + " firstname, lastname, emailid, contactnumber, dateofbirth, gender, address, state, city,"
                        + " pincode, fathername, fatheroccupation, mothername, motheroccupation, lastlogin, userid,"
                        + " password, activestatus, admissiondate, profilepic) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, coursecode.toUpperCase());
                ps.setInt(2, semoryear);
                ps.setLong(3, registerNo);
                ps.setString(4, optionalsubject);
                ps.setString(5, firstname);
                ps.setString(6, lastname);
                ps.setString(7, emailid);
                ps.setString(8, contactnumber);
                ps.setString(9, dateofbirth);
                ps.setString(10, gender);
                ps.setString(11, address);
                ps.setString(12, state);
                ps.setString(13, city);
                ps.setInt(14, pincode);
                ps.setString(15, fathername);
                ps.setString(16, fatheroccupation);
                ps.setString(17, mothername);
                ps.setString(18, motheroccupation);
                ps.setString(19, lastlogin);
                ps.setString(20, userid);
                ps.setString(21, password);
                ps.setByte(22, activestatus);
                ps.setString(23, admissiondate);
                ps.setBytes(24, profilepic);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Student Added Successfully");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (op == 'u') {
            try {
                ps = con.prepareStatement("UPDATE students SET coursecode=?, semoryear=?, optionalsubject=?,"
                        + " firstname=?, lastname=?, emailid=?, contactnumber=?, dateofbirth=?, gender=?, "
                        + "address=?, state=?, city=?, pincode=?, fathername=?, fatheroccupation=?, mothername=?, "
                        + "motheroccupation=?, lastlogin=?, userid=?, password=?, activestatus=?, admissiondate=? "
                        + "profilepic=?"
                        + "WHERE registerNo=?");
                ps.setString(1, coursecode.toUpperCase());
                ps.setInt(2, semoryear);
                ps.setString(3, optionalsubject);
                ps.setString(4, firstname);
                ps.setString(5, lastname);
                ps.setString(6, emailid);
                ps.setString(7, contactnumber);
                ps.setString(8, dateofbirth);
                ps.setString(9, gender);
                ps.setString(10, address);
                ps.setString(11, state);
                ps.setString(12, city);
                ps.setInt(13, pincode);
                ps.setString(14, fathername);
                ps.setString(15, fatheroccupation);
                ps.setString(16, mothername);
                ps.setString(17, motheroccupation);
                ps.setString(18, lastlogin);
                ps.setString(19, userid);
                ps.setString(20, password);
                ps.setByte(21, activestatus);
                ps.setString(22, admissiondate);
                ps.setBytes(23, profilepic);
                ps.setLong(24, registerNo);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Student Data Updated Successfully");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }


        if (op == 'd') {

            int YesOrNo = JOptionPane.showConfirmDialog(null, "The Score and Attendance will be also deleted", "Delete Student", JOptionPane.OK_CANCEL_OPTION, 0);

            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                    ps = con.prepareStatement("DELETE FROM students WHERE registerNo=?");
                    ps.setLong(1, registerNo);

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Student Data Deleted Successfully");
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                } 
            }
        }
    }

    public void studentTable(JTable table, String valueToSearch) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM student WHERE CONCAT (first_name, last_name, phone, address)LIKE ?");
            ps.setString(1, "%" + valueToSearch + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);

                model.addRow(row);

            }

        } catch (SQLException ex) {
            Logger.getLogger(studentdatasql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
