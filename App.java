import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Connection conexao = MySQLConector.conectar();
    }
}