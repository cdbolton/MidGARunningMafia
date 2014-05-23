import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Blob;



public class MemberHelperDAO {
	   
	
	private Connection conn;
	
	/**
	 * Constructor connects to the database MidGARunningMafia
	 * @throws Exception
	 */
	public MemberHelperDAO() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MidGARunningMafia", "root", "opening1");

	}
	   /**
	    * Reads all members from the table
	    * @return
	    */
		
	   public ArrayList<Member> readMembers(){
		   ArrayList<Member> result = new ArrayList<Member>();
		   Statement stmt = null;
		   
		   try{
			   stmt = conn.createStatement();
			   String sql;
			   sql = "SELECT Name, Birthdate, Accomplishments, Picture FROM Members";
			   ResultSet rs = stmt.executeQuery(sql);
			   
			   //Extract data from result set
			   while(rs.next()){
				   //Retrieve by column name
			       String name  = rs.getString("Name");
			       String birthday = rs.getString("Birthdate");
			       String accomplishments = rs.getString("Accomplishments");
		           Blob picture = (Blob) rs.getBlob("Picture");
		           
		           //Add member to list
		           result.add(new Member(name, birthday, accomplishments, picture));
		      }
		   }
		   catch(SQLException se){
			   
		   }
		   
		   return result;
	   }
	     
	   /**
	    * Removes a member from the table
	    * @param name
	    */
	   public void deleteMember(String name){
		   
	   }
	   
	   /**
	    * Updates a member in the table
	    * @param name
	    */
	   public void updateMember(String name){
		   
	   }
	   
	   /**
	    * Adds a member to the table
	    * @param member
	    */
	   public void addMember(Member member){
		   
	   }
	   
	   /**
	    * Closes the connection to the database
	    */
	   public void close(){
		   try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
