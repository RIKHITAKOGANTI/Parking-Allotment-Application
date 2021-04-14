package Package3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterData {
	
	public int registerEmployee(Registration employee)throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO register" +
		"(first_name, last_name, username, password,vehiclenumber,contact) VALUES" +
		"(?,?,?,?,?,?);";
		int result = 0;
		int res=0;
		String insert_login="insert into login"+"(username,password) values"+"(?,?);";
		Class.forName("com.mysql.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","Rikhita123#");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			PreparedStatement ps2=connection.prepareStatement(insert_login);
			
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUsername());
			preparedStatement.setString(4, employee.getPassword());
			preparedStatement.setString(5, employee.getVehiclenumber());
			preparedStatement.setString(6, employee.getContact());
			ps2.setString(1,employee.getUsername());
			ps2.setString(2,employee.getPassword());
			System.out.println(preparedStatement);
			result= preparedStatement.executeUpdate();
			res=ps2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
 }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
