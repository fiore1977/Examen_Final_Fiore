
package modelo;

/**
 *
 * @author Fiore
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class clValidaSesion extends clConexion{
    public boolean buscar(clUsuario usuario){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cn = getConexion();
        String sql = "SELECT * FROM tblUsuario WHERE idUsuario = ?";
        try{
            ps = cn.prepareStatement(sql);
            ps.setString(1, usuario.getIdUsuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                usuario.setNombre(rs.getString("Nombre"));
                usuario.setPassword(rs.getString("Password"));
                return true;
            }
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        } 
    }
}
