package Package7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Package3.Registration;


public class FreeSlotData
{
	public int freeSlot(FreeSlot free)throws ClassNotFoundException{
		String INSERT_USERS_SQL = "update lots set status ='empty' where id=?;";
		int result = 0;
		int res=0;
		String delete_field="delete from timings where slotid=?;";
		Class.forName("com.mysql.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","Rikhita123#");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			PreparedStatement ps2=connection.prepareStatement(delete_field);
			
			preparedStatement.setString(1, free.getSlotid());
			ps2.setString(1,free.getSlotid());
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
