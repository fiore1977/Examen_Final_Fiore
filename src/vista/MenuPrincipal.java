
package vista;

import java.awt.Graphics;
import java.awt.Image;
import static java.lang.reflect.Array.set;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Fiore
 */
public class MenuPrincipal extends javax.swing.JFrame {
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JDesktopPane();
        mnuPrincipal = new javax.swing.JMenuBar();
        mnuMantenimiento = new javax.swing.JMenu();
        mnuitmCliente = new javax.swing.JMenuItem();
        mnuitmPais = new javax.swing.JMenuItem();
        mnuitmCiudad = new javax.swing.JMenuItem();
        mnuitmContinente = new javax.swing.JMenuItem();
        mnuAdministrar = new javax.swing.JMenu();
        jmiUsuario = new javax.swing.JMenuItem();
        mnuMenu = new javax.swing.JMenu();
        sprSeparador1 = new javax.swing.JPopupMenu.Separator();
        mnuitmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn_agencia.png")).getImage());

        JPanel.setBackground(new java.awt.Color(0, 255, 102));
        JPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));
        JPanel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        mnuMantenimiento.setMnemonic('N');
        mnuMantenimiento.setText("Mantenimiento");

        mnuitmCliente.setMnemonic('C');
        mnuitmCliente.setText("Cliente");
        mnuitmCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mnuitmCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mnuMantenimiento.add(mnuitmCliente);

        mnuitmPais.setMnemonic('P');
        mnuitmPais.setText("País");
        mnuitmPais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mnuitmPais.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mnuMantenimiento.add(mnuitmPais);

        mnuitmCiudad.setMnemonic('U');
        mnuitmCiudad.setText("Ciudad");
        mnuitmCiudad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mnuitmCiudad.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mnuMantenimiento.add(mnuitmCiudad);

        mnuitmContinente.setMnemonic('N');
        mnuitmContinente.setText("Continente");
        mnuitmContinente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mnuitmContinente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mnuMantenimiento.add(mnuitmContinente);

        mnuPrincipal.add(mnuMantenimiento);

        mnuAdministrar.setMnemonic('A');
        mnuAdministrar.setText("Administrar");

        jmiUsuario.setText("Gestionar Usuario");
        mnuAdministrar.add(jmiUsuario);

        mnuPrincipal.add(mnuAdministrar);

        mnuMenu.setMnemonic('M');
        mnuMenu.setText("Menú");
        mnuMenu.setToolTipText("");
        mnuMenu.add(sprSeparador1);

        mnuitmSalir.setText("Salir");
        mnuitmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmSalirActionPerformed(evt);
            }
        });
        mnuMenu.add(mnuitmSalir);

        mnuPrincipal.add(mnuMenu);

        setJMenuBar(mnuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuitmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuitmSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane JPanel;
    public javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JMenu mnuAdministrar;
    private javax.swing.JMenu mnuMantenimiento;
    private javax.swing.JMenu mnuMenu;
    public javax.swing.JMenuBar mnuPrincipal;
    public javax.swing.JMenuItem mnuitmCiudad;
    public javax.swing.JMenuItem mnuitmCliente;
    public javax.swing.JMenuItem mnuitmContinente;
    public javax.swing.JMenuItem mnuitmPais;
    private javax.swing.JMenuItem mnuitmSalir;
    private javax.swing.JPopupMenu.Separator sprSeparador1;
    // End of variables declaration//GEN-END:variables

}
