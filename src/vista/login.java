
package vista;
import modelo.clUsuario;
import modelo.clValidaSesion;
import vista.frmAcceso;
import controlador.ctrlSesion;
import modelo.clUsuario;
import modelo.clValidaSesion;
/**
 *
 * @author Fiore
 */
public class login {
 
        public static void main(String[] args) {
            clUsuario usuario = new clUsuario(); //Instancia el Constructor de la tabla de usuario
            clValidaSesion validaSesion = new clValidaSesion(); // Instancia la funcion que consulta la bd
            frmAcceso acceso = new frmAcceso(); //Instancia el formulario
            ctrlSesion sesion = new ctrlSesion(validaSesion, usuario, acceso); //Instancia la escucha de los eventos
            acceso.setVisible(true);
        }
    

}
