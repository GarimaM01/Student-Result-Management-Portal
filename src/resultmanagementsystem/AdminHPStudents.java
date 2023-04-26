/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resultmanagementsystem;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Meteor
 */
public class AdminHPStudents extends javax.swing.JFrame {

    /**
     * Creates new form AdminHPStudents
     */
    public AdminHPStudents() {
        initComponents();
        setTitle("Admin Manage Students");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        adminlogout = new javax.swing.JLabel();
        adminexit = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        addstudent = new javax.swing.JLabel();
        viewstudent = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/admin.png"))); // NOI18N
        jLabel1.setText("ADMINISTRATOR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 59));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 64, 220, 10));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddHomedac.png"))); // NOI18N
        jLabel2.setText("HOME");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 220, -1));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddCoursedac.png"))); // NOI18N
        jLabel3.setText("COURSES");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 220, -1));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddStudentdac.png"))); // NOI18N
        jLabel4.setText("STUDENT");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, 220, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddFacultydac.png"))); // NOI18N
        jLabel5.setText("FACULTY");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 176, 220, -1));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddSubjectdac.png"))); // NOI18N
        jLabel6.setText("SUBJECTS");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 208, 220, -1));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddAssignSubjectdac.png"))); // NOI18N
        jLabel7.setText("ASSIGN SUBJECTS");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 220, -1));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddMarksheetdac.png"))); // NOI18N
        jLabel8.setText("MARKSHEET");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 272, 220, -1));

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddAdmindac.png"))); // NOI18N
        jLabel9.setText("ADD ADMIN");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 304, 220, -1));

        jLabel10.setBackground(new java.awt.Color(0, 153, 153));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddUserProfiledac.png"))); // NOI18N
        jLabel10.setText("USER PROFILE");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 336, 220, -1));

        adminlogout.setBackground(new java.awt.Color(0, 153, 153));
        adminlogout.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        adminlogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddLogoutdac.png"))); // NOI18N
        adminlogout.setText("LOGOUT");
        adminlogout.setOpaque(true);
        adminlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminlogoutMouseClicked(evt);
            }
        });
        jPanel2.add(adminlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 442, 220, -1));

        adminexit.setBackground(new java.awt.Color(0, 153, 153));
        adminexit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        adminexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddExitdac.png"))); // NOI18N
        adminexit.setText("EXIT");
        adminexit.setOpaque(true);
        adminexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminexitMouseClicked(evt);
            }
        });
        jPanel2.add(adminexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 474, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 550));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultmanagementsystem/AddStudentdac.png"))); // NOI18N
        jLabel15.setText("Students");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));

        addstudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addstudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addstudent.setText("Add Student");
        addstudent.setOpaque(true);
        addstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addstudentMouseClicked(evt);
            }
        });
        jPanel10.add(addstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 90, 30));

        viewstudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewstudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewstudent.setText("View Students");
        viewstudent.setOpaque(true);
        viewstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewstudentMouseClicked(evt);
            }
        });
        jPanel10.add(viewstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 770, 160));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Class", "RollNo", "StudentName", "CourseName", "Sem/Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 770, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        new adminhome().setVisible(true);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0, 204, 204));
        jLabel3.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0,153,153));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));

        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new AdminHPAllCourses().setVisible(true);
        new adminhome().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0, 204, 204));
        jLabel4.setBackground(new Color(0,153,153));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new AdminHPStudents().setVisible(true);
        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0, 204, 204));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new AdminHPFaculty().setVisible(true);
        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        jLabel5.setBackground(new Color(0, 204, 204));
        jLabel4.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new AdminHPSubjects().setVisible(true);
        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0, 204, 204));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new AdminHPAssignSubjects().setVisible(true);
        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0, 204, 204));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        new AdminHPMarksheet().setVisible(true);
        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0, 204, 204));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        new AdminHPAddNewAdmin().setVisible(true);
        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0, 204, 204));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new AdminHPUserProfile().setVisible(true);
        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0, 204, 204));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jLabel10MouseClicked

    private void adminlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminlogoutMouseClicked
        // TODO add your handling code here:
        int b = JOptionPane.showConfirmDialog(null, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (b == 0) {
            setVisible(false);
            new resultmanagementsystem.homepage().setVisible(true);
        }
        else{
            new resultmanagementsystem.adminhome().setVisible(true);
        }

        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0, 204, 204));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_adminlogoutMouseClicked

    private void adminexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminexitMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new resultmanagementsystem.homepage().setVisible(true);
        }else{
            new resultmanagementsystem.adminhome().setVisible(true);
        }

        new adminhome().setVisible(false);
        new AdminHPAllCourses().setVisible(false);
        new AdminHPStudents().setVisible(false);
        new AdminHPFaculty().setVisible(false);
        new AdminHPSubjects().setVisible(false);
        new AdminHPAssignSubjects().setVisible(false);
        new AdminHPMarksheet().setVisible(false);
        new AdminHPAddNewAdmin().setVisible(false);
        new AdminHPUserProfile().setVisible(false);

        jLabel2.setBackground(new Color(0,153,153));
        jLabel3.setBackground(new Color(0,153,153));
        adminexit.setBackground(new Color(0, 204, 204));
        jLabel5.setBackground(new Color(0,153,153));
        jLabel6.setBackground(new Color(0,153,153));
        jLabel7.setBackground(new Color(0,153,153));
        jLabel8.setBackground(new Color(0,153,153));
        jLabel9.setBackground(new Color(0,153,153));
        jLabel10.setBackground(new Color(0,153,153));
        adminlogout.setBackground(new Color(0,153,153));
        jLabel4.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_adminexitMouseClicked

    private void addstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstudentMouseClicked
        // TODO add your handling code here:
        //        setVisible(false);
        new adminaddstudent().setVisible(true);
    }//GEN-LAST:event_addstudentMouseClicked

    private void viewstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewstudentMouseClicked
        // TODO add your handling code here:
        new adminmanagecourse().setVisible(true);
    }//GEN-LAST:event_viewstudentMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHPStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHPStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHPStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHPStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHPStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addstudent;
    private javax.swing.JLabel adminexit;
    private javax.swing.JLabel adminlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel viewstudent;
    // End of variables declaration//GEN-END:variables
}
