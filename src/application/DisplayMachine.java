package application;

public class DisplayMachine {

	private String id;
	private String fname;
	private String lname;
	private String gender;
	
	public DisplayMachine(String id, String fname, String lname, String gender)
	{
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getFname()
	{
		return fname;
	}
	
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	
	public String getLname()
	{
		return lname;
	}
	
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	

}
