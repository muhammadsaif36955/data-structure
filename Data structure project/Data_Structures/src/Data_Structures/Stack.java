/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Structures;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hamza
 */
public class Stack extends javax.swing.JFrame {
    String[] header = new String[]{"Int Data"}; 
     DefaultTableModel datatable;
     int row, col,inc;
    
     public int[] stack = new int[10 ];
     int count = 10;
     int stdata;
    public Stack() {
        initComponents();
        datatable = new DefaultTableModel(header, 0);
        datatbl.setModel(datatable);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pushbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lststack = new java.awt.List();
        popbtn = new javax.swing.JButton();
        peekbtn = new javax.swing.JButton();
        getlbl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datatbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        poplbl = new javax.swing.JLabel();
        peeklbl = new javax.swing.JLabel();
        inclbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pushbtn.setBackground(new java.awt.Color(204, 255, 102));
        pushbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pushbtn.setText("Push");
        pushbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pushbtn.setBorderPainted(false);
        pushbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pushbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushbtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stack");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        popbtn.setBackground(new java.awt.Color(255, 102, 153));
        popbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        popbtn.setText("Pop");
        popbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        popbtn.setBorderPainted(false);
        popbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popbtnActionPerformed(evt);
            }
        });

        peekbtn.setBackground(new java.awt.Color(204, 102, 255));
        peekbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        peekbtn.setText("Peek");
        peekbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        peekbtn.setBorderPainted(false);
        peekbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peekbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peekbtnActionPerformed(evt);
            }
        });

        getlbl.setBackground(new java.awt.Color(255, 204, 204));
        getlbl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datatbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        datatbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        datatbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(datatbl);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Stack");

        poplbl.setBackground(new java.awt.Color(255, 204, 204));
        poplbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        poplbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poplbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        peeklbl.setBackground(new java.awt.Color(153, 153, 255));
        peeklbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        peeklbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peeklbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inclbl.setBackground(new java.awt.Color(255, 204, 204));
        inclbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        inclbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inclbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
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
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(popbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pushbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(peekbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(getlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(poplbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(peeklbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lststack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pushbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(popbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poplbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(peekbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(peeklbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lststack, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pushbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushbtnActionPerformed
         try{ add(Integer.parseInt(getlbl.getText()));}
         catch(Exception e){}
        
        
    }//GEN-LAST:event_pushbtnActionPerformed

    private void popbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popbtnActionPerformed
         try{pop();}
         catch(Exception e){}
         
    }//GEN-LAST:event_popbtnActionPerformed

    private void peekbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peekbtnActionPerformed
         try{peek();}
         catch(Exception e){}
    }//GEN-LAST:event_peekbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Index obj = new Index();
        obj.setVisible(true);
        Exit();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Stack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable datatbl;
    private javax.swing.JTextField getlbl;
    private javax.swing.JLabel inclbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List lststack;
    private javax.swing.JButton peekbtn;
    private javax.swing.JLabel peeklbl;
    private javax.swing.JButton popbtn;
    private javax.swing.JLabel poplbl;
    private javax.swing.JButton pushbtn;
    // End of variables declaration//GEN-END:variables
public void Exit()
    {
     WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
     this.dispose();
    }   

 public void add(int  data){
     inc++;
     inclbl.setText(String.valueOf(inc));
     count--;
     stack[count] = data;
//      count++;
   //  lststack.
     lststack.add(Integer.toString(data));
    // getlbl.setText(" ");
    datatable.setRowCount(0);
            for(int i = count; i >= 0 ;i++){
                Object[] obj = {stack[i]};
                datatable.addRow(obj);

            }   
           
 }
 public void clear(){
   getlbl.requestFocus();
   getlbl.setText(" ");
 }
 public void pop(){
		  
                  inclbl.setText(String.valueOf(inc));
		 int data = stack[count]; //3
                poplbl.setText(String.valueOf(data));
		
		stack[count]=0;
                count++;
                 inc--;
                datatable.setRowCount(0);
            for(int i = 0; i <= stack.length ;i++){    //int i = 0; i < stack.length ;i++
                Object[] obj = {stack[i]};
                datatable.addRow(obj);
                
    }
 }
      public void peek(){
		
                  int data = stack[count];
                peeklbl.setText(String.valueOf(data));
                
                 
		
             
                
       }
   }
