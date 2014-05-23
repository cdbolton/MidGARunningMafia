import java.sql.Blob;
import java.util.ArrayList;

/**
 * Represents a Member of the MidGA Running Mafia
 * @author Chris
 */
public class Member {
	
	private String name;
	private String birthDate;
	private String accomplishments;
	private Blob picture;
	
	public Member(String name, String birthDate, String accomplishments, Blob picture){
		this.name = name;
		this.birthDate = birthDate;
		this.accomplishments = accomplishments;
		this.picture = picture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAccomplishments() {
		return accomplishments;
	}

	public void setAccomplishments(String accomplishments) {
		this.accomplishments = accomplishments;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	
	
	

}
