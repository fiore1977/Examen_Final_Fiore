
package modelo;

/**
 *
 * Tabla Fiore
 */
public class clUsuario {
    private String idUsuario;
    private String Nombre;
    private String Apellido;
    private String CorreoElectronico;
    private String Password;

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public String getPassword() {
        return Password;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
