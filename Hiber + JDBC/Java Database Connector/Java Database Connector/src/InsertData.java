//package JDBC;

import java.sql.*;



	public class InsertData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LPU", "root", "root");
        Statement st = con.createStatement();

        int n = st.executeUpdate("insert into Employee values(10,'Lakshay ', 'Kumar',3)");
        int n1 = st.executeUpdate("delete from Employee where EmployeeID =5");

        int n2 = st.executeUpdate("update Employee set FirstName = 'Abhas' where EmployeeID = 2");
        if (n2 > 0) {
            System.out.println("Record updated successfully!");
        } else {
            System.out.println("No records were updated.");
        }

        System.out.println(n + " records are inserted into the employee table");
        con.close();
    }
}
