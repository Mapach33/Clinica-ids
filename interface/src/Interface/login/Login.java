/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.login;

import java.awt.Color;

/**
 *
 * @author jerso
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int xMouse, yMouse;
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        Salir = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Sesion = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Texto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Contraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Contra = new javax.swing.JPasswordField();
        bot = new javax.swing.JPanel();
        Boton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(204, 255, 255));
        Titulo.setFont(new java.awt.Font("Rockwell", 0, 45)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 0, 51));
        Titulo.setText("MediSalud");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/r-o-FFA8yd4OynY-unsplash.jpg"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 230, 480));

        Panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelMouseDragged(evt);
            }
        });
        Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelMousePressed(evt);
            }
        });

        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Salir.setName(""); // NOI18N

        exitTxt.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setName("X"); // NOI18N
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout SalirLayout = new javax.swing.GroupLayout(Salir);
        Salir.setLayout(SalirLayout);
        SalirLayout.setHorizontalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SalirLayout.setVerticalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 701, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        Logo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        bg.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 30));

        Sesion.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Sesion.setText("INICIAR SESIÓN");
        bg.add(Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 40));

        Usuario.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Usuario.setText("USUARIO");
        bg.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        Texto.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Texto.setForeground(new java.awt.Color(204, 204, 204));
        Texto.setText("Ingrese su nombre de usuario");
        Texto.setBorder(null);
        Texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextoMousePressed(evt);
            }
        });
        Texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoActionPerformed(evt);
            }
        });
        bg.add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 330, 40));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 350, 20));

        Contraseña.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Contraseña.setText("CONTRASEÑA");
        bg.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 350, -1));

        Contra.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Contra.setForeground(new java.awt.Color(204, 204, 204));
        Contra.setText("*********");
        Contra.setBorder(null);
        Contra.setCaretColor(new java.awt.Color(204, 204, 204));
        Contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContraMousePressed(evt);
            }
        });
        bg.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 230, -1));

        bot.setBackground(new java.awt.Color(189, 120, 63));
        bot.setForeground(new java.awt.Color(255, 255, 255));
        bot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Boton.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Boton.setForeground(new java.awt.Color(255, 255, 255));
        Boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton.setText("ENTRAR");
        Boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout botLayout = new javax.swing.GroupLayout(bot);
        bot.setLayout(botLayout);
        botLayout.setHorizontalGroup(
            botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        botLayout.setVerticalGroup(
            botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(bot, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoActionPerformed

    private void PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_PanelMousePressed

    private void PanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_PanelMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
       
    }//GEN-LAST:event_exitTxtMouseEntered

    private void TextoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoMousePressed
        if(Texto.getText().equals("Ingrese el nombre del usuario")){
           Texto.setText("");
           Texto.setForeground(Color.black);  
        }
        if(String.valueOf(Contra.getPassword()).isEmpty()){
           Contra.setText("*********");
           Contra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TextoMousePressed

    private void ContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraMousePressed
        if(Texto.getText().isEmpty()){
           Texto.setText("Ingrese su nombre de usuario");
           Texto.setForeground(Color.gray); 
        }
         if(String.valueOf(Contra.getPassword()).equals("*********")){
           Contra.setText("");
           Contra.setForeground(Color.black);
        }
    }//GEN-LAST:event_ContraMousePressed

    private void BotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this,"Intento de login con los datos: \nUsuario:"+Texto.getText()+"\nContraseña: "+String.valueOf(Contra.getPassword()),"LOGIN",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton;
    private javax.swing.JPasswordField Contra;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Salir;
    private javax.swing.JLabel Sesion;
    private javax.swing.JTextField Texto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bot;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
