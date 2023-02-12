# Maven

Raw project setup. 

Has not been tested or verified.


## Build project

`./mvnw clean package`

Refer to the `target` directory, your classes should be in file `target-maven-setup-1.0.0-SNAPSHOT.jar`.

The contents of that file look like this:

```bash
Archive:  target/maven-setup-1.0.0-SNAPSHOT.jar
  Length      Date    Time    Name
---------  ---------- -----   ----
        0  02-12-2023 15:09   META-INF/
       81  02-12-2023 15:09   META-INF/MANIFEST.MF
        0  02-12-2023 15:09   com/
        0  02-12-2023 15:09   com/example/
        0  02-12-2023 15:09   com/example/javahelp/
        0  02-12-2023 15:09   com/example/javahelp/jdbc/
        0  02-12-2023 15:09   com/example/javahelp/jdbc/maven/
        0  02-12-2023 15:09   META-INF/maven/
        0  02-12-2023 15:09   META-INF/maven/com.example.javahelp.jdbc-tutorial/
        0  02-12-2023 15:09   META-INF/maven/com.example.javahelp.jdbc-tutorial/maven-setup/
      580  02-12-2023 15:09   com/example/javahelp/jdbc/maven/Main.class
     1220  02-12-2023 15:05   META-INF/maven/com.example.javahelp.jdbc-tutorial/maven-setup/pom.xml
       89  02-12-2023 15:09   META-INF/maven/com.example.javahelp.jdbc-tutorial/maven-setup/pom.properties
---------                     -------
     1970                     13 files
```

## Starting the application

TBD (not working yet)