import java.sql.*;

public class Startup {
  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
  static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:oracle";

  //  Database credentials
  static final String USER = "hr"; // fill in User here
  static final String PASS = "hr"; // fill in Password here

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;

    try {
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);
    } catch (ClassNotFoundException e) {
      System.err.print(e);
      System.exit(-1);
    }

    try {
      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM JOBS";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result se
      while (rs.next()) {
        //Retrieve by column name
        String title = rs.getString("job_title");

        //Display values
        System.out.println("Title: " + title);
      }
      //STEP 6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
    } catch (SQLException se) {
      //Handle errors for JDBC
      se.printStackTrace();
    } catch (Exception e) {
      //Handle errors for Class.forName
      e.printStackTrace();
    } finally {
      //finally block used to close resources
      try {
        if (stmt != null)
          stmt.close();
      } catch (SQLException se2) {
      }// nothing we can do
      try {
        if (conn != null)
          conn.close();
      } catch (SQLException se) {
        se.printStackTrace();
      }//end finally try
    }//end try

    System.out.println("Goodbye!");
  }//end main
}
