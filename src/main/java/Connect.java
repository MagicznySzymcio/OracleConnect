import java.sql.*;

public class Connect {

    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection =
                    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain","szymon","szymon");
            Statement statement = connection.createStatement();

            ResultSet resultSet=statement.executeQuery("select * from SZYMON.LOTNISKA");
            while(resultSet.next())
                System.out.println(resultSet.getString(2));
            connection.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}