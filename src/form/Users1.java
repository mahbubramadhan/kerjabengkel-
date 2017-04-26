
package form;

import db.Parameter;
import db.ResultSetTableModel;
import db.db_connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Users1 extends javax.swing.JFrame {
    ResultSet rs;
    db_connection db;
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label4 = new usu.widget.Label();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        label7 = new usu.widget.Label();
        label1 = new usu.widget.Label();
        cmb_categories = new javax.swing.JComboBox();
        btn_search = new usu.widget.ButtonGlass();
        btn_add = new usu.widget.ButtonGlass();
        btn_edit = new usu.widget.ButtonGlass();
        btn_delete = new usu.widget.ButtonGlass();
        btn_refresh = new usu.widget.ButtonGlass();
        label9 = new usu.widget.Label();
        user_id = new usu.widget.TextBox();
        label3 = new usu.widget.Label();
        username = new usu.widget.TextBox();
        label5 = new usu.widget.Label();
        password = new usu.widget.TextBox();
        label6 = new usu.widget.Label();
        cmb_type = new javax.swing.JComboBox();
        txt_search = new usu.widget.TextBox();
        btn_edit1 = new usu.widget.ButtonGlass();

        label4.setText("PASSWORD:");
        label4.setFont(new java.awt.Font("Ubahn", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar User Restoran Jogja Damai");

        panelGlass1.setAlpha(1.0F);
        panelGlass1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/background user new.png"))); // NOI18N
        panelGlass1.setRound(false);

        tbl_users.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        tbl_users.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "User ID", "Username", "Password", "Type"
            }
        ));
        tbl_users.setAlignmentX(1.0F);
        tbl_users.setAlignmentY(1.0F);
        tbl_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_users.setFocusable(false);
        tbl_users.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_users.setOpaque(false);
        tbl_users.setPreferredSize(new java.awt.Dimension(600, 64));
        tbl_users.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tbl_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_usersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_users);

        label7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText("User Data");
        label7.setFont(new java.awt.Font("BN Dragon", 1, 24)); // NOI18N

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Search Categories:");
        label1.setFont(new java.awt.Font("Ubahn", 1, 18)); // NOI18N

        cmb_categories.setFont(new java.awt.Font("Ubahn", 0, 18)); // NOI18N
        cmb_categories.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User ID", "Username", "Password", "Type" }));
        cmb_categories.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        cmb_categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoriesActionPerformed(evt);
            }
        });

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_search.png"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/TAMBAH2.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit2 - Copy.png"))); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HAPUS2.png"))); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh2.png"))); // NOI18N
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("USER ID:");
        label9.setFont(new java.awt.Font("Ubahn", 1, 14)); // NOI18N

        user_id.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        user_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_idActionPerformed(evt);
            }
        });

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("USERNAME:");
        label3.setFont(new java.awt.Font("Ubahn", 1, 14)); // NOI18N

        username.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("PASSWORD:");
        label5.setFont(new java.awt.Font("Ubahn", 1, 14)); // NOI18N

        password.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("TYPE:");
        label6.setFont(new java.awt.Font("Ubahn", 1, 14)); // NOI18N

        cmb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Type", "Admin", "Cashier", "Pelanggan" }));
        cmb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_typeActionPerformed(evt);
            }
        });

        btn_edit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/EXIT2.png"))); // NOI18N
        btn_edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelGlass1Layout.createSequentialGroup()
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(btn_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public Users1() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();
    }
     public void table() {
        String namaKolom[] = {"ID", "UserID", "Username", "Password", "Type"};
        rs = db.querySelect(namaKolom, "users_data");
        tbl_users.setModel(new ResultSetTableModel(rs));
    }
    private void tbl_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_usersMouseClicked
        user_id.setText(String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 1)));
        username.setText(String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 2)));
        password.setText(String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 3)));
        cmb_type.setSelectedItem(String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 4)));
    }//GEN-LAST:event_tbl_usersMouseClicked

    private void user_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_idActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void cmb_categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_categoriesActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if (user_id.getText().equals("") || username.getText().equals("") || password.getText().equals("")
            || cmb_type.getSelectedItem().equals("Type")) {
            JOptionPane.showMessageDialog(this, "Please enter the data completely");
        } else {
            String[] kolom = {"UserID", "Username", "Password", "Type"};
            String[] isi = {user_id.getText(), username.getText(), password.getText(), cmb_type.getSelectedItem().toString()};
            System.out.println(db.queryInsert("users_data", kolom, isi));
            table();
            refresh();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if (user_id.getText().equals("") || username.getText().equals("") || password.getText().equals("")
            || cmb_type.getSelectedItem().equals("Type")) {
            JOptionPane.showMessageDialog(this, "Please enter the data completely");
        } else {
            String[] kolom = {"UserID", "Username", "Password", "Type"};
            String[] isi = {user_id.getText(), username.getText(), password.getText(), cmb_type.getSelectedItem().toString()};
            String id = String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("users_data", kolom, isi, "id='" + id + "'"));
            table();
            refresh();
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String id = String.valueOf(tbl_users.getValueAt(tbl_users.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Are you sure want to delete this data", "Warning!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("users_data", "id=" + id);
        } else {
            return;
        }
        table();
    }//GEN-LAST:event_btn_deleteActionPerformed
    void refresh() {
        user_id.setText("");
        username.setText("");
        password.setText("");
        cmb_type.setSelectedItem("Type");
    }
    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        refresh();
        table();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        if (txt_search.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please input your keyword");
        } else {
            if (cmb_categories.getSelectedItem().equals("User ID")) {
                rs = db.querySelectAll("users_data", "UserID LIKE '%" + txt_search.getText() + "%' ");
                tbl_users.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("Username")) {
                rs = db.querySelectAll("users_data", "Username LIKE '%" + txt_search.getText() + "%' ");
                tbl_users.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("Password")) {
                rs = db.querySelectAll("users_data", "Password LIKE '%" + txt_search.getText() + "%' ");
                tbl_users.setModel(new ResultSetTableModel(rs));
            } else if (cmb_categories.getSelectedItem().equals("Type")) {
                rs = db.querySelectAll("users_data", "Type LIKE '%" + txt_search.getText() + "%' ");
                tbl_users.setModel(new ResultSetTableModel(rs));
            }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit1ActionPerformed
        hide();
    }//GEN-LAST:event_btn_edit1ActionPerformed

    private void cmb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_typeActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_add;
    private usu.widget.ButtonGlass btn_delete;
    private usu.widget.ButtonGlass btn_edit;
    private usu.widget.ButtonGlass btn_edit1;
    private usu.widget.ButtonGlass btn_refresh;
    private usu.widget.ButtonGlass btn_search;
    private javax.swing.JComboBox cmb_categories;
    private javax.swing.JComboBox cmb_type;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.Label label1;
    private usu.widget.Label label3;
    private usu.widget.Label label4;
    private usu.widget.Label label5;
    private usu.widget.Label label6;
    private usu.widget.Label label7;
    private usu.widget.Label label9;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.TextBox password;
    private javax.swing.JTable tbl_users;
    private usu.widget.TextBox txt_search;
    private usu.widget.TextBox user_id;
    private usu.widget.TextBox username;
    // End of variables declaration//GEN-END:variables

    
}
