
package controlador;

/**
 *
 * @author Fiore
 */
import controlador.CtrlMenuPrincipal;
import modelo.clValidaSesion; //Gestor de la conexión
import modelo.clUsuario; //Constructor
import vista.frmAcceso; //Formulario para Acceso
import vista.MenuPrincipal;
// Clases Estandar
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ctrlSesion implements ActionListener{
    public clValidaSesion validaSesion;
    public clUsuario usuario;
    public frmAcceso acceso;
    public MenuPrincipal principal;
    public ctrlSesion(clValidaSesion validaSesion, clUsuario usuario, frmAcceso acceso){
        this.validaSesion = validaSesion;
        this.usuario = usuario;
        this.acceso = acceso;
        this.acceso.btnAceptar.addActionListener(this);
        this.acceso.btnCancelar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == acceso.btnAceptar){
            usuario.setIdUsuario(acceso.txtUsuario.getText());
            if(validaSesion.buscar(usuario)){
                String psw = acceso.pswContrasenha.getText();
                if(psw.toString().equals(usuario.getPassword().toString())){
                    acceso.dispose();
                    MenuPrincipal pantPrincipal = new MenuPrincipal();
                    CtrlMenuPrincipal menu = new CtrlMenuPrincipal(pantPrincipal);
                    pantPrincipal.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Contrasenha Incorrecta.");
                }
            }
        }
    }
    
}
