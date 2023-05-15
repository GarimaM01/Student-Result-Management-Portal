/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Students;

import Connection.MyConnection;
import Connection.MyFunction;
import java.sql.Connection;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import resultmanagementsystem.AdminHPStudents;
import resultmanagementsystem.adminhome;
import resultmanagementsystem.adminmanagecourse;


/**
 *
 * @author Meteor
 */
public class adminaddstudent extends javax.swing.JFrame {

    /**
     * Creates new form admin add student
     */
    Connection con = MyConnection.getConnection();
    
    // Initialize the JComboBox with the course names from the Courses table
    private void initCourseComboBox() {
        
            PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT coursename FROM courses");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String coursename = rs.getString("coursename");
                courseComboBox.addItem(coursename);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Add a listener to the JComboBox that fetches the course names from the Courses table and updates the JComboBox
//    private void addCourseComboBoxListener() {
//        courseComboBox.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if (e.getStateChange() == ItemEvent.SELECTED) {
//                    
//            PreparedStatement ps;
//                    try {
//                        // Clear the existing items in the JComboBox
//                        courseComboBox.removeAllItems();
//
//                        // Fetch the course code from the Courses table and add them to the JComboBox
//                        ps = con.prepareStatement("SELECT coursecode FROM courses");
//                        ResultSet rs = ps.executeQuery();
//                        while (rs.next()) {
//                            String coursecode = rs.getString("coursecode");
//                            courseComboBox.addItem(coursecode);
//                        }
//                    } catch (SQLException ex) {
//                        ex.printStackTrace();
//                    }
//                }
//            }
//        });
//    }

    
    public void updateStudentLastLoginAndActiveStatus(String userId) {
        try {
            Connection con = MyConnection.getConnection();
            String sql = "UPDATE student SET lastlogin = ?, activestatus = ? WHERE userid = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));
            ps.setByte(2, (byte) 1);
            ps.setString(3, userId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public void disable() {
        courseComboBox.setEnabled(false);
        semOrYearComboBox.setEnabled(false);
        registerNoTextField.setEnabled(false);
        OptionalSubject.setEnabled(false);
        firstNameTextField.setEnabled(false);
        lastNameTextField.setEnabled(false);
        emailIdTextField.setEnabled(false);
        countrycodeTextField.setEnabled(false);
        contactnoTextFieldField.setEnabled(false);
        dobTextField.setEnabled(false);
        genderComboBox.setEnabled(false);
        addressTextField.setEnabled(false);
        stateTextField.setEnabled(false);
        cityTextField.setEnabled(false);
        pinCodeTextField.setEnabled(false);
        fathernameTextField.setEnabled(false);
        fatheroccupationTextField.setEnabled(false);
        mothernameTextField.setEnabled(false);
        motheroccupationTextField.setEnabled(false);
        userIdTextField.setEnabled(false);
        passwordField.setEnabled(false);
        admissionDateTextField.setEnabled(false);
        studentpic.setEnabled(false);
        
    }

    public void enable() {
        courseComboBox.setEnabled(true);
        semOrYearComboBox.setEnabled(true);
        registerNoTextField.setEnabled(true);
        OptionalSubject.setEnabled(true);
        firstNameTextField.setEnabled(true);
        lastNameTextField.setEnabled(true);
        emailIdTextField.setEnabled(true);
        countrycodeTextField.setEnabled(true);
        contactnoTextFieldField.setEnabled(true);
        dobTextField.setEnabled(true);
        genderComboBox.setEnabled(true);
        addressTextField.setEnabled(true);
        stateTextField.setEnabled(true);
        cityTextField.setEnabled(true);
        pinCodeTextField.setEnabled(true);
        fathernameTextField.setEnabled(true);
        fatheroccupationTextField.setEnabled(true);
        mothernameTextField.setEnabled(true);
        motheroccupationTextField.setEnabled(true);
        userIdTextField.setEnabled(true);
        passwordField.setEnabled(true);
        admissionDateTextField.setEnabled(true);
        studentpic.setEnabled(true);
    }
    
    
    public adminaddstudent() {
        initComponents();
        setTitle("Admin Add Students");
        initCourseComboBox();
        
//        addCourseComboBoxListener();
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
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        courseComboBox = new javax.swing.JComboBox<>();
        semOrYearComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        registerNoTextField = new javax.swing.JTextField();
        OptionalSubject = new javax.swing.JComboBox<>();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        emailIdTextField = new javax.swing.JTextField();
        countrycodeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dobTextField = new com.toedter.calendar.JDateChooser();
        genderComboBox = new javax.swing.JComboBox<>();
        stateTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        fathernameTextField = new javax.swing.JTextField();
        fatheroccupationTextField = new javax.swing.JTextField();
        mothernameTextField = new javax.swing.JTextField();
        motheroccupationTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextField = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        studentpic = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        choosefile = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addstudentbutton = new com.k33ptoo.components.KButton();
        canceladdstudentbutton = new com.k33ptoo.components.KButton();
        pinCodeTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        userIdTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        admissionDateTextField = new com.toedter.calendar.JDateChooser();
        contactnoTextFieldField = new javax.swing.JTextField();
        removePhotoButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        clearaddstudentbutton = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Romande ADF Std", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Student");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        courseComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------- SELECT COURSE NAME --------" }));
        jPanel1.add(courseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 30));

        semOrYearComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        semOrYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------- SELECT SEM OR YEAR --------", "1", "2", "3", "4", "5", "6", "7", "8" }));
        jPanel1.add(semOrYearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Register No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        registerNoTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(registerNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 209, 30));

        OptionalSubject.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        OptionalSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------- SELECT OPTIONAL SUBJECT --------", "asd", "adfg", "sft", "gf" }));
        jPanel1.add(OptionalSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 30));

        firstNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        firstNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        firstNameTextField.setText("First Name");
        firstNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 210, 30));

        lastNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lastNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        lastNameTextField.setText("Last Name");
        lastNameTextField.setPreferredSize(new java.awt.Dimension(79, 22));
        lastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 200, 30));

        emailIdTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        emailIdTextField.setForeground(new java.awt.Color(204, 204, 204));
        emailIdTextField.setText("Email ID");
        emailIdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailIdTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailIdTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(emailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 210, 30));

        countrycodeTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        countrycodeTextField.setForeground(new java.awt.Color(204, 204, 204));
        countrycodeTextField.setText("Code");
        countrycodeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                countrycodeTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                countrycodeTextFieldFocusLost(evt);
            }
        });
        countrycodeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                countrycodeTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(countrycodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 80, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Date Of Birth");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));
        jPanel1.add(dobTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 205, 30));

        genderComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------- SELECT GENDER --------", "Male", "Female", "Others" }));
        jPanel1.add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 300, 30));

        stateTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        stateTextField.setForeground(new java.awt.Color(204, 204, 204));
        stateTextField.setText("State");
        stateTextField.setMinimumSize(new java.awt.Dimension(69, 22));
        stateTextField.setPreferredSize(new java.awt.Dimension(69, 22));
        stateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stateTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                stateTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(stateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 170, 30));

        cityTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cityTextField.setForeground(new java.awt.Color(204, 204, 204));
        cityTextField.setText("City");
        cityTextField.setMinimumSize(new java.awt.Dimension(69, 22));
        cityTextField.setPreferredSize(new java.awt.Dimension(69, 22));
        cityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 170, 30));

        fathernameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fathernameTextField.setForeground(new java.awt.Color(204, 204, 204));
        fathernameTextField.setText("Father's Name");
        fathernameTextField.setMinimumSize(new java.awt.Dimension(69, 22));
        fathernameTextField.setPreferredSize(new java.awt.Dimension(69, 22));
        fathernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fathernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fathernameTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(fathernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 170, 30));

        fatheroccupationTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fatheroccupationTextField.setForeground(new java.awt.Color(204, 204, 204));
        fatheroccupationTextField.setText("Father's Occupation");
        fatheroccupationTextField.setMinimumSize(new java.awt.Dimension(69, 22));
        fatheroccupationTextField.setPreferredSize(new java.awt.Dimension(69, 22));
        fatheroccupationTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fatheroccupationTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fatheroccupationTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(fatheroccupationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 170, 30));

        mothernameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mothernameTextField.setForeground(new java.awt.Color(204, 204, 204));
        mothernameTextField.setText("Mother's Name");
        mothernameTextField.setMinimumSize(new java.awt.Dimension(69, 22));
        mothernameTextField.setPreferredSize(new java.awt.Dimension(69, 22));
        mothernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mothernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mothernameTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(mothernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 170, 30));

        motheroccupationTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        motheroccupationTextField.setForeground(new java.awt.Color(204, 204, 204));
        motheroccupationTextField.setText("Mother's Occupation");
        motheroccupationTextField.setMinimumSize(new java.awt.Dimension(69, 22));
        motheroccupationTextField.setPreferredSize(new java.awt.Dimension(69, 22));
        motheroccupationTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                motheroccupationTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                motheroccupationTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(motheroccupationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 170, 30));

        addressTextField.setColumns(20);
        addressTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addressTextField.setRows(4);
        addressTextField.setTabSize(2);
        jScrollPane1.setViewportView(addressTextField);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 300, 90));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        studentpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Students/pd.jpg"))); // NOI18N
        studentpic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel1.add(studentpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 130, 140));

        jLabel6.setFont(new java.awt.Font("Romande ADF Std", 0, 12)); // NOI18N
        jLabel6.setText("Photo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        choosefile.setText("Choose File");
        choosefile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choosefileMouseClicked(evt);
            }
        });
        jPanel1.add(choosefile, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Romande ADF Std", 0, 12)); // NOI18N
        jLabel7.setText("No File Chosen");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("image size <1MB");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        addstudentbutton.setText("ADD");
        addstudentbutton.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        addstudentbutton.setkBorderRadius(25);
        addstudentbutton.setkEndColor(new java.awt.Color(255, 0, 255));
        addstudentbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        addstudentbutton.setkHoverStartColor(new Color(73,13,198,120));
        addstudentbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addstudentbuttonMouseClicked(evt);
            }
        });
        jPanel1.add(addstudentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 75, 35));

        canceladdstudentbutton.setText("CANCEL");
        canceladdstudentbutton.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        canceladdstudentbutton.setkBorderRadius(25);
        canceladdstudentbutton.setkEndColor(new java.awt.Color(255, 0, 255));
        canceladdstudentbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        canceladdstudentbutton.setkHoverStartColor(new Color(73,13,198,120));
        canceladdstudentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceladdstudentbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(canceladdstudentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 80, 35));

        pinCodeTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pinCodeTextField.setForeground(new java.awt.Color(204, 204, 204));
        pinCodeTextField.setText("Pincode");
        pinCodeTextField.setMinimumSize(new java.awt.Dimension(69, 22));
        pinCodeTextField.setPreferredSize(new java.awt.Dimension(69, 22));
        pinCodeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pinCodeTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pinCodeTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(pinCodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 170, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("UserName/ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, 30));

        userIdTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userIdTextField.setForeground(new java.awt.Color(204, 204, 204));
        userIdTextField.setText("userid same as emailid");
        userIdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userIdTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userIdTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(userIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 260, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, 30));

        passwordField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setText("Set Password");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 170, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Admission Date");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, 30));
        jPanel1.add(admissionDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 140, 30));

        contactnoTextFieldField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        contactnoTextFieldField.setForeground(new java.awt.Color(204, 204, 204));
        contactnoTextFieldField.setText("Contact Number");
        contactnoTextFieldField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactnoTextFieldFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactnoTextFieldFieldFocusLost(evt);
            }
        });
        contactnoTextFieldField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactnoTextFieldFieldKeyTyped(evt);
            }
        });
        jPanel1.add(contactnoTextFieldField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 200, 30));

        removePhotoButton.setText("Remove Pic");
        removePhotoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removePhotoButtonMouseClicked(evt);
            }
        });
        jPanel1.add(removePhotoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("First Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Email ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Last Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("State");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("City");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Pincode");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Father's Name");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Mother's Occupation");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Mother's Name");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Father's Occupation");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, 30));

        clearaddstudentbutton.setText("CLEAR");
        clearaddstudentbutton.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        clearaddstudentbutton.setkBorderRadius(25);
        clearaddstudentbutton.setkEndColor(new java.awt.Color(255, 0, 255));
        clearaddstudentbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        clearaddstudentbutton.setkHoverStartColor(new Color(73,13,198,120));
        clearaddstudentbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearaddstudentbuttonMouseClicked(evt);
            }
        });
        clearaddstudentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearaddstudentbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(clearaddstudentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 80, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusGained
        // TODO add your handling code here:
        if(firstNameTextField.getText().equals("First Name")){
            firstNameTextField.setText("");   
        }
        firstNameTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_firstNameTextFieldFocusGained

    private void firstNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusLost
        // TODO add your handling code here:
        if(firstNameTextField.getText().equals("")){
            firstNameTextField.setText("First Name");    
        }
        firstNameTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_firstNameTextFieldFocusLost

    private void fatheroccupationTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fatheroccupationTextFieldFocusGained
        // TODO add your handling code here:
        if(fatheroccupationTextField.getText().equals("Father's Occupation")){
            fatheroccupationTextField.setText("");   
        }
        fatheroccupationTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_fatheroccupationTextFieldFocusGained

    private void fatheroccupationTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fatheroccupationTextFieldFocusLost
        // TODO add your handling code here:
        if(fatheroccupationTextField.getText().equals("")){
            fatheroccupationTextField.setText("Father's Occupation");    
        }
        fatheroccupationTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_fatheroccupationTextFieldFocusLost

    private void lastNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusGained
        // TODO add your handling code here:
        if(lastNameTextField.getText().equals("Last Name")){
            lastNameTextField.setText("");   
        }
        lastNameTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_lastNameTextFieldFocusGained

    private void lastNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusLost
        // TODO add your handling code here:
        if(lastNameTextField.getText().equals("")){
            lastNameTextField.setText("Last Name");    
        }
        lastNameTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_lastNameTextFieldFocusLost

    private void emailIdTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIdTextFieldFocusGained
        // TODO add your handling code here:
        if(emailIdTextField.getText().equals("Email ID")){
            emailIdTextField.setText("");   
        }
        emailIdTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_emailIdTextFieldFocusGained

    private void emailIdTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIdTextFieldFocusLost
        // TODO add your handling code here:
        if(emailIdTextField.getText().equals("")){
            emailIdTextField.setText("Email ID");    
        }
        emailIdTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_emailIdTextFieldFocusLost

    private void countrycodeTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countrycodeTextFieldFocusGained
        // TODO add your handling code here:
        if(countrycodeTextField.getText().equals("Code")){
            countrycodeTextField.setText("");   
        }
        countrycodeTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_countrycodeTextFieldFocusGained

    private void countrycodeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countrycodeTextFieldFocusLost
        // TODO add your handling code here:
        if(countrycodeTextField.getText().equals("")){
            countrycodeTextField.setText("Code");    
        }
        countrycodeTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_countrycodeTextFieldFocusLost

    private void stateTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateTextFieldFocusGained
        // TODO add your handling code here:
        if(stateTextField.getText().equals("State")){
            stateTextField.setText("");   
        }
        stateTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_stateTextFieldFocusGained

    private void stateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateTextFieldFocusLost
        // TODO add your handling code here:
        if(stateTextField.getText().equals("")){
            stateTextField.setText("State");    
        }
        stateTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_stateTextFieldFocusLost

    private void cityTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityTextFieldFocusGained
        // TODO add your handling code here:
        if(cityTextField.getText().equals("City")){
            cityTextField.setText("");   
        }
        cityTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_cityTextFieldFocusGained

    private void cityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityTextFieldFocusLost
        // TODO add your handling code here:
        if(cityTextField.getText().equals("")){
            cityTextField.setText("City");    
        }
        cityTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_cityTextFieldFocusLost

    private void fathernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fathernameTextFieldFocusGained
        // TODO add your handling code here:
        if(fathernameTextField.getText().equals("Father's Name")){
            fathernameTextField.setText("");   
        }
        fathernameTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_fathernameTextFieldFocusGained

    private void fathernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fathernameTextFieldFocusLost
        // TODO add your handling code here:
        if(fathernameTextField.getText().equals("")){
            fathernameTextField.setText("Father's Name");    
        }
        fathernameTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_fathernameTextFieldFocusLost

    private void mothernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mothernameTextFieldFocusGained
        // TODO add your handling code here:
        if(mothernameTextField.getText().equals("Mother's Name")){
            mothernameTextField.setText("");   
        }
        mothernameTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_mothernameTextFieldFocusGained

    private void mothernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mothernameTextFieldFocusLost
        // TODO add your handling code here:
        if(mothernameTextField.getText().equals("")){
            mothernameTextField.setText("Mother's Name");    
        }
        mothernameTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_mothernameTextFieldFocusLost

    private void motheroccupationTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_motheroccupationTextFieldFocusGained
        // TODO add your handling code here:
        if(motheroccupationTextField.getText().equals("Mother's Occupation")){
            motheroccupationTextField.setText("");   
        }
        motheroccupationTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_motheroccupationTextFieldFocusGained

    private void motheroccupationTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_motheroccupationTextFieldFocusLost
        // TODO add your handling code here:
        if(motheroccupationTextField.getText().equals("")){
            motheroccupationTextField.setText("Mother's Occupation");    
        }
        motheroccupationTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_motheroccupationTextFieldFocusLost

    private String getLastLogin() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    private void canceladdstudentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceladdstudentbuttonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_canceladdstudentbuttonActionPerformed

    private void pinCodeTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinCodeTextFieldFocusGained
        // TODO add your handling code here:
        if(pinCodeTextField.getText().equals("Pincode")){
            pinCodeTextField.setText("");   
        }
        pinCodeTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_pinCodeTextFieldFocusGained

    private void pinCodeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinCodeTextFieldFocusLost
        // TODO add your handling code here:
        if(pinCodeTextField.getText().equals("")){
            pinCodeTextField.setText("Pincode");    
        }
        pinCodeTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_pinCodeTextFieldFocusLost

    private void userIdTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIdTextFieldFocusGained
        // TODO add your handling code here:
        if(userIdTextField.getText().equals("userid same as emailid")){
            userIdTextField.setText("");   
        }
        userIdTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_userIdTextFieldFocusGained

    private void userIdTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIdTextFieldFocusLost
        // TODO add your handling code here:
        if(userIdTextField.getText().equals("")){
            userIdTextField.setText("userid same as emailid");    
        }
        userIdTextField.setForeground(Color.GRAY);
    }//GEN-LAST:event_userIdTextFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        // TODO add your handling code here:
        if(passwordField.getText().equals("Set Password")){
            passwordField.setText("");   
        }
        passwordField.setForeground(Color.BLACK);
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        // TODO add your handling code here:
        if(passwordField.getText().equals("")){
            passwordField.setText("Set Password");    
        }
        passwordField.setForeground(Color.GRAY);
    }//GEN-LAST:event_passwordFieldFocusLost

    private void contactnoTextFieldFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactnoTextFieldFieldFocusGained
        // TODO add your handling code here:
        if(contactnoTextFieldField.getText().equals("Contact Number")){
            contactnoTextFieldField.setText("");   
        }
        contactnoTextFieldField.setForeground(Color.BLACK);
    }//GEN-LAST:event_contactnoTextFieldFieldFocusGained

    private void contactnoTextFieldFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactnoTextFieldFieldFocusLost
        // TODO add your handling code here:
        if(contactnoTextFieldField.getText().equals("")){
            contactnoTextFieldField.setText("Contact Number");    
        }
        contactnoTextFieldField.setForeground(Color.GRAY);
    }//GEN-LAST:event_contactnoTextFieldFieldFocusLost

    
    private byte[] studentPhoto = null;
    
    private void choosefileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choosefileMouseClicked
        // TODO add your handling code here:
        // Open file chooser dialog
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG, JPG, PNG Images", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                // Read image file and set it to studentPic label
                File selectedFile = fileChooser.getSelectedFile();
                String extension = selectedFile.getName().substring(selectedFile.getName().lastIndexOf(".") + 1).toLowerCase();

                // Check if file format is valid
                if (extension.equals("jpg") || extension.equals("jpeg") || extension.equals("png")) {
                    BufferedImage img = ImageIO.read(selectedFile);
                    Image scaledImg = img.getScaledInstance(studentpic.getWidth(), studentpic.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(scaledImg);
                    studentpic.setIcon(icon);

                    // Save image as byte array to studentPhoto variable
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(img, extension, baos);
                    studentPhoto = baos.toByteArray();

                    // Enable remove photo button
                    removePhotoButton.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid file format. Please select a JPEG, JPG, or PNG image.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
            removePhotoButton.setEnabled(true);
        }

    }//GEN-LAST:event_choosefileMouseClicked

    private void removePhotoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removePhotoButtonMouseClicked
        // TODO add your handling code here:
        studentpic.setIcon(null);
        studentPhoto = null;

        // Disable remove photo button
        removePhotoButton.setEnabled(false);
    }//GEN-LAST:event_removePhotoButtonMouseClicked

    private void addstudentbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstudentbuttonMouseClicked
        // TODO add your handling code here:
        
        
        
        String coursecode = courseComboBox.getSelectedItem().toString();
        Integer semoryear = Integer.parseInt(semOrYearComboBox.getSelectedItem().toString());
//        Long registerNo = Long.parseLong(registerNoTextField.getText());
// Generate a random 5-digit number starting from 10000
        Long registerNo = new Random().nextLong(90000) + 10000;
        
        String optionalsubject = OptionalSubject.getSelectedItem().toString();
        String firstname = firstNameTextField.getText();
        String lastname = lastNameTextField.getText();
        String emailid = emailIdTextField.getText();

        String contactnumber = "+" + countrycodeTextField.getText() + " " + contactnoTextFieldField.getText();

        Date date = dobTextField.getDate();
        String dateofbirth = new SimpleDateFormat("dd-MM-yyyy").format(date);

        String gender = genderComboBox.getSelectedItem().toString();
        String address = addressTextField.getText();
        String state = stateTextField.getText();
        String city = cityTextField.getText();
        Integer pincode = Integer.parseInt(pinCodeTextField.getText());
        String fathername = fathernameTextField.getText();
        String fatheroccupation = fatheroccupationTextField.getText();
        String mothername = mothernameTextField.getText();
        String motheroccupation = motheroccupationTextField.getText();
        String lastlogin = getLastLogin();
        String userid = userIdTextField.getText();
        String password = new String(passwordField.getPassword());
        Byte activestatus = 1;

        Date admission = admissionDateTextField.getDate();
        String admissiondate = new SimpleDateFormat("dd-MM-yyyy").format(admission);

        // Get student picture
        byte[] profilepic = null;
        if (studentpic.getIcon() != null) {
            try {
                BufferedImage img = ImageIO.read(new ByteArrayInputStream(profilepic));
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(img, "jpg", baos);
                profilepic = baos.toByteArray();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    if (registerNo != 00000 && registerNo > 10000 && !firstname.equals("") && !lastname.equals("") && 
            !emailid.equals("") && !contactnumber.equals("") && !dateofbirth.equals("") && 
            !address.equals("") && !state.equals("") && !city.equals("") && 
            !pincode.equals("") && !fathername.equals("") && !fatheroccupation.equals("") && 
            !mothername.equals("") && !motheroccupation.equals("") && !userid.equals("") && 
            !password.equals("") && !admissiondate.equals("") && !profilepic.equals("") && 
            !coursecode.equals("") && !semoryear.equals("") && !optionalsubject.equals("") && 
            !gender.equals(""))

            // if the JTextField is not empty then enable the button
        {
            try {
                // Insert student data into the database
                studentdatasql std = new studentdatasql();

                    std.StudentUpdate('i', coursecode, semoryear, registerNo, optionalsubject,
                                firstname, lastname, emailid, contactnumber, dateofbirth, gender, address, state, city,
                                pincode, fathername, fatheroccupation, mothername, motheroccupation, lastlogin, userid,
                                password, activestatus, admissiondate, profilepic);
                    adminhome.CS1.setText("Students : " + Integer.toString(MyFunction.countData("student")));
                    try {
                        managestudent.managestudenttable.setModel(new DefaultTableModel(null, new Object[]
                        {"coursecode", "semoryear", "registerNo", "optionalsubject", "firstname", "lastname", 
                            "emailid", "contactnumber", "dateofbirth", "gender", "address", "state", "city", "pincode", 
                            "fathername", "fatheroccupation", "mothername", "motheroccupation", "lastlogin", "userid",
                                "password", "activestatus", "admissiondate", "profilepic"}));
                        std.studentTable(managestudent.managestudenttable, "");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                
                JOptionPane.showMessageDialog(null, "New Student Added Successfully");
                //disable();
                courseComboBox.setSelectedItem("");
                semOrYearComboBox.setSelectedItem("");
                registerNoTextField.setText("");
                OptionalSubject.getSelectedItem().toString();
                firstNameTextField.setText("");
                lastNameTextField.setText("");
                emailIdTextField.setText("");
                countrycodeTextField.setText("");
                contactnoTextFieldField.setText("");

                dobTextField.setDate(null);

                genderComboBox.getSelectedItem().toString();
                addressTextField.setText("");
                stateTextField.setText("");
                cityTextField.setText("");
                pinCodeTextField.setText("");
                fathernameTextField.setText("");
                fatheroccupationTextField.setText("");
                mothernameTextField.setText("");
                motheroccupationTextField.setText("");

                userIdTextField.setText("");
                passwordField.setText("");

                admissionDateTextField.setDate(null);
                studentpic.setIcon(null);
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }else if (dobTextField.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "No Student From The Future Are Allowed");
        }else {
            JOptionPane.showMessageDialog(this, "Pealse Fillup All Fields", "Error", JOptionPane.ERROR_MESSAGE);
            enable();
        }
    
    
    }//GEN-LAST:event_addstudentbuttonMouseClicked

    private void clearaddstudentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearaddstudentbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearaddstudentbuttonActionPerformed

    private void clearaddstudentbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearaddstudentbuttonMouseClicked
        // TODO add your handling code here:
        
        courseComboBox.setSelectedItem("-------- SELECT COURSE NAME --------");
        courseComboBox.setForeground(Color.GRAY);
        
        semOrYearComboBox.setSelectedItem("-------- SELECT SEM OR YEAR --------");
        semOrYearComboBox.setForeground(Color.GRAY);
        
        registerNoTextField.setText("Registration Number");
        registerNoTextField.setForeground(Color.GRAY);
        
        OptionalSubject.setSelectedItem("-------- SELECT OPTIONAL SUBJECT --------");
        OptionalSubject.setForeground(Color.GRAY);
        
        firstNameTextField.setText("First Name");
        firstNameTextField.setForeground(Color.GRAY);
        
        lastNameTextField.setText("Last Name");
        lastNameTextField.setForeground(Color.GRAY);
        
        emailIdTextField.setText("Email ID");
        emailIdTextField.setForeground(Color.GRAY);
        
        countrycodeTextField.setText("Code");
        countrycodeTextField.setForeground(Color.GRAY);
        
        contactnoTextFieldField.setText("Conatct No");
        contactnoTextFieldField.setForeground(Color.GRAY);
        
        dobTextField.setDate(null);
        dobTextField.setForeground(Color.GRAY);
        
        genderComboBox.setSelectedItem("-------- SELECT GENDER --------");
        genderComboBox.setForeground(Color.GRAY);
        
        addressTextField.setText("");
        addressTextField.setForeground(Color.GRAY);
        
        stateTextField.setText("State");
        stateTextField.setForeground(Color.GRAY);
        
        cityTextField.setText("City");
        cityTextField.setForeground(Color.GRAY);
        
        pinCodeTextField.setText("Pincode");
        pinCodeTextField.setForeground(Color.GRAY);
        
        fathernameTextField.setText("Father's Name");
        fathernameTextField.setForeground(Color.GRAY);
        
        fatheroccupationTextField.setText("Father's Occupation");
        fatheroccupationTextField.setForeground(Color.GRAY);
        
        mothernameTextField.setText("Mother's Name");
        mothernameTextField.setForeground(Color.GRAY);
        
        motheroccupationTextField.setText("Mother's Occupation");
        motheroccupationTextField.setForeground(Color.GRAY);
        
        userIdTextField.setText("UserName/ID");
        userIdTextField.setForeground(Color.GRAY);
        
        passwordField.setText("Password");
        passwordField.setForeground(Color.GRAY);
        
        
        admissionDateTextField.setDate(null);
        admissionDateTextField.setForeground(Color.GRAY);
        
    }//GEN-LAST:event_clearaddstudentbuttonMouseClicked

    private void contactnoTextFieldFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactnoTextFieldFieldKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_contactnoTextFieldFieldKeyTyped

    private void countrycodeTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countrycodeTextFieldKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_countrycodeTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(adminaddstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminaddstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminaddstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminaddstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminaddstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> OptionalSubject;
    private javax.swing.JTextArea addressTextField;
    private com.k33ptoo.components.KButton addstudentbutton;
    private com.toedter.calendar.JDateChooser admissionDateTextField;
    private com.k33ptoo.components.KButton canceladdstudentbutton;
    private javax.swing.JButton choosefile;
    private javax.swing.JTextField cityTextField;
    private com.k33ptoo.components.KButton clearaddstudentbutton;
    private javax.swing.JTextField contactnoTextFieldField;
    private javax.swing.JTextField countrycodeTextField;
    private javax.swing.JComboBox<String> courseComboBox;
    private com.toedter.calendar.JDateChooser dobTextField;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JTextField fathernameTextField;
    private javax.swing.JTextField fatheroccupationTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField mothernameTextField;
    private javax.swing.JTextField motheroccupationTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField pinCodeTextField;
    private javax.swing.JTextField registerNoTextField;
    private javax.swing.JButton removePhotoButton;
    private javax.swing.JComboBox<String> semOrYearComboBox;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JLabel studentpic;
    private javax.swing.JTextField userIdTextField;
    // End of variables declaration//GEN-END:variables
}
