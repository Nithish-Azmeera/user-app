package spring.mongo.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {

    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";
	 
	@Id
	private long id;
	private String uname;
	private String ulocation;
	private String uoccupation;
	private int uage;
	
	public long getId() {
        return id;
    }

    public void setId(long l) {
        this.id = l;
    }
	
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUlocation() {
		return ulocation;
	}
	public void setUlocation(String ulocation) {
		this.ulocation = ulocation;
	}
	public String getUoccupation() {
		return uoccupation;
	}
	public void setUoccupation(String uoccupation) {
		this.uoccupation = uoccupation;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	
	
}
