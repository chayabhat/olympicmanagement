/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olympic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class forgot extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form forgot
     */
    public forgot() {
        super("Forgot Password");
        initComponents();
          conn=javaconnect.ConnectDb();
    }
    
    public void Search()
    {
        String a1=txt_username.getText();
        String sql="select * from Account where Username='"+a1+"'";
        try{
            pst=conn.prepareStatement(sql);
              rs=pst.executeQuery();
        if(rs.next())
        {
            txt_name.setText(rs.getString(2));
            txt_secq.setText(rs.getString(4));
            rs.close();
            pst.close();
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Incorrect Username");
        }
        }catch(Exception e)
                {
                JOptionPane.showMessageDialog(null,e);
                }
    }
    
    public void Retrive()
    {
        //String a1=jTextField1.getText();
        String a2=txt_ans.getText();
          String sql="select * from Account where Answer='"+a2+"'";
          try{
              pst=conn.prepareStatement(sql);
              rs=pst.executeQuery();
              if(rs.next())
              {
                  txt_pass.setText(rs.getString(3));
              }
          }catch(Exception e)
          {
                JOptionPane.showMessageDialog(null,e);
          }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_secq = new javax.swing.JTextField();
        txt_ans = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btn_retrive = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 330, 130, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 400, 90, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your Security Question");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 470, 280, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 540, 110, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 600, 120, 30);

        txt_username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username);
        txt_username.setBounds(340, 330, 180, 40);

        txt_name.setEditable(false);
        txt_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_name);
        txt_name.setBounds(340, 400, 180, 40);

        txt_secq.setEditable(false);
        txt_secq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_secq);
        txt_secq.setBounds(340, 470, 290, 40);

        txt_ans.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ansActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ans);
        txt_ans.setBounds(340, 540, 180, 40);

        txt_pass.setEditable(false);
        txt_pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_pass);
        txt_pass.setBounds(340, 600, 180, 40);

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch);
        btnsearch.setBounds(550, 330, 120, 40);

        btn_retrive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_retrive.setText("RETRIVE");
        btn_retrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retriveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_retrive);
        btn_retrive.setBounds(550, 540, 120, 40);

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(700, 430, 90, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\photos\\olympic8.jpg")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1600, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1620, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
Search();        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btn_retriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retriveActionPerformed
Retrive();        
    }//GEN-LAST:event_btn_retriveActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
    setVisible(true);
    login ob=new login();
    ob.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ansActionPerformed

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
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_retrive;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField txt_ans;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_secq;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
