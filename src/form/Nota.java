
package form;

import db.Parameter;
import db.ResultSetTableModel;
import db.db_connection;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable.PrintMode;

public class Nota extends javax.swing.JFrame {

    ResultSet rs;
    db_connection db;

    @SuppressWarnings("static-access")
    public Nota() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        tampil_chart();
        date();
    }

    public void tampil_chart() {
         String namaKolom[] = { "id_menu","Nama", "Harga", "Jumlah","Total"};
        rs = db.fcSelectCommand(namaKolom, "chart", "Nofaktur='" + Transaction.txt_invoice.getText() + "'");
        tbl_print.setModel(new ResultSetTableModel(rs));              
        lbl_total.setText(Transaction.lbl_total.getText());
        lbl_cash.setText(Transaction.txt_cash.getText());
        payback();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass1 = new usu.widget.glass.PanelGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_print = new javax.swing.JTable();
        label2 = new usu.widget.Label();
        label3 = new usu.widget.Label();
        label4 = new usu.widget.Label();
        lbl_total = new usu.widget.Label();
        lbl_cash = new usu.widget.Label();
        lbl_payback = new usu.widget.Label();
        lbl_date = new usu.widget.Label();
        label5 = new usu.widget.Label();
        label6 = new usu.widget.Label();
        lbl_time = new usu.widget.Label();
        btn_ok = new usu.widget.ButtonGlass();
        btn_print = new usu.widget.ButtonGlass();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receipt");

        panelGlass1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/Image/background nota.png"))); // NOI18N
        panelGlass1.setWarna(new java.awt.Color(0, 255, 255));

        tbl_print.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_print);

        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Total");
        label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Cash");
        label3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Payback");
        label4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbl_total.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_total.setText("xx");
        lbl_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_cash.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cash.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_cash.setText("xx");
        lbl_cash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_payback.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        lbl_payback.setForeground(new java.awt.Color(255, 255, 255));
        lbl_payback.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_payback.setText("xx");
        lbl_payback.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Date:");
        label5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Time:");
        label6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_time.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_ok.setForeground(new java.awt.Color(255, 255, 255));
        btn_ok.setText("OK");
        btn_ok.setFont(new java.awt.Font("Ubahn", 0, 14)); // NOI18N
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_print.setForeground(new java.awt.Color(255, 255, 255));
        btn_print.setText("PRINT");
        btn_print.setFont(new java.awt.Font("Ubahn", 0, 14)); // NOI18N
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_payback, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_payback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
         try {
          tbl_print.print(PrintMode.FIT_WIDTH, new MessageFormat("RESTORAN JOGJA DAMAI"), null);
            this.printComponents(null);
            } catch (PrinterException ex) {
               Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
           }
            db_connection db = new db_connection(null, null, null, null, WIDTH);
            
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_okActionPerformed

    /**
     * @param args the command line arguments
     */
    public void date(){
        lbl_date.setText(Transaction.lbl_date.getText());
        lbl_time.setText(Transaction.lbl_time.getText());
    }

    public void payback() {
        int a = Integer.parseInt(Transaction.lbl_total.getText());
        int b = Integer.parseInt(Transaction.txt_cash.getText());
        int c = b - a;
        lbl_payback.setText(Integer.toString(c));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Nota().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_ok;
    private usu.widget.ButtonGlass btn_print;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.Label label2;
    private usu.widget.Label label3;
    private usu.widget.Label label4;
    private usu.widget.Label label5;
    private usu.widget.Label label6;
    private usu.widget.Label lbl_cash;
    private usu.widget.Label lbl_date;
    private usu.widget.Label lbl_payback;
    private usu.widget.Label lbl_time;
    private usu.widget.Label lbl_total;
    private usu.widget.glass.PanelGlass panelGlass1;
    private javax.swing.JTable tbl_print;
    // End of variables declaration//GEN-END:variables
}
