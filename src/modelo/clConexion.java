
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fiore
 */
public class clConexion{
    private final String base = "mysql_examenfiore";
    private final String user = "root";
    private final String password ="lauramaria1977";
    private final String url = "jdbc:mysql://localhost:3307/" + base;
    private Connection con = null;

    public Connection getConexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);

        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
