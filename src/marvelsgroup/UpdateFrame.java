/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvelsgroup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hp-pc
 */
public class UpdateFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateFrame
     */
    private Connection conn;
    private ResultSet rs=null;
    public UpdateFrame() {
        initComponents();

        conn=MySQLConnect.ConnectDB();
        filler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fetchbutton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        mnameoutput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        qtyoutput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        costoutput = new javax.swing.JTextField();
        cancelbutton = new javax.swing.JButton();
        modifybutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comoutput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        medlist = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(691, 438));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Medicine Name");

        fetchbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fetchbutton.setText("Fetch Details");
        fetchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Medicine Name");

        mnameoutput.setEditable(false);
        mnameoutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameoutputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cost/Unit");

        costoutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoutputActionPerformed(evt);
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

        modifybutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifybutton.setText("Modify");
        modifybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifybuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Compartment");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 157));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Update Medicine");

        medlist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        medlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(modifybutton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addGap(73, 73, 73)
                        .addComponent(deletebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addGap(83, 83, 83)
                        .addComponent(cancelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qtyoutput)
                            .addComponent(costoutput)
                            .addComponent(comoutput)
                            .addComponent(mnameoutput))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medlist, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fetchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fetchbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medlist, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mnameoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifybutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filler()
    {
        medlist.removeAllItems();
        PreparedStatement pst=null;
        
        String st="Select medname from medicines";
        try{
            pst=conn.prepareStatement(st);
            rs=pst.executeQuery();
            while(rs.next())
            {
                medlist.addItem(rs.getString(1).toUpperCase());
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void fetchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchbuttonActionPerformed
        PreparedStatement pst=null;
        ResultSet rs=null;
        String st="Select * from medicines where medname=?";
        try{
            pst=conn.prepareStatement(st);
            pst.setString(1, ((String)medlist.getSelectedItem()).toLowerCase());
            rs=pst.executeQuery();
            if(rs.first())
            {
                mnameoutput.setText(rs.getString("medname").toUpperCase());
                qtyoutput.setText((rs.getString("qty")));
                costoutput.setText(rs.getString("cost"));
                comoutput.setText(rs.getString("compartment"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fetchbuttonActionPerformed

    private void costoutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoutputActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void modifybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifybuttonActionPerformed
        PreparedStatement pst=null;
        ResultSet rs=null;
        String st="Update medicines set qty=?, cost=?, compartment=? where medname=?";
        try{
            pst=conn.prepareStatement(st);
            pst.setInt(1, Integer.parseInt(qtyoutput.getText()));
            pst.setInt(2, Integer.parseInt(costoutput.getText()));
            pst.setString(3, comoutput.getText());
            pst.setString(4, mnameoutput.getText().toLowerCase());
            int check=pst.executeUpdate();
            if(check==1)
            {
                JOptionPane.showMessageDialog(this, "Update Successful!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Gadbad ahe mitra!","Vaat Lagli",JOptionPane.ERROR_MESSAGE);
            }
            qtyoutput.setText("");
            costoutput.setText("");
            mnameoutput.setText("");
            comoutput.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modifybuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
            PreparedStatement pst=null;
        ResultSet rs=null;
        String st="delete from medicines where medname=?";
        try{
            pst=conn.prepareStatement(st);
            pst.setString(1, ((String)medlist.getSelectedItem()).toLowerCase());
            int check=pst.executeUpdate();
            if(check==1)
            {
                JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");
                filler();
            }
            else if(check==0)
            {
                JOptionPane.showMessageDialog(this, "No Records named \""+medlist.getItemAt(0)+"\" found!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Gadbad ahe mitra!","Vaat Lagli",JOptionPane.ERROR_MESSAGE);
            }
            qtyoutput.setText("");
            costoutput.setText("");
            mnameoutput.setText("");
            comoutput.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        filler();
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void mnameoutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameoutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameoutputActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField comoutput;
    private javax.swing.JTextField costoutput;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton fetchbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> medlist;
    private javax.swing.JTextField mnameoutput;
    private javax.swing.JButton modifybutton;
    private javax.swing.JTextField qtyoutput;
    // End of variables declaration//GEN-END:variables
}
