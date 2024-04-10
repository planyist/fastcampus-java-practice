package part5;

import model.Connection;
import model.MSSQLDriver;
import model.MySQLDriver;
import model.OracleDriver;

public class DatabaseConnection {
    public static void main(String[] args) {
        Connection conn = new OracleDriver();
        conn.getConection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");

        conn = new MySQLDriver();
        conn.getConection("jdbc:mysql://localhost:3306/test", "root", "12345");

        conn = new MSSQLDriver();
        conn.getConection("jdbc:sqlserver://localhost:1433;DatabaseName=mem", "sa", "12345");
    }
}
