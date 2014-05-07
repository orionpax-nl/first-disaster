import java.sql.*;

class Query1 {

    public static void main (String[] args) {


        try {

            String url = "jdbc:msql://localhost:8889/test";
            Connection conn = DriverManager.getConnection(url,"root" ,"root");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT name FROM players");
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