package application;

public class DisplayDailyInput 
{

	private String id;
	private String name;
	private String date;
	private String wh;
	private String machine;
	private String process;
	private String shift;
	private String ot;
	private String eop;
	private String aop;
	private String me;
	private String rejection;
	private String efficiency;

	public DisplayDailyInput(String id, String name, String date, String wh, String machine, String process, String shift, String ot, String eop, String aop, String me, String rejection, String efficiency)
	{
		this.id = id;
		this.name = name;
		this.date = date;
		this.wh = wh;
		this.machine =machine;
		this.process =process;
		this.shift =shift;
		this.ot =ot;
		this.eop =eop;
		this.aop =aop;
		this.me =me;
		this.rejection =rejection;
		this.efficiency=efficiency;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name =name;
	}
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date =date;
	}
	public String getWh()
	{
		return wh;
	}
	
	public void setWh(String wh)
	{
		this.wh =wh;
	}
	public String getMachine()
	{
		return machine;
	}
	
	public void setMachine(String machine)
	{
		this.machine =machine;
	}
	public String getProcess()
	{
		return process;
	}
	
	public void setProcess(String process)
	{
		this.process =process;
	}
	public String getShift()
	{
		return shift;
	}
	
	public void setShift(String shift)
	{
		this.shift =shift;
	}
	public String getOt()
	{
		return ot;
	}
	
	public void setOt(String ot)
	{
		this.ot =ot;
	}
	public String getEop()
	{
		return eop;
	}
	
	public void setEop(String eop)
	{
		this.eop =eop;
	}
	public String getAop()
	{
		return aop;
	}
	
	public void setAop(String aop)
	{
		this.aop =aop;
	}
	public String getMe()
	{
		return me;
	}
	
	public void setMe(String me)
	{
		this.me =me;
	}
	public String getRejection()
	{
		return rejection;
	}
	
	public void setRejection(String rejection)
	{
		this.rejection =rejection;
	}
	
	public String getEfficiency()
	{
		return efficiency;
	}
	
	public void setEfficiency(String efficiency)
	{
		this.efficiency = efficiency;
	}
	
}
