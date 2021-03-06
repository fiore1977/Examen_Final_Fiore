
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Fiore
 */
public class ConsultaContinente extends clConexion{
    public boolean registrar (clContinente cont) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO dbagencia.tblContinente (idContinente, descripcion) VALUES(?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cont.getIdContinente());
            ps.setString(2, cont.getDescripcion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean modificar(clContinente cont, String descripcion) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update dbagencia.tblcontinente set descripcion='"+descripcion+"' where idContinente = '"+cont.getIdContinente()+"';";
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean eliminar(clContinente cont) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM dbagencia.tblContinente WHERE descripcion=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cont.getDescripcion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean buscar(clContinente cont) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM dbagencia.tblContinente WHERE descripcion=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cont.getDescripcion());
            rs = ps.executeQuery();

            if (rs.next()) {
                cont.setIdContinente(Integer.parseInt(rs.getString("idContinente")));
                cont.setDescripcion(rs.getString("descripcion"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
}
