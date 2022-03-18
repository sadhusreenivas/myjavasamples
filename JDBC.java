import java.sql.*;
 
public class JDBC {
    public static void main(String arg[])
    {
        Connection connection = null;
        
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","sadhu", "sadhu@123");
 
            // mydb is database
            // root is name of database
            // toor is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from users");
            int uid;
            String pass;
            while (resultSet.next()) {
                uid = resultSet.getInt("userid");
                pass = resultSet.getString("pwd").trim();
                System.out.println("User ID: " + uid  + " Password : " + pass);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends
} // class ends