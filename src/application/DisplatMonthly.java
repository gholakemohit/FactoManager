package application;

public class DisplatMonthly 
{

	private String id;
	private String nod;
	private String date;
	private String target;
	private String present;
	private String rejection;
	private String worker;
	private String owner;
	private String work;
	private String oeff;
	
	public DisplatMonthly(String id, String nod, String date, String target, String present, String rejection, String worker, String owner, String work,String oeff)
	{
		this.id = id;
		this.nod = nod;
		this.date = date;
		this.target = target;
		this.present = present;
		this.rejection =rejection;
		this.worker= worker;
		this.owner= owner;
		this.work= work;
		this.oeff= oeff;
		
		
	}
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	public String getNod()
	{
		return nod;
	}
	
	public void setNod(String nod)
	{
		this.nod = nod;
	}
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	public String getTarget()
	{
		return target;
	}
	
	public void setTarget(String target)
	{
		this.target = target;
	}
	public String getPresent()
	{
		return present;
	}
	
	public void setPresent(String present)
	{
		this.present = present;
	}
	public String getRejection()
	{
		return rejection;
	}
	
	public void setRejection(String rejection)
	{
		this.rejection = rejection;
	}
	public String getWorker()
	{
		return worker;
	}
	
	public void setWorker(String worker)
	{
		this.worker = worker;
	}
	public String getOwner()
	{
		return owner;
	}
	
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public String getWork()
	{
		return work;
	}
	
	public void setWork(String work)
	{
		this.work = work;
	}
	public String getOeff()
	{
		return oeff;
	}
	
	public void setOeff(String oeff)
	{
		this.oeff = oeff;
	}
}
