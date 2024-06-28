import java.sql.*;


public class MyJDBC {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc.mysql://127.0.0.1:3306/pemain",
                    "root",
                    "kelompokduabelas"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");

            while(resultSet.next()){
                System.out.println(resultSet.getString("idpemain"));
                System.out.println(resultSet.getString("namapemain"));
                System.out.println(resultSet.getString("levelpemain"));
                System.out.println(resultSet.getString("poinpemain"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
