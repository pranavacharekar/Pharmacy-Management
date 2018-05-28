/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvelsgroup;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp-pc
 */
public class FindMed extends javax.swing.JFrame {

    
    private Connection conn;
    public FindMed() {
        initComponents();
        conn=MySQLConnect.ConnectDB();
        inittable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showallbutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        placeorderbutton = new javax.swing.JButton();
        inputmedname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medlist = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        showallbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showallbutton.setText("Show All Medicines");
        showallbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showallbuttonActionPerformed(evt);
            }
        });

        cancelbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbutton.setForeground(java.awt.Color.red);
        cancelbutton.setText("Cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        placeorderbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        placeorderbutton.setText("Place Order");
        placeorderbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeorderbuttonActionPerformed(evt);
            }
        });

        inputmedname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputmedname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputmednameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputmednameKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Medicine Name");

        medlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Medicine Name", "Quantity", "Cost", "Rack No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medlistMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(medlist);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Medicine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(inputmedname))
                    .addComponent(showallbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(placeorderbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelbutton, placeorderbutton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputmedname))
                .addGap(18, 18, 18)
                .addComponent(showallbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeorderbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void placeorderbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeorderbuttonActionPerformed
        OrderFrame f=new OrderFrame();
        f.setVisible(true);
    }//GEN-LAST:event_placeorderbuttonActionPerformed

    private void inittable()
    {
        PreparedStatement pst=null;
        ResultSet rs=null;
        String st="Select * from medicines";
        try{
            pst=conn.prepareStatement(st);
            rs=pst.executeQuery();
            if(rs.first())
            {
                display(rs);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No Results Found!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }   // TODO add your handling code here:
    }
    
    private void showallbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallbuttonActionPerformed
        PreparedStatement pst=null;
        ResultSet rs=null;
        String st="Select * from medicines";
        try{
            pst=conn.prepareStatement(st);
            rs=pst.executeQuery();
            if(rs.first())
            {
                display(rs);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No Results Found!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_showallbuttonActionPerformed

    private void inputmednameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputmednameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputmednameKeyTyped

    private void inputmednameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputmednameKeyReleased
        PreparedStatement pst=null;
        ResultSet rs=null;
        String st="Select * from medicines where medname like ?";
        try{
            pst=conn.prepareStatement(st);
            pst.setString(1, inputmedname.getText().toLowerCase()+"%");
            rs=pst.executeQuery();
            if(rs.first())
            {
               display(rs);
            }
            else
            {
                medlist.removeAll();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_inputmednameKeyReleased

    private void medlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medlistMouseClicked
        int i=medlist.getSelectedRow();
        inputmedname.setText((String)medlist.getValueAt(i, 1));
    }//GEN-LAST:event_medlistMouseClicked

    private void display(ResultSet rs)
    {
        DefaultTableModel model=(DefaultTableModel)medlist.getModel();
        model.setRowCount(0);
        try
        {
        do
        {
            Object[] obj ={rs.getInt("ID"),rs.getString("medname"),rs.getInt("qty"),rs.getInt("cost"),rs.getString("compartment")}; 
            model.addRow(obj);
        }while(rs.next());
        }
        catch(SQLException e)
        {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(FindMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField inputmedname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable medlist;
    private javax.swing.JButton placeorderbutton;
    private javax.swing.JButton showallbutton;
    // End of variables declaration//GEN-END:variables
}