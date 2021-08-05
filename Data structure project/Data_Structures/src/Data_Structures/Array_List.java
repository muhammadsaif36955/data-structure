/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Structures;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hamza
 */
public class Array_List extends javax.swing.JFrame {


  

    ArrayList<Product> productdetail;
   String[] header = new String[]{"Product Name" , "Product Price"};
    DefaultTableModel table;
    int row, col;
    public Array_List() {
        initComponents();
        productdetail = new ArrayList<>();
        table = new DefaultTableModel(header, 0);
        Producttable.setModel(table);
        this.setLocationRelativeTo(null);
        
        
        
        
        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txtprice = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Producttable = new javax.swing.JTable();
        btnremoveindex = new javax.swing.JButton();
        Txtindex = new javax.swing.JTextField();
        btnemty = new javax.swing.JButton();
        lblempty = new javax.swing.JLabel();
        btnsize = new javax.swing.JButton();
        lblsize = new javax.swing.JLabel();
        btncontain = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Array List");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txtname.setBackground(new java.awt.Color(204, 255, 204));
        Txtname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product Price");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txtprice.setBackground(new java.awt.Color(204, 255, 204));
        Txtprice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Txtprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnadd.setBackground(new java.awt.Color(204, 204, 255));
        btnadd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnadd.setText("Add");
        btnadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnadd.setBorderPainted(false);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnremove.setBackground(new java.awt.Color(255, 153, 255));
        btnremove.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnremove.setText("Remove");
        btnremove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnremove.setBorderPainted(false);
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(255, 204, 204));
        btnclear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnclear.setText("Clear");
        btnclear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnclear.setBorderPainted(false);
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        Producttable.setBackground(new java.awt.Color(255, 204, 204));
        Producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Producttable);

        btnremoveindex.setBackground(new java.awt.Color(0, 204, 204));
        btnremoveindex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnremoveindex.setText("Remove");
        btnremoveindex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnremoveindex.setBorderPainted(false);
        btnremoveindex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveindexActionPerformed(evt);
            }
        });

        Txtindex.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Txtindex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtindex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txtindex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtindexActionPerformed(evt);
            }
        });

        btnemty.setBackground(new java.awt.Color(255, 204, 153));
        btnemty.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnemty.setText("Empty");
        btnemty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnemty.setBorderPainted(false);
        btnemty.setMaximumSize(new java.awt.Dimension(49, 17));
        btnemty.setMinimumSize(new java.awt.Dimension(49, 17));
        btnemty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemtyActionPerformed(evt);
            }
        });

        lblempty.setBackground(new java.awt.Color(255, 255, 255));
        lblempty.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblempty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblempty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnsize.setBackground(new java.awt.Color(102, 255, 153));
        btnsize.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnsize.setText("Size ");
        btnsize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsize.setBorderPainted(false);
        btnsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsizeActionPerformed(evt);
            }
        });

        lblsize.setBackground(new java.awt.Color(255, 255, 255));
        lblsize.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblsize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btncontain.setBackground(new java.awt.Color(0, 204, 204));
        btncontain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btncontain.setText("Search");
        btncontain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btncontain.setBorderPainted(false);
        btncontain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontainActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnemty, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsize, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblsize, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblempty, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btncontain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnremoveindex, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(Txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(133, 224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnremoveindex, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblempty, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnemty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblsize, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnsize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btncontain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try{String productname = Txtname.getText();
            Double productprice = Double.parseDouble(Txtprice.getText());
            productdetail.add(new Product(productname,productprice));
            table.setRowCount(0);
            for(int i = 0; i < productdetail.size();i++){
                Object[] obj = {productdetail.get(i).productname,productdetail.get(i).productprice};
                table.addRow(obj);

            }
            clearfields();

        }
        catch(Exception e)
        {}

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        productdetail.remove(row);
        table.removeRow(row);
        table.setRowCount(0);
        for(int i = 0; i < productdetail.size();i++){
            Object[] obj = {productdetail.get(i).productname,productdetail.get(i).productprice};
            table.addRow(obj);
        }
        clearfields();

    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearfields();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnremoveindexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveindexActionPerformed
        try{
            String getindex = Txtindex.getText();
            int intindex = Integer.parseInt(getindex);
            productdetail.remove(intindex);
            table.removeRow(row);
            table.setRowCount(0);
            for(int i = 0; i < productdetail.size();i++){
                Object[] obj = {productdetail.get(i).productname,productdetail.get(i).productprice};
                table.addRow(obj);
            }
            Txtindex.setText(" ");
        }
        catch(Exception e){
        }

    }//GEN-LAST:event_btnremoveindexActionPerformed

    private void btnemtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemtyActionPerformed
        boolean re = productdetail.isEmpty();
        String str = String.valueOf(re);
        lblempty.setText(str);
    }//GEN-LAST:event_btnemtyActionPerformed

    private void btnsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsizeActionPerformed
        int getsize = productdetail.size();
        String strsize = String.valueOf(getsize);
        lblsize.setText(strsize);
    }//GEN-LAST:event_btnsizeActionPerformed

    private void btncontainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontainActionPerformed
        try{
            String Search = JOptionPane.showInputDialog(this,"Search Product Name:");
            for (int i = 0; i < productdetail.size(); i++){
                if(productdetail.get(i).productname.equalsIgnoreCase(Search)){
                    JOptionPane.showMessageDialog(btncontain, "True!!!" , "Search Product" ,2);
                    Txtname.setText(productdetail.get(i).productname);
                    Txtprice.setText(String.valueOf(productdetail.get(i).productprice));

                }

            }

        }
        catch(Exception e){}

    }//GEN-LAST:event_btncontainActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Index obj = new Index();
        obj.setVisible(true);
        Exit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtindexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtindexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtindexActionPerformed

    public void clearfields(){
       Txtname.requestFocus();
       Txtname.setText("");
       Txtprice.setText(" ");
  }
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
            java.util.logging.Logger.getLogger(Array_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Array_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Array_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Array_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Array_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Producttable;
    private javax.swing.JTextField Txtindex;
    private javax.swing.JTextField Txtname;
    private javax.swing.JTextField Txtprice;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncontain;
    private javax.swing.JButton btnemty;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnremoveindex;
    private javax.swing.JButton btnsize;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblempty;
    private javax.swing.JLabel lblsize;
    // End of variables declaration//GEN-END:variables
   public void Exit()
    {
     WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
     this.dispose();
    }  
}
