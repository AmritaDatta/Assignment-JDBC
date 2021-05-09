package assignment_database;

import java.sql.*;
/*import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;*/

public class StudentTable {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName ("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded.............");
        
        Connection connection = DriverManager.getConnection("jdbc:myql://127.0.0.1:3306/test", "root", "charan");
        System.out.println("Connected to the database..........");
        
        Statement statement = connection.createStatement();
        
        System.out.println("Before creating the table...");
        
        statement.execute("CREATE TABLE `student1` (`id` INT(11) NULL DEFAULT NULL,`name` VARCHAR(25) NULL DEFAULT NULL,`class` VARCHAR(25) NULL DEFAULT NULL, `marks` INT(11) NULL DEFAULT NULL)");
        System.out.println("table created");
        
        statement.execute("insert into student1 values(5, 'Mohn','M.Tech', 98)");
        System.out.println("  Row inserted");
        
        statement.executeUpdate("insert into student1 values(6, 'Santi','B.Tech', 96)");
        System.out.println("  Row inserted");
        
        statement.executeUpdate("update student1 set name='Mohn Datta' where name='Mohn'");
        System.out.println("row updated");
        
        statement.executeUpdate("delete from student1 where name='Santi'");
        System.out.println("row deleted");
        
        connection.close();
        System.out.println("Connection closed...");
    } 
}
