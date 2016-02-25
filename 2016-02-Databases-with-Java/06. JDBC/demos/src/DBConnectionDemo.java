import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnectionDemo {
  private static final String JDBC_DRIVER =
      "oracle.jdbc.driver.OracleDriver";

  private static final String DB_URL =
      "jdbc:oracle:thin:@localhost:1521:oracle";
  private static final String USER = "hr";
  private static final String PASS = "hr";

  public static void main(String[] args) {
    List<Employee> employees = getEmployees();

    for (Employee employee : employees) {
      System.out.println(employee.sayName());
    }
  }

  private static List<Employee> getEmployees() {
    List<Employee> employees = new ArrayList<>();

    // step 1. Register database driver
    try {
      Class.forName(JDBC_DRIVER);
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }

    Connection conn = null;
    Statement statement = null;

    try {
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      statement = conn.createStatement();
      String sqlQuery = "select * from employees";
      ResultSet result = statement.executeQuery(sqlQuery);

      while (result.next()) {
        String firstName = result.getString("first_name");
        String lastName = result.getString("last_name");
        Date hireDate = result.getDate("hire_date");

        Employee emp = new Employee(firstName, lastName);
        employees.add(emp);
      }
    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println("Connection error!");
    } finally {
      if (conn != null) {
        try {
          // close connection!!
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }

      if (statement != null) {
        try {
          statement.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }

    return employees;
  }

}