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
public class Queue extends javax.swing.JFrame {

   String[] header = new String[]{"Int Data"}; 
     DefaultTableModel quetable;
     int row, col,inc = 0;
    
     public int[] queue = new int[10];
     int front = 0;
     int rear = 0;
    public Queue() {
        initComponents();
        quetable = new DefaultTableModel(header,0);
        quetbl.setModel(quetable);
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pushbtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enquebtn = new javax.swing.JButton();
        dequebtn = new javax.swing.JButton();
        enquetxt = new javax.swing.JTextField();
        dequelbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quetbl = new javax.swing.JTable();
        dequelbl1 = new javax.swing.JLabel();
        inclbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        pushbtn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pushbtn1.setText("Enque");
        pushbtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pushbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pushbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushbtn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Queue");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        enquebtn.setBackground(new java.awt.Color(0, 102, 204));
        enquebtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        enquebtn.setText("Enque");
        enquebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enquebtn.setBorderPainted(false);
        enquebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enquebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enquebtnActionPerformed(evt);
            }
        });

        dequebtn.setBackground(new java.awt.Color(153, 153, 0));
        dequebtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dequebtn.setText("Deque");
        dequebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dequebtn.setBorderPainted(false);
        dequebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dequebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dequebtnActionPerformed(evt);
            }
        });

        enquetxt.setBackground(new java.awt.Color(255, 153, 255));
        enquetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enquetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dequelbl.setBackground(new java.awt.Color(255, 255, 204));
        dequelbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dequelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dequelbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        quetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(quetbl);

        dequelbl1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dequelbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dequelbl1.setText("Queue");
        dequelbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inclbl.setBackground(new java.awt.Color(255, 102, 102));
        inclbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        inclbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inclbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
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
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enquebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(dequebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enquetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dequelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(inclbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dequelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dequelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enquebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enquetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dequelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dequebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inclbl, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enquebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enquebtnActionPerformed
        try{
            
            Enque(Integer.parseInt(enquetxt.getText()));
           
        }
        catch(Exception e){}

    }//GEN-LAST:event_enquebtnActionPerformed

    private void pushbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pushbtn1ActionPerformed

    private void dequebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dequebtnActionPerformed
        try{deque();}
        catch(Exception e){}
    }//GEN-LAST:event_dequebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Queue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Queue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Queue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Queue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dequebtn;
    private javax.swing.JLabel dequelbl;
    private javax.swing.JLabel dequelbl1;
    private javax.swing.JButton enquebtn;
    private javax.swing.JTextField enquetxt;
    private javax.swing.JLabel inclbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pushbtn1;
    private javax.swing.JTable quetbl;
    // End of variables declaration//GEN-END:variables
public void Exit()
    {
     WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
     this.dispose();
    } 

public void Enque(int  data){
     
     queue[front] = data;
      front++;
      inc++;
    // getlbl.setText(" ");
    quetable.setRowCount(0);
            for(int i = 0; i <  front ;i++){
                Object[] obj = {queue[i]};
                quetable.addRow(obj);

            }
           inclbl.setText(String.valueOf(inc));
    }
 public void deque(){
		
                 //count = 5;
    //             front--; //4
		  inc--;
                  inclbl.setText(String.valueOf(inc));
                 int data = queue[rear]; //4
               dequelbl.setText(String.valueOf(data));
		if(rear <= front){
                   queue[rear]=0;
                    rear++;
                   
                   
                }     
                
                quetable.setRowCount(0);
            for(int k = 0; k <= queue.length  ;k++){
                Object[] obj = {queue[k]};
                quetable.addRow(obj);
                
    }
             
}                
}

