# IntelliJ

This shows the IntelliJ setup, when using a MYSQL database from Java.

It requires a JDK 18 and a mysql database running on default settings:
- Host: localhost
- Port: 3306
- Database: test
- User: MYSQL_USER
- Password: MYSQL_PASSWORD

## JDBC Connection String

The JDBC connection string is used by the `javax.sql.DataSource` or the `javax.sql.DriverManager` to determine which JDBC driver to use
to communicate with the according database.

### MYSQL

Example: `jdbc:mysql://localhost:3306/test`

Documentation: https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-connect-drivermanager.html

### Postgres

Example: `jdbc:postgresql://host:port/database`

Documentation: https://jdbc.postgresql.org/documentation/use/

## Structure

The class <a href="./src/com/example/javahelp/jdbc/intellij/SimpleExample.java">SimpleExample.java</a> shows how to open a connection and perform an example query.

The class <a href="./src/com/example/javahelp/jdbc/intellij/DataSourceExample.java">DataSourceExample.java</a> shows how to use the `javax.sql.DataSource` interface instead (recommended)

The examples using a `DataSource` are the way to go and will help migrating an application to Spring Boot or other frameworks more easily.


## Postgres, Oracle, etc.

If you want to use a different database, you simply have to drop the according JDBC drivers to the <a href="./libs">libs</a> directory and use a different JDBC connection string.