
package ConnectSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class MyConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-AV93HC7;"
                    + "Database=QLSVJava;"
                    + "user=adminsv;"
                    + "password=29112000;"
                    + "encrypt=false;";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Loi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public static void main(String[] args) {
        getConnection();
    }
}
