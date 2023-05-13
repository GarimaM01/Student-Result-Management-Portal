package Connection;


import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement1","root","micro_code01");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }
}
