/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resultmanagementsystem;

import Connection.MyFunction;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Courses.coursedatasql;
import com.mysql.cj.util.StringUtils;

/**
 *
 * @author Meteor
 */
public class adminaddcourse extends javax.swing.JFrame {

    /**
     * Creates new form add course
     */
    coursedatasql cs = new coursedatasql();
    public adminaddcourse() {
        initComponents();
        setTitle("Admin Add New Course");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        entercoursecode = new javax.swing.JTextField();
        entercoursename = new javax.swing.JTextField();
        entertotalsemoryear = new javax.swing.JTextField();
        entersemoryear = new javax.swing.JComboBox<>();
        addnewcoursecancelbutton = new com.k33ptoo.components.KButton();
        addnewcourseaddbutton = new com.k33ptoo.components.KButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 255, 255));

        jLabel2.setFont(new java.awt.Font("Romande ADF Std", 1, 14)); // NOI18N
        jLabel2.setText("Course Code");

        jLabel3.setFont(new java.awt.Font("Romande ADF Std", 1, 14)); // NOI18N
        jLabel3.setText("Course Name");

        jLabel4.setFont(new java.awt.Font("Romande ADF Std", 1, 14)); // NOI18N
        jLabel4.setText("Sem/Year");

        jLabel5.setFont(new java.awt.Font("Romande ADF Std", 1, 14)); // NOI18N
        jLabel5.setText("Total Sem/Year");

        entercoursecode.setFont(new java.awt.Font("Romande ADF Std", 0, 12)); // NOI18N
        entercoursecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entercoursecodeActionPerformed(evt);
            }
        });

        entercoursename.setFont(new java.awt.Font("Romande ADF Std", 0, 12)); // NOI18N
        entercoursename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entercoursenameActionPerformed(evt);
            }
        });

        entertotalsemoryear.setFont(new java.awt.Font("Romande ADF Std", 0, 12)); // NOI18N
        entertotalsemoryear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entertotalsemoryearActionPerformed(evt);
            }
        });

        entersemoryear.setFont(new java.awt.Font("Romande ADF Std", 0, 12)); // NOI18N
        entersemoryear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------- SELECT CHOICE --------", "Sem", "Year" }));
        entersemoryear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entersemoryearActionPerformed(evt);
            }
        });

        addnewcoursecancelbutton.setText("CANCEL");
        addnewcoursecancelbutton.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        addnewcoursecancelbutton.setkBorderRadius(25);
        addnewcoursecancelbutton.setkEndColor(new java.awt.Color(255, 0, 255));
        addnewcoursecancelbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        addnewcoursecancelbutton.setkHoverStartColor(new Color(73,13,198,120));
        addnewcoursecancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewcoursecancelbuttonActionPerformed(evt);
            }
        });

        addnewcourseaddbutton.setText("ADD");
        addnewcourseaddbutton.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        addnewcourseaddbutton.setkBorderRadius(25);
        addnewcourseaddbutton.setkEndColor(new java.awt.Color(255, 0, 255));
        addnewcourseaddbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        addnewcourseaddbutton.setkHoverStartColor(new Color(73,13,198,120));
        addnewcourseaddbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addnewcourseaddbuttonMouseClicked(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Romande ADF Std", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Course");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(addnewcoursecancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(addnewcourseaddbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entercoursecode)
                    .addComponent(entercoursename)
                    .addComponent(entertotalsemoryear)
                    .addComponent(entersemoryear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entercoursecode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entercoursename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entersemoryear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(entertotalsemoryear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnewcoursecancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addnewcourseaddbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addnewcoursecancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewcoursecancelbuttonActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
        this.dispose();
   
    }//GEN-LAST:event_addnewcoursecancelbuttonActionPerformed

    private void entercoursecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entercoursecodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entercoursecodeActionPerformed

    private void entercoursenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entercoursenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entercoursenameActionPerformed

    private void entersemoryearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entersemoryearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entersemoryearActionPerformed

    private void entertotalsemoryearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entertotalsemoryearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entertotalsemoryearActionPerformed

    public static String capitalizeWord(String str){  
    String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
    }  
    return capitalizeWord.trim();  
}  
    private void addnewcourseaddbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewcourseaddbuttonMouseClicked
        // TODO add your handling code here:
//        setVisible(false);
//        new adminaddcourse().setVisible(true);
            String coursename = entercoursename.getText();
            String coursecode = entercoursecode.getText();
            String semoryear = (String) entersemoryear.getSelectedItem();
            String totalsemoryear = entertotalsemoryear.getText();

	 	if(coursecode.isEmpty())
		{
                    JOptionPane.showMessageDialog(null, "Missing selection in courcecode", "Error", JOptionPane.ERROR_MESSAGE);
		}
	
		else if(coursename.isEmpty())
		{
                    JOptionPane.showMessageDialog(null, "Missing selection in courcename", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if (semoryear.isEmpty() || semoryear == "-------- SELECT CHOICE --------") {
                    JOptionPane.showMessageDialog(null, "Select anyone option from SEM or YEAR", "Error", JOptionPane.ERROR_MESSAGE);
                }
		else if(totalsemoryear.isEmpty())
		{
                    JOptionPane.showMessageDialog(null, "Missing selection in totalsemoryear", "Error", JOptionPane.ERROR_MESSAGE);
		}
                else {
                    if (cs.isCourseExist(coursecode) || cs.isCourseExist(coursename)) {
                        JOptionPane.showMessageDialog(null, "Course Already Exists");
                    } else {
                        int totalsem = Integer.parseInt(totalsemoryear);
                        coursename = entercoursename.getText();
                        coursename = capitalizeWord(coursename);
                        int maxLength = 60; // Assuming maximum length of 50 characters for the coursename column

                        if (coursename.length() > maxLength) {
                            coursename = coursename.substring(0, maxLength);
                            JOptionPane.showMessageDialog(null, "Course Name truncated to " + maxLength + " characters");
                        }

                        cs.CourseUpdate('i', 0, coursecode, coursename, semoryear, totalsem);
                        
                        adminhome.CS.setText("Courses : " + Integer.toString(MyFunction.countData("courses")));

                        try {
                            DefaultTableModel model = new DefaultTableModel(null, new Object[]{"Sr_No", "Course Code", "Course Name", "Sem/Year","Total Sem/Year"});
                            adminmanagecourse.managecoursetable.setModel(model);
                            cs.courseTable(adminmanagecourse.managecoursetable);
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
    }//GEN-LAST:event_addnewcourseaddbuttonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminaddcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminaddcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminaddcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminaddcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminaddcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton addnewcourseaddbutton;
    private com.k33ptoo.components.KButton addnewcoursecancelbutton;
    private javax.swing.JTextField entercoursecode;
    private javax.swing.JTextField entercoursename;
    private javax.swing.JComboBox<String> entersemoryear;
    private javax.swing.JTextField entertotalsemoryear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
