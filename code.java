import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsecureSQL {
    public static void main(String[] args) {
        String userInput = "admin'; --";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
