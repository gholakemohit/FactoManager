package application;

public class DisplayEmployee 
{
	private String id;
	private String fname;
	private String lname;
	private String gender;
	private String mno;
	private String address;
	
	public DisplayEmployee(String id, String fname, String lname, String gender, String mno, String address)
	{
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.mno =mno;
		this.address = address;
		
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
	
	public String getMno()
	{
		return mno;
	}
	
	public void setMno(String mno)
	{
		this.mno = mno;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}

}
