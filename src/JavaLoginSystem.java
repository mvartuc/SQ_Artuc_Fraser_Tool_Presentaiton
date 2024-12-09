import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JavaLoginSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/JavaLoginSystem";
        String username = "root";
        String password = "ThisIsNowThePassword";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Users");
            while(resultSet.next()) {
                //prints out the 'Users' table
                System.out.print(resultSet.getString("ID") + " ");
                System.out.print(resultSet.getString("usernames") + " ");
                System.out.print(resultSet.getString("passwords") + "\n");
            }


            connection.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        Login login = new Login();

    }
}