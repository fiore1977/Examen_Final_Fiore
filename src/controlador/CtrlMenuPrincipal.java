
package controlador;
import vista.MenuPrincipal;
import vista.frmGestionUsuario;
import vista.frmCliente;
import vista.frmCiudad;
import vista.frmContinente;
import vista.frmPais;
import modelo.ConsultasCliente;
import modelo.ConsultaCiudad;
import modelo.clCliente;
import modelo.ConsultaPais;
import modelo.clPais;
import modelo.clCiudad;
import modelo.ConsultaContinente;
import modelo.clContinente;
import modelo.clUsuario;
import modelo.ConsultaUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Spliterators.iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author Fiore
 */
public class CtrlMenuPrincipal implements ActionListener{
    public MenuPrincipal MenuPrincipal;
    public frmGestionUsuario GestionUsuario;
    public frmCliente cliente;
    public frmContinente continente;
    public frmCiudad ciudad;
    public clCliente cli;
    public clContinente cCont;
    public clPais pais;
    public clCiudad ciu;
    
    public CtrlMenuPrincipal(MenuPrincipal menu){
        this.MenuPrincipal = menu;
        this.MenuPrincipal.jmiUsuario.addActionListener(this);
        this.MenuPrincipal.mnuitmCliente.addActionListener(this);
        this.MenuPrincipal.mnuitmContinente.addActionListener(this);
        this.MenuPrincipal.mnuitmPais.addActionListener(this);
        this.MenuPrincipal.mnuitmCiudad.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == MenuPrincipal.jmiUsuario){
            frmGestionUsuario GestUs = new frmGestionUsuario();
            ConsultaUsuarios ConsUsuarios = new ConsultaUsuarios();
            clUsuario usuario = new clUsuario();
            CtrlGestUsuario gestUsuario = new CtrlGestUsuario(GestUs, usuario, ConsUsuarios);
            MenuPrincipal.jdpPrincipal.add(GestUs);
            GestUs.setVisible(true);
        }else if(e.getSource()== MenuPrincipal.mnuitmCliente){
            frmCliente GesClie = new frmCliente();
            ConsultasCliente ConClie = new ConsultasCliente();
            clCliente Clie = new clCliente();
            clPais Pais = new clPais();
            ConsultaPais cPais = new ConsultaPais();
            
            try {
                CtrlclCliente clieC = new CtrlclCliente(Clie, ConClie, GesClie, cPais, Pais);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            MenuPrincipal.jdpPrincipal.add(GesClie);
            GesClie.setVisible(true);
        }else if(e.getSource()== MenuPrincipal.mnuitmContinente){
            frmContinente GesCont = new frmContinente();
            ConsultaContinente ConCont = new ConsultaContinente();
            clContinente Cont = new clContinente();
            
            
            CtrlclContinente contC = new CtrlclContinente(Cont, ConCont, GesCont);
            MenuPrincipal.jdpPrincipal.add(GesCont);
            GesCont.setVisible(true);
        }else if(e.getSource()== MenuPrincipal.mnuitmPais){
            frmPais GesPais = new frmPais();
            ConsultaPais Clpais = new ConsultaPais();
            clPais pais = new clPais();
            
            
            CtrlclPais contC = new CtrlclPais(pais, Clpais, GesPais);
            MenuPrincipal.jdpPrincipal.add(GesPais);
            GesPais.setVisible(true);
        }
        else if(e.getSource()== MenuPrincipal.mnuitmCiudad){
            frmCiudad GesCiudad = new frmCiudad();
            ConsultaCiudad ClCiudad = new ConsultaCiudad();
            clCiudad ciu = new clCiudad();
            
            
            CtrlclCiudad contC = new CtrlclCiudad(ciu, ClCiudad, GesCiudad);
            MenuPrincipal.jdpPrincipal.add(GesCiudad);
            GesCiudad.setVisible(true);
    }
  }  
}    
