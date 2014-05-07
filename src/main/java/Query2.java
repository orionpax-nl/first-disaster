// Query1.java:  Query an mSQL database using JDBC.
//
// Copyright 1998 Developer's Daily (http://www.DevDaily.com). All rights reserved.


import java.sql.*;

class Query2 {

    public static void main (String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/test";
            Connection conn = DriverManager.getConnection(url,"root","root");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT name FROM players where id = 2");
            while ( rs.next() ) {
                String lastName = rs.getString("name");
                System.out.println(lastName);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

}