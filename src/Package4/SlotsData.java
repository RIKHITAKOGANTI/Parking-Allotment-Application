package Package4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SlotsData {
	
	String databaseURL = "jdbc:mysql://localhost:3306/office";
    String user = "root";
    String password = "########";
     
    public List<Slots> list() throws SQLException {
        List<Slots> listCategory = new ArrayList<>();
         
        try (Connection connection = DriverManager.getConnection(databaseURL, user, password)) {
            String sql = "SELECT id,slotname FROM lots where status='empty'";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("slotname");
                Slots slot = new Slots(id, name);
                     
                listCategory.add(slot);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        return listCategory;
    }
	

}
