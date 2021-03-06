
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fiore
 */
public class ConsultasCliente extends clConexion{
    public boolean registrar (clCliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        
        String sql = "INSERT INTO dbagencia.tblCliente (idCliente, documento, TipoDocumento, Nombres, Apellidos, FechaNacimiento, direccion, ciudad, telefono, mail) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getIdCliente());
            ps.setString(2, cli.getDocumento());
            ps.setString(3, cli.getTipoDocumento());
            ps.setString(4, cli.getNombres());
            ps.setString(5, cli.getApellidos());
            ps.setDate(6, cli.getFechaNacimiento());
            ps.setString(7, cli.getDireccion());
            ps.setInt(8, cli.getCiudad());
            ps.setString(9, cli.getTelefono());
            ps.setString(10, cli.getMail());
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
     public boolean modificar(clCliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE dbagencia.tblCliente SET documento=?, TipoDocumento=?, Nombres=? WHERE idCliente=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getDocumento());
            ps.setString(2, cli.getTipoDocumento());
            ps.setString(3, cli.getNombres());
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
     
     public boolean eliminar(clCliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM dbagencia.tblCliente WHERE idCliente=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getIdCliente());
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
    
    public boolean buscar(clCliente cli) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM dbagencia.tblCliente WHERE idCliente=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getIdCliente());
            rs = ps.executeQuery();

            if (rs.next()) {
                cli.setIdCliente(Integer.parseInt(rs.getString("idCliente")));
                cli.setDocumento(rs.getString("documento"));
                cli.setTipoDocumento(rs.getString("TipoDocumento"));
                cli.setNombres(rs.getString("Nombres"));
                cli.setApellidos(rs.getString("Apellidos"));
                cli.setFechaNacimiento(rs.getDate("FechaNacimiento"));
                cli.setDireccion(rs.getString("direccion"));
                cli.setCiudad(rs.getInt("ciudad"));
                cli.setTelefono(rs.getString("telefono"));
                cli.setMail(rs.getString("mail"));
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
