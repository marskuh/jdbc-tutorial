package com.example.javahelp.jdbc.intellij;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.SQLException;

/**
 * Here the {@link javax.sql.DataSource} is used instead of the {@link java.sql.DriverManager}.
 * This allows for easier migration to Spring Boot and enables us to use Connection Pooling.
 */
public class DataSourceExample {

    public static void main(String[] args) throws SQLException {
        System.out.println("This is the %s".formatted(DataSourceExample.class.getSimpleName()));

        final var dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("MYSQL_USER");
        dataSource.setPassword("MYSQL_PASSWORD");
        try (final var conn = dataSource.getConnection()) {
            final var rs = conn.createStatement().executeQuery("SELECT NOW()");
            if (rs.next()) {
                System.out.println(rs.getObject(1));
            }
        }
    }
}
