package org.example;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mySQL","root","root");
        PreparedStatement pstmt = connection.prepareStatement("insert into Sales_Rep values(?,?,?,?)");
        pstmt.setInt(1,1030);
        pstmt.setString(2,"Pavishnu");
        pstmt.setString(3,"Chennai");
        pstmt.setDouble(4,7.9);

        System.out.println("Record registered successfully");
        pstmt.executeUpdate();
    }
}
