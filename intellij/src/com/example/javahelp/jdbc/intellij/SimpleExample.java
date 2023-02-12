package com.example.javahelp.jdbc.intellij;

import java.sql.*;


/**
 * This is a bare minimum example to show how to use JDBC in combination with MYSQL.
 *
 * The library located in libs, was downloaded from the mvnrepository at https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.0.32
 *
 * Please refer to the official Connector/J documentation from oracle for more details:
 * https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-connect-drivermanager.html
 *
 * This is just an example, please do not use this in any kind of productive environment, as it is purely meant for learning exercises.
 */
public class SimpleExample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        System.out.println("This is the %s".formatted(SimpleExample.class.getSimpleName()));

        // This is here to ensure your classpath is set up correctly.
        // If this is not red, you are good to go
        // This is not required for "production usage"
        final var driver = new com.mysql.cj.jdbc.Driver();


        // This is another test, if the class can be loaded/found.
        // However, this will compile, and may not run, due to missing dependencies (classpath)
        // It is nowadays not required to get a connection anymore, as the Java Service API will take of registering
        // the driver.
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        // Getting a connection
        try (final Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=MYSQL_USER&password=MYSQL_PASSWORD")) { // this will auto-close the connection at the end
            // Do something with the Connection
            final Statement stmt = conn.createStatement();
            final ResultSet rs = stmt.executeQuery("SELECT NOW()");
            if (rs.next()) {
                final var now = rs.getObject(1);
                System.out.println(now);
            }
        } catch (SQLException ex) {
            // Not a good way to handle exceptions, for demonstration purposes only
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}