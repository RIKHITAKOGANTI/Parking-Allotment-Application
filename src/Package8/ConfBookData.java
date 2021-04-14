package Package8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ConfBookData
{
	public int registerEmployee(ConfBook employee)throws ClassNotFoundException{
		
		String INSERT_USERS_SQL = "INSERT INTO timings" +
		"(slotid,starttime,endtime,vehno,duration) VALUES" +
		"(?,?,?,?,?);";
		String update_lots="update lots set status ='occupied' where id=?";
		int result = 0;
		int res=0;
		Class.forName("com.mysql.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","Rikhita123#");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			PreparedStatement ps1 = connection.prepareStatement(update_lots);
			
			preparedStatement.setString(1, employee.getSlotid());
			preparedStatement.setString(2, employee.getStime());
			preparedStatement.setString(3, employee.getEtime());
			preparedStatement.setString(4, employee.getVehnum());
			preparedStatement.setString(5, employee.getDuration());
			ps1.setNString(1,employee.getSlotid());
			System.out.println(preparedStatement);
			result= preparedStatement.executeUpdate();
			res=ps1.executeUpdate();
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
