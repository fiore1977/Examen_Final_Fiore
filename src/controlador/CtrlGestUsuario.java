
package controlador;

/**
 *
 * @author Fiore
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import vista.frmGestionUsuario;
import modelo.clUsuario;
import modelo.ConsultaUsuarios;
public class CtrlGestUsuario implements ActionListener{
    frmGestionUsuario frmUsuario;
    clUsuario         usuario;
    ConsultaUsuarios  ConsUsuario;
    public CtrlGestUsuario(frmGestionUsuario frmUsuario, clUsuario usuario, ConsultaUsuarios ConsUsuario){
        this.frmUsuario     = frmUsuario;
        this.usuario        = usuario;
        this.ConsUsuario    = ConsUsuario;
        this.frmUsuario.btnAgregar.addActionListener(this);
        this.frmUsuario.btnBuscar.addActionListener(this);
        this.frmUsuario.btnModificar.addActionListener(this);
        this.frmUsuario.btnEliminar.addActionListener(this);
        this.frmUsuario.btnCancelar.addActionListener(this);
        this.frmUsuario.btnAgregar.addKeyListener(cmdGuardar);
        this.frmUsuario.btnBuscar.addKeyListener(cmdBuscar);
        this.frmUsuario.btnModificar.addKeyListener(cmdModificar);
        this.frmUsuario.btnEliminar.addKeyListener(cmdEliminar);
        this.frmUsuario.btnCancelar.addKeyListener(cmdBuscar);
        this.frmUsuario.requestFocusInWindow();
        this.frmUsuario.requestFocus();
        this.frmUsuario.txtNombre.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.frmUsuario.btnAgregar){
            guardar();
        }
        if(e.getSource()==this.frmUsuario.btnBuscar){
            buscar();
        }
        if(e.getSource()==this.frmUsuario.btnModificar){
            modificar();
        }
        if(e.getSource()==this.frmUsuario.btnEliminar){
            eliminar();
        }
        if(e.getSource()==this.frmUsuario.btnCancelar){
            cancelar();
        }
    };
    
    KeyListener cmdGuardar = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if(e.getKeyCode() == 0){
                guardar();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    KeyListener cmdBuscar = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if(e.getKeyCode() == 0){
                buscar();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    KeyListener cmdEliminar = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if(e.getKeyCode()==0){
                eliminar();
            };
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == 0){
                eliminar();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    KeyListener cmdModificar = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            modificar();
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    KeyListener cmdCancelar = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            cancelar();
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    private void guardar(){
        usuario.setIdUsuario(frmUsuario.txtUsuario.getText());
        usuario.setNombre(frmUsuario.txtNombre.getText());
        usuario.setApellido(frmUsuario.txtApellido.getText());
        usuario.setCorreoElectronico(frmUsuario.txtCorreo.getText());
        usuario.setPassword(frmUsuario.txtPassword.getText());
        if(ConsUsuario.guardar(usuario)){
            JOptionPane.showMessageDialog(null, "Registro Creado Exitosamente.");
            limpiar();
        }
        
    }
    private void buscar(){
        usuario.setIdUsuario(frmUsuario.txtUsuario.getText());
        if(ConsUsuario.buscar(usuario)){
            frmUsuario.txtNombre.setText(usuario.getNombre());
            frmUsuario.txtApellido.setText(usuario.getApellido());
            frmUsuario.txtCorreo.setText(usuario.getCorreoElectronico());
            frmUsuario.txtPassword.setText(usuario.getPassword());
            frmUsuario.txtRepContrasenha.setText(usuario.getPassword());
        }
    }
    private void eliminar(){
        usuario.setIdUsuario(frmUsuario.txtUsuario.getText());
        frmUsuario.txtNombre.setText(usuario.getNombre());
        frmUsuario.txtApellido.setText(usuario.getApellido());
        frmUsuario.txtCorreo.setText(usuario.getCorreoElectronico());
        frmUsuario.txtPassword.setText(usuario.getPassword());
        frmUsuario.txtRepContrasenha.setText(usuario.getPassword());
        if(ConsUsuario.eliminar(usuario)){
            JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
            limpiar();
        }
    }
    private void modificar(){
        usuario.setIdUsuario(frmUsuario.txtUsuario.getText());
        frmUsuario.txtNombre.setText(usuario.getNombre());
        frmUsuario.txtApellido.setText(usuario.getApellido());
        frmUsuario.txtCorreo.setText(usuario.getCorreoElectronico());
        frmUsuario.txtPassword.setText(usuario.getPassword());
        frmUsuario.txtRepContrasenha.setText(usuario.getPassword());
        if(ConsUsuario.modificar(usuario)){
            JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
            limpiar();
        }
    }
    private void cancelar(){
        limpiar();
    }
    private void limpiar(){
        this.frmUsuario.txtNombre.setText(null);
        this.frmUsuario.txtApellido.setText(null);
        this.frmUsuario.txtUsuario.setText(null);
        this.frmUsuario.txtCorreo.setText(null);
        this.frmUsuario.txtPassword.setText(null);
        this.frmUsuario.txtRepContrasenha.setText(null);
        this.frmUsuario.txtNombre.requestFocus();
    }
}
