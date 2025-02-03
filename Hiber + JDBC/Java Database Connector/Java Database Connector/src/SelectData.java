import java.sql.*;

public class SelectData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Correct driver class name
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Replace with your actual DB details
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LPU", "root", "root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Department");

        while (rs.next()) {
            System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2));
        }

        // Close connections
        rs.close();
        st.close();
        con.close();
    }
}

/* 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

public class SelectData {
    public static void main(String[] args) {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }
    }
}
    */