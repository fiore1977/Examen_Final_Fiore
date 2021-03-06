
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Fiore
 */
public class ConsultaPais extends clConexion{
    public boolean registrar(clPais pais) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO dbagencia.tblPais (idPais, idContinente, descripcion , nacionalidad) VALUES(?,?,?,?)";
         try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pais.getIdPais());
            ps.setInt(2, pais.getIdContinente());
            ps.setString(3, pais.getDescripcion());
            ps.setString( 4, pais.getNacionalidad());
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
    

 public boolean modificar(clPais pais, String descripcion) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update dbagencia.tblpais set descripcion='"+descripcion+"' where idPais = '"+pais.getIdPais()+"';";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pais.getIdPais());
            ps.setInt(2, pais.getIdContinente());
            ps.setString(3, pais.getDescripcion());
            ps.setString(4, pais.getNacionalidad());
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
 public boolean eliminar(clPais pais) {
        PreparedStatement ps = null;
        java.sql.Connection con = getConexion();

        String sql = "DELETE FROM dbagencia.tblpais WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pais.getIdPais());
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
 public boolean buscar(clPais pais) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        java.sql.Connection con = getConexion();


        String sql = "SELECT * FROM dbagencia.tblpais WHERE idPais=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pais.getIdPais());
            rs = ps.executeQuery();

            if (rs.next()) {
                pais.setIdPais(Integer.parseInt(rs.getString("pais")));
                pais.setIdContinente(rs.getInt("continente"));
                pais.setDescripcion(rs.getString("descripcion"));
                pais.setNacionalidad(rs.getString("nacionalidad"));
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
 
    public ResultSet ObtieneIdPais(){
        
        PreparedStatement ps = null;
        ResultSet    rs=null;
        java.sql.Connection con = getConexion();
        
        String sql = "Select idPais from dbagencia.tblPais where descripcion = ?";
        try{
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            return rs;
        }catch (SQLException e){
            System.err.println(e);
            return rs;
        }
            }
    public ResultSet ListarPaises(){
        PreparedStatement ps = null;
        ResultSet         rs = null;
        java.sql.Connection con = getConexion();
        
        String sql = "Select * from dbagencia.tblPais";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        }catch (SQLException e){
            System.err.println(e);
            return rs;
        }
        
    }
    public ArrayList ListaPais(){
        ArrayList<String> lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet         rs = null;
        java.sql.Connection con = getConexion();
        
        String sql = "Select * from dbagencia.tblPais";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String paq = rs.getString("descripcion");
                lista.add(paq);
            }
        }catch (SQLException e){
            System.err.println(e);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        return lista;
    }
    public ArrayList BuscarContinente(clContinente Continente) throws SQLException{
        PreparedStatement ps = null;
        ResultSet         rs = null;
        com.mysql.jdbc.Connection con = getConexion();
        String sql = "SELECT * FROM dbagencia.tblcontinente";
        ArrayList<String> pais = new ArrayList();
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String lsDescripcion = rs.getString("descripcion");    
                pais.add(lsDescripcion);
            }
        
        }catch(SQLException e){
            System.err.println(e);
        }finally{
            con.close();
        }
            return pais;
    }
     public ResultSet ObtieneIdContinente(clContinente continente){
        
        PreparedStatement ps = null;
        ResultSet    rs  = null;
        java.sql.Connection con = getConexion();
        
        String sql = "Select idContinente from dbagencia.tblContinente where descripcion = '"+continente.getDescripcion()+"'";
        try{
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            return rs;
        }catch (SQLException e){
            System.err.println(e);
            return rs;
        }
            }
}

