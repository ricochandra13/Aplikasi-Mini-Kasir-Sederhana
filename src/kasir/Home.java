/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import com.mysql.jdbc.Connection;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable.PrintMode;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Home extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;  
    
    PreparedStatement pst;
    String tgl;
    String tglsekarang;
    String wktsekarang;
    DefaultTableModel model;

    public Home() {
        initComponents();
        Koneksi.getKoneksi();  
        tglskrg();
        fnama.requestFocus();
        autoid();
        
        model = (DefaultTableModel) tbtransaction1.getModel();
        select_menuf();select_menud();select_menuds();select_menus();
        tampil_data();AutoNumber();invisible(); tglskrg();
        bNew1.setEnabled(false);bcancel1.setEnabled(false);
        bPay1.setEnabled(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtransaction1 = new javax.swing.JTable();
        bcancel1 = new javax.swing.JButton();
        txtidtr2 = new javax.swing.JLabel();
        bPay1 = new javax.swing.JButton();
        bNew1 = new javax.swing.JButton();
        txtidtr3 = new javax.swing.JLabel();
        txtclock2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtdate2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbfood = new javax.swing.JComboBox<>();
        tffood = new javax.swing.JTextField();
        bOrder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbdrink = new javax.swing.JComboBox<>();
        tfdrink = new javax.swing.JTextField();
        bOrder1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbdessert = new javax.swing.JComboBox<>();
        tfdessert = new javax.swing.JTextField();
        bOrder2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbsnack = new javax.swing.JComboBox<>();
        tfsnack = new javax.swing.JTextField();
        bOrder3 = new javax.swing.JButton();
        txtpfood = new javax.swing.JLabel();
        txtpdrink = new javax.swing.JLabel();
        txtpdessert = new javax.swing.JLabel();
        txtpsnack = new javax.swing.JLabel();
        txtctgry = new javax.swing.JLabel();
        txtctgry1 = new javax.swing.JLabel();
        txtctgry3 = new javax.swing.JLabel();
        txtctgry2 = new javax.swing.JLabel();
        txtidtr4 = new javax.swing.JLabel();
        txtamount1 = new javax.swing.JLabel();
        tfpayment1 = new javax.swing.JTextField();
        tfcashback1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 188, 212));
        jPanel1.setPreferredSize(new java.awt.Dimension(864, 432));

        jPanel2.setBackground(new java.awt.Color(0, 188, 212));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Order"));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nama Pembeli      :");

        fnama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("ID Kasir               :");

        fid.setEditable(false);
        fid.setBackground(new java.awt.Color(204, 204, 255));
        fid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 188, 212));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Informasi"));

        tbtransaction1.setBackground(new java.awt.Color(51, 51, 51));
        tbtransaction1.setFont(new java.awt.Font("Lao UI", 0, 11)); // NOI18N
        tbtransaction1.setForeground(new java.awt.Color(255, 255, 255));
        tbtransaction1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Menu Name", "Category", "Price", "QTY", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tbtransaction1);

        bcancel1.setBackground(new java.awt.Color(102, 102, 102));
        bcancel1.setFont(new java.awt.Font("Lao UI", 0, 12)); // NOI18N
        bcancel1.setForeground(new java.awt.Color(255, 255, 255));
        bcancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Cancel_Subscription_50px.png"))); // NOI18N
        bcancel1.setText("Cancel");
        bcancel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bcancel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bcancel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bcancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancel1ActionPerformed(evt);
            }
        });

        txtidtr2.setFont(new java.awt.Font("Lao UI", 1, 30)); // NOI18N
        txtidtr2.setForeground(new java.awt.Color(51, 51, 51));

        bPay1.setBackground(new java.awt.Color(102, 102, 102));
        bPay1.setFont(new java.awt.Font("Lao UI", 0, 12)); // NOI18N
        bPay1.setForeground(new java.awt.Color(255, 255, 255));
        bPay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Cash__50px.png"))); // NOI18N
        bPay1.setText("Pay");
        bPay1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bPay1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bPay1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bPay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPay1ActionPerformed(evt);
            }
        });

        bNew1.setBackground(new java.awt.Color(102, 102, 102));
        bNew1.setFont(new java.awt.Font("Lao UI", 0, 12)); // NOI18N
        bNew1.setForeground(new java.awt.Color(255, 255, 255));
        bNew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_New_Property_50px.png"))); // NOI18N
        bNew1.setText("New");
        bNew1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bNew1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bNew1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNew1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bPay1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(bcancel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bNew1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(txtidtr3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtidtr2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(bNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPay1)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidtr3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidtr2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        txtclock2.setFont(new java.awt.Font("Lao UI", 0, 14)); // NOI18N
        txtclock2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtclock2.setText("00:00:00");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Clock_20px.png"))); // NOI18N

        txtdate2.setFont(new java.awt.Font("Lao UI", 0, 14)); // NOI18N
        txtdate2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtdate2.setText("000/00/00");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Calendar_20px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lao UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Porridge_80px.png"))); // NOI18N
        jLabel3.setText("Food");

        cbfood.setBackground(new java.awt.Color(102, 102, 102));
        cbfood.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cbfood.setForeground(new java.awt.Color(255, 255, 255));
        cbfood.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbfoodItemStateChanged(evt);
            }
        });

        tffood.setBackground(new java.awt.Color(51, 51, 51));
        tffood.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        tffood.setForeground(new java.awt.Color(255, 255, 255));

        bOrder.setBackground(new java.awt.Color(102, 102, 102));
        bOrder.setFont(new java.awt.Font("Lao UI", 0, 10)); // NOI18N
        bOrder.setForeground(new java.awt.Color(255, 255, 255));
        bOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Coins_20px.png"))); // NOI18N
        bOrder.setText("Order");
        bOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrderActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lao UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Orange_Juice_80px.png"))); // NOI18N
        jLabel6.setText("Drink");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        cbdrink.setBackground(new java.awt.Color(102, 102, 102));
        cbdrink.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cbdrink.setForeground(new java.awt.Color(255, 255, 255));
        cbdrink.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdrinkItemStateChanged(evt);
            }
        });

        tfdrink.setBackground(new java.awt.Color(51, 51, 51));
        tfdrink.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        tfdrink.setForeground(new java.awt.Color(255, 255, 255));

        bOrder1.setBackground(new java.awt.Color(102, 102, 102));
        bOrder1.setFont(new java.awt.Font("Lao UI", 0, 10)); // NOI18N
        bOrder1.setForeground(new java.awt.Color(255, 255, 255));
        bOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Coins_20px.png"))); // NOI18N
        bOrder1.setText("Order");
        bOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrder1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lao UI", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Cupcake_80px_1.png"))); // NOI18N
        jLabel7.setText("Dessert");

        cbdessert.setBackground(new java.awt.Color(102, 102, 102));
        cbdessert.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cbdessert.setForeground(new java.awt.Color(255, 255, 255));
        cbdessert.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdessertItemStateChanged(evt);
            }
        });

        tfdessert.setBackground(new java.awt.Color(51, 51, 51));
        tfdessert.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        tfdessert.setForeground(new java.awt.Color(255, 255, 255));

        bOrder2.setBackground(new java.awt.Color(102, 102, 102));
        bOrder2.setFont(new java.awt.Font("Lao UI", 0, 10)); // NOI18N
        bOrder2.setForeground(new java.awt.Color(255, 255, 255));
        bOrder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Coins_20px.png"))); // NOI18N
        bOrder2.setText("Order");
        bOrder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrder2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lao UI", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Hamburger_80px.png"))); // NOI18N
        jLabel9.setText("Snack");

        cbsnack.setBackground(new java.awt.Color(102, 102, 102));
        cbsnack.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cbsnack.setForeground(new java.awt.Color(255, 255, 255));
        cbsnack.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbsnackItemStateChanged(evt);
            }
        });

        tfsnack.setBackground(new java.awt.Color(51, 51, 51));
        tfsnack.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        tfsnack.setForeground(new java.awt.Color(255, 255, 255));

        bOrder3.setBackground(new java.awt.Color(102, 102, 102));
        bOrder3.setFont(new java.awt.Font("Lao UI", 0, 10)); // NOI18N
        bOrder3.setForeground(new java.awt.Color(255, 255, 255));
        bOrder3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prjimg/icons8_Coins_20px.png"))); // NOI18N
        bOrder3.setText("Order");
        bOrder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrder3ActionPerformed(evt);
            }
        });

        txtpfood.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        txtpfood.setForeground(new java.awt.Color(51, 51, 51));

        txtpdrink.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        txtpdrink.setForeground(new java.awt.Color(51, 51, 51));

        txtpdessert.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        txtpdessert.setForeground(new java.awt.Color(51, 51, 51));

        txtpsnack.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        txtpsnack.setForeground(new java.awt.Color(51, 51, 51));

        txtidtr4.setFont(new java.awt.Font("Lao UI", 1, 30)); // NOI18N
        txtidtr4.setForeground(new java.awt.Color(51, 51, 51));

        txtamount1.setFont(new java.awt.Font("DialogInput", 0, 30)); // NOI18N
        txtamount1.setForeground(new java.awt.Color(51, 51, 51));

        tfpayment1.setBackground(new java.awt.Color(51, 51, 51));
        tfpayment1.setFont(new java.awt.Font("DialogInput", 0, 30)); // NOI18N
        tfpayment1.setForeground(new java.awt.Color(255, 255, 255));
        tfpayment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpayment1ActionPerformed(evt);
            }
        });

        tfcashback1.setEditable(false);
        tfcashback1.setBackground(new java.awt.Color(51, 51, 51));
        tfcashback1.setFont(new java.awt.Font("DialogInput", 0, 30)); // NOI18N
        tfcashback1.setForeground(new java.awt.Color(255, 255, 255));
        tfcashback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcashback1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tffood, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bOrder))
                                            .addComponent(cbfood, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtpfood, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtctgry, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cbdrink, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfdrink, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bOrder1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtpdrink, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtctgry1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtclock2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbdessert, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfdessert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bOrder2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtpdessert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtctgry3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfsnack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bOrder3))
                                            .addComponent(cbsnack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtpsnack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtctgry2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfpayment1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfcashback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidtr4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtamount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtclock2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbfood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbdrink)
                    .addComponent(cbdessert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbsnack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tffood, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdrink, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdessert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsnack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpfood, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpdrink, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpdessert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpsnack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtctgry, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtctgry1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtctgry3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtctgry2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfpayment1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcashback1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidtr4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtamount1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Admin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Keluar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void clear(){
        cbfood.addItem("Food"); tffood.setText("");
        cbdrink.addItem("Drink"); tfdrink.setText("");
        cbdessert.addItem("Dessert"); tfdessert.setText("");
        cbsnack.addItem("Snack"); tfsnack.setText("");
    }    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    private void bNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNew1ActionPerformed
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        txtamount1.setText(""); tfcashback1.setText(""); tfpayment1.setText("");
        cbfood.setSelectedItem("Food"); tffood.setText(""); txtpfood.setText("");
        cbdrink.addItem("Drink"); tfdrink.setText("");txtpdessert.setText("");
        cbdessert.addItem("Dessert"); tfdessert.setText("");txtpdrink.setText("");
        cbsnack.addItem("Snack"); tfsnack.setText("");txtpsnack.setText(""); 
        bPay1.setEnabled(false);bcancel1.setEnabled(false);bNew1.setEnabled(false);
        bOrder.setEnabled(true); bOrder1.setEnabled(true); 
        bOrder2.setEnabled(true);bOrder3.setEnabled(true);
        AutoNumber();
    }//GEN-LAST:event_bNew1ActionPerformed

    private void bPay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPay1ActionPerformed
        int amount = Integer.parseInt(txtamount1.getText());
        int payment = Integer.parseInt(tfpayment1.getText());
        int cashback = (payment-amount);
        if(cashback <0 ){
            JOptionPane.showMessageDialog(this,"Uangmu kurang.");
        }else{
            tfcashback1.setText(String.valueOf(cashback));
            JOptionPane.showMessageDialog(this,"Ini kembalianmu\n"+"Rp."+cashback);
            bNew1.setEnabled(true);
            con = Koneksi.getKoneksi();
            String sql = "UPDATE detail_transaction SET amount = '"+txtamount1.getText()+"', payment = '"+tfpayment1.getText()+"', cashback = '"+tfcashback1.getText()+"' WHERE kode_tr = '"+txtidtr4.getText()+"'";
            try {
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                bcancel1.setEnabled(false);bPay1.setEnabled(false);
                bOrder.setEnabled(false); bOrder1.setEnabled(false); 
                bOrder2.setEnabled(false);bOrder3.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Silahkan masukkan uangmu!");
            }
        }
    }//GEN-LAST:event_bPay1ActionPerformed

    private void bcancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancel1ActionPerformed
        con = Koneksi.getKoneksi();
        int row = tbtransaction1.getSelectedRow();
        try {
            Statement st = con.createStatement();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Choose Table");
            } else {
                int harga = Integer.parseInt((String) tbtransaction1.getModel().getValueAt(row, 5));
                int total = Integer.parseInt(txtamount1.getText());
                String sql = "DELETE FROM tr_transaction WHERE id_transaction = '" + tbtransaction1.getModel().getValueAt(row, 0) + "'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Order Canceled");
                txtamount1.setText(String.valueOf(total - harga));
                tampil_data();
                clear();
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_bcancel1ActionPerformed

    private void cbfoodItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbfoodItemStateChanged
        con = Koneksi.getKoneksi();
        String sql = "SELECT * FROM ms_food WHERE nm_food = '" + cbfood.getSelectedItem().toString() + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                txtpfood.setText(rs.getString("prc_food"));
                txtctgry.setText(rs.getString("ktgry_food"));

            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbfoodItemStateChanged

    public void simpan_no() {
        con = Koneksi.getKoneksi();
        String sql1 = "DELETE FROM detail_transaction WHERE kode_tr = '"+txtidtr4.getText()+"'";
        String sql = "INSERT INTO detail_transaction (kode_tr,unm_user,unm_client,dt) VALUES('" + txtidtr4.getText() + "','" + fid.getText() + "','" + fnama.getText() + "','" + tglsekarang + "')";
        try {
            Statement st = con.createStatement();
             st.executeUpdate(sql1);
            st.executeUpdate(sql);
        } catch (Exception e) {
        }
    }
    
    private void bOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrderActionPerformed
        con = Koneksi.getKoneksi();
        if (tffood.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah yang ingin dibeli");
        } else if(fnama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan nama pembeli");
        } else {
            int total = Integer.parseInt(txtpfood.getText()) * Integer.parseInt(tffood.getText());
            int simpan2 = 0;
            if (txtamount1.getText().equals("")) {
                simpan2 = 0;
            } else {
                simpan2 = Integer.valueOf(txtamount1.getText());
            }
            try {
                String sql2 = "INSERT INTO tr_transaction (kode_tr,Menu,Category,Price,Qty,Amount,dt) VALUES"
                + "('" + txtidtr4.getText() + "','" + cbfood.getSelectedItem().toString() + "','" + txtctgry.getText() + "',"
                + "'" + txtpfood.getText() + "','" + tffood.getText() + "','" + total + "','" + txtdate2.getText() + "')";

                Statement st = con.createStatement();
                st.executeUpdate(sql2);
                simpan_no();
                txtamount1.setText(String.valueOf(simpan2 + total));
                JOptionPane.showMessageDialog(this, "Order Success");
                tampil_data();
                bcancel1.setEnabled(true); bPay1.setEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bOrderActionPerformed

private void tampil_data() {
        con = Koneksi.getKoneksi();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        TableColumn column;
        tbtransaction1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS); 
        column = tbtransaction1.getColumnModel().getColumn(0); 
        column.setPreferredWidth(40);
        column = tbtransaction1.getColumnModel().getColumn(1); 
        column.setPreferredWidth(200);
        column = tbtransaction1.getColumnModel().getColumn(2); 
        column.setPreferredWidth(80);
        column = tbtransaction1.getColumnModel().getColumn(3); 
        column.setPreferredWidth(100);
        column = tbtransaction1.getColumnModel().getColumn(4); 
        column.setPreferredWidth(40);
        column = tbtransaction1.getColumnModel().getColumn(5); 
        column.setPreferredWidth(100);
        try {
            Statement st = con.createStatement();
            String sql = "SELECT `id_transaction`,`Menu`,`Category`,`Price`,`Qty`,`Amount` FROM tr_transaction WHERE kode_tr = '" + txtidtr4.getText() + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Object[] o;
                o = new Object[6];
                o[0] = rs.getString(1);
                o[1] = rs.getString(2);
                o[2] = rs.getString(3);
                o[3] = rs.getString(4);
                o[4] = rs.getString(5);
                o[5] = rs.getString(6);
                model.addRow(o);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    private void cbdrinkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbdrinkItemStateChanged
        con = Koneksi.getKoneksi();
        String sql = "SELECT * FROM ms_food WHERE nm_food = '" + cbdrink.getSelectedItem().toString() + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                txtpdrink.setText(rs.getString("prc_food"));
                txtctgry1.setText(rs.getString("ktgry_food"));

            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbdrinkItemStateChanged

    private void bOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrder1ActionPerformed
        con = Koneksi.getKoneksi();
        if (tfdrink.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please insert amount");
        } else {
            int total = Integer.parseInt(txtpdrink.getText()) * Integer.parseInt(tfdrink.getText());
            int simpan2 = 0;
            if (txtamount1.getText().equals("")) {
                simpan2 = 0;
            } else {
                simpan2 = Integer.valueOf(txtamount1.getText());
            }
            try {
                String sql2 = "INSERT INTO tr_transaction (kode_tr,Menu,Category,Price,Qty,Amount,dt) VALUES"
                + "('" + txtidtr4.getText() + "','" + cbdrink.getSelectedItem().toString() + "','" + txtctgry1.getText() + "',"
                + "'" + txtpdrink.getText() + "','" + tfdrink.getText() + "','" + total + "','" + txtdate2.getText() + "')";

                Statement st = con.createStatement();
                st.executeUpdate(sql2);
                simpan_no();
                txtamount1.setText(String.valueOf(simpan2 + total));
                JOptionPane.showMessageDialog(this, "Order Success");
                tampil_data();
                bcancel1.setEnabled(true);
                bPay1.setEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bOrder1ActionPerformed

    private void cbdessertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbdessertItemStateChanged
        con = Koneksi.getKoneksi();
        String sql = "SELECT * FROM ms_food WHERE nm_food = '" + cbdessert.getSelectedItem().toString() + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                txtpdessert.setText(rs.getString("prc_food"));
                txtctgry3.setText(rs.getString("ktgry_food"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbdessertItemStateChanged

    private void bOrder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrder2ActionPerformed
        con = Koneksi.getKoneksi();
        if (tfdessert.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please insert amount");
        } else {
            int total = Integer.parseInt(txtpdessert.getText()) * Integer.parseInt(tfdessert.getText());
            int simpan2 = 0;
            if (txtamount1.getText().equals("")) {
                simpan2 = 0;
            } else {
                simpan2 = Integer.valueOf(txtamount1.getText());
            }
            try {
                String sql2 = "INSERT INTO tr_transaction (kode_tr,Menu,Category,Price,Qty,Amount,dt) VALUES"
                + "('" + txtidtr4.getText() + "','" + cbdessert.getSelectedItem().toString() + "','" + txtctgry3.getText() + "',"
                + "'" + txtpdessert.getText() + "','" + tfdessert.getText() + "','" + total + "','" + txtdate2.getText() + "')";

                Statement st = con.createStatement();
                st.executeUpdate(sql2);
                simpan_no();
                txtamount1.setText(String.valueOf(simpan2 + total));
                JOptionPane.showMessageDialog(this, "Order Success");
                tampil_data();
                bcancel1.setEnabled(true);
                bPay1.setEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bOrder2ActionPerformed

    private void cbsnackItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbsnackItemStateChanged
        con = Koneksi.getKoneksi();
        String sql = "SELECT * FROM ms_food WHERE nm_food = '" + cbsnack.getSelectedItem().toString() + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                txtpsnack.setText(rs.getString("prc_food"));
                txtctgry2.setText(rs.getString("ktgry_food"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbsnackItemStateChanged

    private void bOrder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrder3ActionPerformed
        con = Koneksi.getKoneksi();
        if (tfsnack.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please insert amount");
        } else {
            int total = Integer.parseInt(txtpsnack.getText()) * Integer.parseInt(tfsnack.getText());
            int simpan2 = 0;
            if (txtamount1.getText().equals("")) {
                simpan2 = 0;
            } else {
                simpan2 = Integer.valueOf(txtamount1.getText());
            }
            try {
                String sql2 = "INSERT INTO tr_transaction (kode_tr,Menu,Category,Price,Qty,Amount,dt) VALUES"
                + "('" + txtidtr4.getText() + "','" + cbsnack.getSelectedItem().toString() + "','" + txtctgry2.getText() + "',"
                + "'" + txtpsnack.getText() + "','" + tfsnack.getText() + "','" + total + "','" + txtdate2.getText() + "')";

                Statement st = con.createStatement();
                st.executeUpdate(sql2);
                simpan_no();
                txtamount1.setText(String.valueOf(simpan2 + total));
                JOptionPane.showMessageDialog(this, "Order Success");
                tampil_data();
                bcancel1.setEnabled(true);
                bPay1.setEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bOrder3ActionPerformed

    private void tfpayment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpayment1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpayment1ActionPerformed

    private void tfcashback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcashback1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcashback1ActionPerformed
  
    
    private void autoid(){
       try{
            con = Koneksi.getKoneksi();
            String sql = "SELECT * FROM admin";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                String kode = rs.getString("nama");
                fid.setText(kode);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }      
    }
 
  
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }    
    
    private void tglskrg() {
        Thread t2 = new Thread() {
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    tglsekarang = (cal.get(Calendar.YEAR) + "-"
                            + (cal.get(Calendar.MONTH) + 1) + "-"
                            + cal.get(Calendar.DATE));
                    txtdate2.setText(tglsekarang);
                     wktsekarang = (cal.get(Calendar.HOUR)+":"
                                +cal.get(Calendar.MINUTE)+":"
                                +cal.get(Calendar.SECOND));
                     txtclock2.setText(wktsekarang);
                    
                }
            };
        };
        t2.start();
    }
    
    public void select_menud() {
        cbdrink.addItem("Drink");
        try {
            con = Koneksi.getKoneksi();
            String sql = "SELECT * FROM ms_food WHERE ktgry_food = 'Drink'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                cbdrink.addItem(rs.getString("nm_food"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void select_menuds() {
        cbdessert.addItem("Dessert");
        try {
            con = Koneksi.getKoneksi();
            String sql = "SELECT * FROM ms_food WHERE ktgry_food = 'Dessert'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                cbdessert.addItem(rs.getString("nm_food"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    public void select_menuf() {
        cbfood.addItem("Food");
        try {
            con = Koneksi.getKoneksi();
            String sql = "SELECT * FROM ms_food WHERE ktgry_food = 'Food'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                cbfood.addItem(rs.getString("nm_food"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void select_menus() {
        cbsnack.addItem("Snack");
        try {
            con = Koneksi.getKoneksi();
            String sql = "SELECT * FROM ms_food WHERE ktgry_food = 'Snack'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                cbsnack.addItem(rs.getString("nm_food"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AutoNumber() {
        try {
            con = Koneksi.getKoneksi();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM detail_transaction ORDER BY kode_tr DESC";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String kode = rs.getString("kode_tr").substring(3);
                String AN = "" + (Integer.parseInt(kode) + 1);
                String Nol = "";

                if (AN.length() == 1) {
                    Nol = "00";
                } else if (AN.length() == 2) {
                    Nol = "0";
                } else if (AN.length() == 3) {
                    Nol = "";
                }
                txtidtr4.setText("KT" + Nol + AN);
            } else {
                txtidtr4.setText("KT001");
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void invisible() {
        txtctgry.setVisible(false);
        txtctgry1.setVisible(false);
        txtctgry2.setVisible(false);
        txtctgry3.setVisible(false);
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bNew1;
    private javax.swing.JButton bOrder;
    private javax.swing.JButton bOrder1;
    private javax.swing.JButton bOrder2;
    private javax.swing.JButton bOrder3;
    private javax.swing.JButton bPay1;
    private javax.swing.JButton bcancel1;
    private javax.swing.JComboBox<String> cbdessert;
    private javax.swing.JComboBox<String> cbdrink;
    private javax.swing.JComboBox<String> cbfood;
    private javax.swing.JComboBox<String> cbsnack;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbtransaction1;
    private javax.swing.JTextField tfcashback1;
    private javax.swing.JTextField tfdessert;
    private javax.swing.JTextField tfdrink;
    private javax.swing.JTextField tffood;
    private javax.swing.JTextField tfpayment1;
    private javax.swing.JTextField tfsnack;
    private javax.swing.JLabel txtamount1;
    private javax.swing.JLabel txtclock2;
    private javax.swing.JLabel txtctgry;
    private javax.swing.JLabel txtctgry1;
    private javax.swing.JLabel txtctgry2;
    private javax.swing.JLabel txtctgry3;
    private javax.swing.JLabel txtdate2;
    private javax.swing.JLabel txtidtr2;
    private javax.swing.JLabel txtidtr3;
    private javax.swing.JLabel txtidtr4;
    private javax.swing.JLabel txtpdessert;
    private javax.swing.JLabel txtpdrink;
    private javax.swing.JLabel txtpfood;
    private javax.swing.JLabel txtpsnack;
    // End of variables declaration//GEN-END:variables

    private void setsize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}