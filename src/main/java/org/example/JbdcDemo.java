package org.example;

import java.sql.*;

public class JbdcDemo {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mySQL","root","root");

        Statement stmt1 = connection.createStatement();
        ResultSet resultSet = stmt1.executeQuery("select * from Sales_Rep");
        while (resultSet.next()){
            Integer repId = resultSet.getInt("Rep_ID");
            String name = resultSet.getString("Name");
            String city = resultSet.getString("City");
            Double commission = resultSet.getDouble("commision");
            System.out.println("Representative Id: "+repId+", Name: "+name+", City: "+city+", Commission: "+commission);
        }

        PreparedStatement pstmt = connection.prepareStatement("insert into Sales_Rep values(?,?,?,?)");
        pstmt.setInt(1,1030);
        pstmt.setString(2,"Pavishnu");
        pstmt.setString(3,"Chennai");
        pstmt.setDouble(4,7.9);

        System.out.println("Record registered successfully");
        pstmt.executeUpdate();
        System.out.println("Record registered successfully");
    }
}


