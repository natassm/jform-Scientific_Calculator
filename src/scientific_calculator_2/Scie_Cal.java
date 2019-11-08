
package scientific_calculator_2;

/**
 *
 * @author Natasha
 */
public class Scie_Cal extends javax.swing.JFrame {
    private String operations;
   
    public Scie_Cal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_2 = new javax.swing.JButton();
        btn_comma = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_sqrt = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_minus = new javax.swing.JButton();
        btn_times = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_log = new javax.swing.JButton();
        btn_sin = new javax.swing.JButton();
        btn_bin = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_tan = new javax.swing.JButton();
        btn_sinh = new javax.swing.JButton();
        btn_rund = new javax.swing.JButton();
        btn_cosh = new javax.swing.JButton();
        btn_tanh = new javax.swing.JButton();
        btn_b = new javax.swing.JButton();
        btn_octal = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_backspace = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_5 = new javax.swing.JButton();
        btn_plusminus = new javax.swing.JButton();
        btn_a = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_phi = new javax.swing.JButton();
        btn_equals = new javax.swing.JButton();
        btn_hex = new javax.swing.JButton();
        tf_result = new javax.swing.JTextField();
        btn_cbr = new javax.swing.JButton();
        btn_percent = new javax.swing.JButton();
        btn_log10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_2.setBackground(new java.awt.Color(204, 204, 255));
        btn_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_comma.setBackground(new java.awt.Color(204, 204, 255));
        btn_comma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_comma.setText(".");
        btn_comma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commaActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(204, 204, 255));
        btn_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(204, 204, 255));
        btn_6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_6.setText("6");
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(204, 204, 255));
        btn_9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_sqrt.setBackground(new java.awt.Color(204, 204, 255));
        btn_sqrt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_sqrt.setText("√");
        btn_sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sqrtActionPerformed(evt);
            }
        });

        btn_plus.setBackground(new java.awt.Color(204, 204, 255));
        btn_plus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_plus.setText("+");
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });

        btn_minus.setBackground(new java.awt.Color(204, 204, 255));
        btn_minus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_minus.setText("-");
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });

        btn_times.setBackground(new java.awt.Color(204, 204, 255));
        btn_times.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_times.setText("x");
        btn_times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timesActionPerformed(evt);
            }
        });

        btn_divide.setBackground(new java.awt.Color(204, 204, 255));
        btn_divide.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_divide.setText(":");
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });

        btn_log.setBackground(new java.awt.Color(255, 204, 255));
        btn_log.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_log.setForeground(new java.awt.Color(255, 0, 255));
        btn_log.setText("log");
        btn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logActionPerformed(evt);
            }
        });

        btn_sin.setBackground(new java.awt.Color(204, 255, 204));
        btn_sin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_sin.setForeground(new java.awt.Color(0, 204, 153));
        btn_sin.setText("sin");
        btn_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinActionPerformed(evt);
            }
        });

        btn_bin.setBackground(new java.awt.Color(255, 204, 204));
        btn_bin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_bin.setForeground(new java.awt.Color(255, 0, 0));
        btn_bin.setText("bin");
        btn_bin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_binActionPerformed(evt);
            }
        });

        btn_cos.setBackground(new java.awt.Color(204, 255, 204));
        btn_cos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_cos.setForeground(new java.awt.Color(0, 204, 0));
        btn_cos.setText("cos");
        btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosActionPerformed(evt);
            }
        });

        btn_tan.setBackground(new java.awt.Color(204, 204, 255));
        btn_tan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_tan.setForeground(new java.awt.Color(0, 51, 255));
        btn_tan.setText("tan");
        btn_tan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanActionPerformed(evt);
            }
        });

        btn_sinh.setBackground(new java.awt.Color(204, 255, 204));
        btn_sinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_sinh.setForeground(new java.awt.Color(0, 204, 153));
        btn_sinh.setText("sinh");
        btn_sinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinhActionPerformed(evt);
            }
        });

        btn_rund.setBackground(new java.awt.Color(204, 255, 255));
        btn_rund.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_rund.setForeground(new java.awt.Color(0, 204, 204));
        btn_rund.setText("Rund");
        btn_rund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rundActionPerformed(evt);
            }
        });

        btn_cosh.setBackground(new java.awt.Color(204, 255, 204));
        btn_cosh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_cosh.setForeground(new java.awt.Color(0, 204, 0));
        btn_cosh.setText("cosh");
        btn_cosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coshActionPerformed(evt);
            }
        });

        btn_tanh.setBackground(new java.awt.Color(204, 204, 255));
        btn_tanh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_tanh.setForeground(new java.awt.Color(0, 51, 255));
        btn_tanh.setText("tanh");
        btn_tanh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_tanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanhActionPerformed(evt);
            }
        });

        btn_b.setBackground(new java.awt.Color(255, 204, 204));
        btn_b.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_b.setForeground(new java.awt.Color(255, 0, 0));
        btn_b.setText("x^2");
        btn_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bActionPerformed(evt);
            }
        });

        btn_octal.setBackground(new java.awt.Color(255, 204, 204));
        btn_octal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_octal.setForeground(new java.awt.Color(204, 0, 0));
        btn_octal.setText("octal");
        btn_octal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_octalActionPerformed(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(204, 204, 255));
        btn_0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_backspace.setBackground(new java.awt.Color(204, 204, 255));
        btn_backspace.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_backspace.setText("←");
        btn_backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backspaceActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(204, 204, 255));
        btn_7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(204, 204, 255));
        btn_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_1.setBackground(new java.awt.Color(204, 204, 255));
        btn_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(204, 204, 255));
        btn_clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_clear.setText("C");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(204, 204, 255));
        btn_8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        jLabel5.setText("FNH Calculator");

        btn_5.setBackground(new java.awt.Color(204, 204, 255));
        btn_5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_5.setText("5");
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_plusminus.setBackground(new java.awt.Color(204, 204, 255));
        btn_plusminus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_plusminus.setText("±");
        btn_plusminus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusminusActionPerformed(evt);
            }
        });

        btn_a.setBackground(new java.awt.Color(255, 204, 204));
        btn_a.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_a.setForeground(new java.awt.Color(255, 0, 0));
        btn_a.setText("x^3");
        btn_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aActionPerformed(evt);
            }
        });

        btn_c.setBackground(new java.awt.Color(255, 204, 204));
        btn_c.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_c.setForeground(new java.awt.Color(255, 0, 0));
        btn_c.setText("x^y");
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });

        btn_phi.setBackground(new java.awt.Color(255, 204, 204));
        btn_phi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_phi.setForeground(new java.awt.Color(255, 0, 0));
        btn_phi.setText("π");
        btn_phi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_phiActionPerformed(evt);
            }
        });

        btn_equals.setBackground(new java.awt.Color(204, 204, 255));
        btn_equals.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_equals.setText("=");
        btn_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalsActionPerformed(evt);
            }
        });

        btn_hex.setBackground(new java.awt.Color(255, 204, 204));
        btn_hex.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_hex.setForeground(new java.awt.Color(255, 0, 0));
        btn_hex.setText("hex");
        btn_hex.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_hex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hexActionPerformed(evt);
            }
        });

        tf_result.setEditable(false);
        tf_result.setBackground(new java.awt.Color(255, 255, 255));
        tf_result.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_result.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_resultActionPerformed(evt);
            }
        });
        tf_result.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_resultKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_resultKeyTyped(evt);
            }
        });

        btn_cbr.setBackground(new java.awt.Color(204, 255, 255));
        btn_cbr.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_cbr.setForeground(new java.awt.Color(0, 204, 204));
        btn_cbr.setText("3√X");
        btn_cbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cbrActionPerformed(evt);
            }
        });

        btn_percent.setBackground(new java.awt.Color(204, 255, 255));
        btn_percent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_percent.setForeground(new java.awt.Color(0, 204, 204));
        btn_percent.setText("%");
        btn_percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_percentActionPerformed(evt);
            }
        });

        btn_log10.setBackground(new java.awt.Color(255, 204, 255));
        btn_log10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_log10.setForeground(new java.awt.Color(255, 0, 255));
        btn_log10.setText("log10");
        btn_log10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log10ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn_comma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_result)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7)
                                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btn_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn_backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(204, 204, 204)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btn_times, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn_divide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(btn_bin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btn_hex, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_octal))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_b, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_a, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_phi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(61, 61, 61)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_log10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_tanh)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_rund))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(btn_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_cbr, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel5))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(tf_result, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_log10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_rund, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cbr, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_times, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_comma, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_a, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_b, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_phi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_octal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hex, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        String tfresult = tf_result.getText() + btn_2.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_commaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commaActionPerformed
        if (!tf_result.getText().contains("."))
        {
            tf_result.setText(tf_result.getText() + btn_comma.getText());  
        }
    }//GEN-LAST:event_btn_commaActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        String tfresult = tf_result.getText() + btn_3.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        String tfresult = tf_result.getText() + btn_6.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        String tfresult = tf_result.getText() + btn_9.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sqrtActionPerformed
     
    }//GEN-LAST:event_btn_sqrtActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        String first_num = tf_result.getText();
        String sec_num = tf_result.getText();
        
        int firstnum = Integer.parseInt(sec_num);
        int secondnum = Integer.parseInt(sec_num);
        
        Operation op = new Operation();
        op.setAngka_pertama(angka_pertama);
        op.setAngka_kedua(angka_kedua);
        
        tf_result.setText(null);
        
              
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minusActionPerformed
        String first_num = tf_result.getText();
        double firstnum = Double.parseDouble(first_num);
        
        Operation op = new Operation();
        op.setFirstnum(firstnum);
        
        tf_result.setText(null);
        
        operations = ("-"); 
    }//GEN-LAST:event_btn_minusActionPerformed

    private void btn_timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timesActionPerformed
        String first_num = tf_result.getText();
        double firstnum = Double.parseDouble(first_num);
        
        Operation op = new Operation();
        op.setFirstnum(firstnum);
        
        tf_result.setText(null);
        
        operations = ("*"); 
    }//GEN-LAST:event_btn_timesActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        String first_num = tf_result.getText();
        double firstnum = Double.parseDouble(first_num);
        
        Operation op = new Operation();
        op.setFirstnum(firstnum);
        
        tf_result.setText(null);
        
        operations = ("/"); 
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logActionPerformed

    }//GEN-LAST:event_btn_logActionPerformed

    private void btn_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinActionPerformed
        
    }//GEN-LAST:event_btn_sinActionPerformed

    private void btn_binActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_binActionPerformed
   
    }//GEN-LAST:event_btn_binActionPerformed

    private void btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosActionPerformed
      
    }//GEN-LAST:event_btn_cosActionPerformed

    private void btn_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanActionPerformed

    }//GEN-LAST:event_btn_tanActionPerformed

    private void btn_sinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinhActionPerformed
     
    }//GEN-LAST:event_btn_sinhActionPerformed

    private void btn_rundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rundActionPerformed
 
    }//GEN-LAST:event_btn_rundActionPerformed

    private void btn_coshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coshActionPerformed
   
    }//GEN-LAST:event_btn_coshActionPerformed

    private void btn_tanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanhActionPerformed
   
    }//GEN-LAST:event_btn_tanhActionPerformed

    private void btn_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bActionPerformed
     
    }//GEN-LAST:event_btn_bActionPerformed

    private void btn_octalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_octalActionPerformed
       
    }//GEN-LAST:event_btn_octalActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        String tfresult = tf_result.getText() + btn_0.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backspaceActionPerformed
     
    }//GEN-LAST:event_btn_backspaceActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        String tfresult = tf_result.getText() + btn_7.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        String tfresult = tf_result.getText() + btn_4.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        String tfresult = tf_result.getText() + btn_1.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        String tfresult = tf_result.getText() + btn_8.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        String tfresult = tf_result.getText() + btn_5.getText();
        tf_result.setText(tfresult);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusminusActionPerformed
     
    }//GEN-LAST:event_btn_plusminusActionPerformed

    private void btn_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aActionPerformed
     
    }//GEN-LAST:event_btn_aActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
      
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_phiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_phiActionPerformed
     
    }//GEN-LAST:event_btn_phiActionPerformed

    private void btn_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalsActionPerformed
        Operation op = new Operation();
        
        if (operations == "+")
        {
            
            op.secondnum = Double.parseDouble(tf_result.getText());
        
            Hitung hitung = new Hitung();
            String result = hitung.plus(op);
            
            tf_result.setText(result);
        }
         else if (operations == "-")
        {
            Hitung hitung = new Hitung();
            String result = hitung.minus(op);
            
            tf_result.setText(result);
        }
         
         else if (operations == "*")
        { 
            Hitung hitung = new Hitung();
            String result = hitung.times(op);
            
            tf_result.setText(result);
        }
                  else if (operations == "%")
        {
            Hitung hitung = new Hitung();
            String result = hitung.divide(op);
            
            tf_result.setText(result);
        }
         
    }//GEN-LAST:event_btn_equalsActionPerformed

    private void btn_hexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hexActionPerformed
       
    }//GEN-LAST:event_btn_hexActionPerformed

    private void tf_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_resultActionPerformed
      
    }//GEN-LAST:event_tf_resultActionPerformed

    private void tf_resultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_resultKeyPressed
        
    }//GEN-LAST:event_tf_resultKeyPressed

    private void tf_resultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_resultKeyTyped
        
    }//GEN-LAST:event_tf_resultKeyTyped

    private void btn_cbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cbrActionPerformed
       
    }//GEN-LAST:event_btn_cbrActionPerformed

    private void btn_percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_percentActionPerformed
      
    }//GEN-LAST:event_btn_percentActionPerformed

    private void btn_log10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log10ActionPerformed
      
    }//GEN-LAST:event_btn_log10ActionPerformed

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
            java.util.logging.Logger.getLogger(Scie_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scie_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scie_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scie_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scie_Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_a;
    private javax.swing.JButton btn_b;
    private javax.swing.JButton btn_backspace;
    private javax.swing.JButton btn_bin;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_cbr;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_comma;
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_cosh;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_equals;
    private javax.swing.JButton btn_hex;
    private javax.swing.JButton btn_log;
    private javax.swing.JButton btn_log10;
    private javax.swing.JButton btn_minus;
    private javax.swing.JButton btn_octal;
    private javax.swing.JButton btn_percent;
    private javax.swing.JButton btn_phi;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_plusminus;
    private javax.swing.JButton btn_rund;
    private javax.swing.JButton btn_sin;
    private javax.swing.JButton btn_sinh;
    private javax.swing.JButton btn_sqrt;
    private javax.swing.JButton btn_tan;
    private javax.swing.JButton btn_tanh;
    private javax.swing.JButton btn_times;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField tf_result;
    // End of variables declaration//GEN-END:variables
}
