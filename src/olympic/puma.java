/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olympic;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class puma extends javax.swing.JFrame {
 Connection conn=null;
ResultSet rs=null; 
PreparedStatement pst=null;
 
    /**
     * Creates new form puma
     */
    public puma() {
        initComponents();
         conn=javaconnect.ConnectDb();
          Toolkit toolkit = getToolkit();
          Dimension size = toolkit.getScreenSize();
          setLocation(size.width/2 - getWidth()/2,
          size.height/2 - getHeight()/2);
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
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_pname = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_amt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ATHLETE ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 180, 120, 40);

        txt_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idKeyReleased(evt);
            }
        });
        jPanel1.add(txt_id);
        txt_id.setBounds(660, 180, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER THE SPONSOR YOU HAVE ENTERED IN: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 310, 430, 22);

        txt_pname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pnameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_pname);
        txt_pname.setBounds(660, 300, 160, 40);

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(300, 470, 110, 37);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(500, 470, 130, 40);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(750, 470, 140, 37);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(400, 570, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CASH SPONSORED:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 380, 190, 22);

        txt_amt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_amt);
        txt_amt.setBounds(660, 370, 160, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ATHLETE NAME");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 250, 150, 30);

        txt_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_name);
        txt_name.setBounds(660, 240, 160, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Note!! The athlete must pay 50% they have won to Puma company");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 630, 630, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENTER ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 100, 90, 22);

        txt_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search);
        txt_search.setBounds(320, 90, 140, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(640, 570, 120, 40);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 0, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/olympic/images/p2.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 0, 1200, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1098, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
  
    }//GEN-LAST:event_txt_idActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            String sql="insert into puMA1 (id,name,pname,amt) values (?,?,?,?)";
             pst=conn.prepareStatement(sql);
             pst.setString(1,txt_id.getText());
             pst.setString(2,txt_name.getText());
             pst.setString(3,txt_pname.getText());
             pst.setString(4,txt_amt.getText());
               
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data is saved successfully");
            
        }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null,e);
        }
         finally {
             try{
                 rs.close();
                 pst.close();
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,e);
             }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{ 
        String sql= " delete from puMA1 where id=? ";
      pst = conn.prepareStatement(sql);
      pst.setString(1,txt_id.getText());
      pst.execute();
      
      JOptionPane.showMessageDialog(null,"Details Deleted");
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e);
        }
          finally{
      try{
          rs.close();
          pst.close();
      }catch(Exception e)
      {
          
      }
  }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         try{
       String val = txt_id.getText();
       String val1=txt_name.getText();
       String val2=txt_pname.getText();
       String val3=txt_amt.getText();
        String sql = "update puMA1 set id='"+val+"',name='"+val1+"',pname='"+val2+"',amt='"+val3+"' where id='"+val+"'";
         pst=conn.prepareStatement(sql);
   pst.execute();
   JOptionPane.showMessageDialog(null,"Details Updated");
         }
         catch(Exception e)
         {
           JOptionPane.showMessageDialog(null,e);  
         }
          finally{
      try{
          
      }catch(Exception e)
      {
          
      }
  }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txt_pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pnameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
   setVisible(false);
      Sponsors ob=new Sponsors();
       ob.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyReleased
    
    }//GEN-LAST:event_txt_idKeyReleased

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try{
           
           String sql= "select * from Staff_information2 where id=? ";
           
           pst=conn.prepareStatement(sql);
           pst.setString(1,txt_search.getText());
           rs=pst.executeQuery();
           
           String add1=rs.getString("id");
           txt_id.setText(add1);
           
           String add2=rs.getString("first_name");
           txt_name.setText(add2);
           
     }catch(Exception e)
     {
         
     }
      finally{
           try{
              rs.close();
              pst.close();
           }catch(Exception e)
           {
               
           }
       }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txt_id.setText("");
        txt_name.setText("");
        txt_pname.setText("");
        txt_amt.setText("");
       
       
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
            java.util.logging.Logger.getLogger(puma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_amt;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pname;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
