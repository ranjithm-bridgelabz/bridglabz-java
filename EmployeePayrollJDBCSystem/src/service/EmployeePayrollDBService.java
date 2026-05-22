package service;

import java.sql.*;

public class EmployeePayrollDBService {

    String jdbcURL =
            "jdbc:mysql://localhost:3306/payroll_service";

    String username = "root";
    String password = "root";

    Connection connection;

    public Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    jdbcURL,
                    username,
                    password);

            System.out.println("Connection Successful");

        } catch (Exception e) {

            e.printStackTrace();
        }

        return connection;
    }
}