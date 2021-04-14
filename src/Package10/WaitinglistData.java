package Package10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Package8.ConfBook;

public class WaitinglistData 
{
public int registerEmployee(Waitinglist employee)throws ClassNotFoundException{
		
		String INSERT_USERS_SQL = "INSERT INTO waitinglist" +
		"(slotid,vehnum,emailid) VALUES" +
		"(?,?,?);";
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","Rikhita123#");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1, employee.getSlotid());
			preparedStatement.setString(2, employee.getVehnum());
			preparedStatement.setString(3, employee.getEmail());
			System.out.println(preparedStatement);
			result= preparedStatement.executeUpdate();
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
