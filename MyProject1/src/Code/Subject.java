package Code;

public class Subject {
	private int SubID;
	private String SubName;
	private int Credits;
	
	public Subject (int SubID , String SubName , int Credits)
	{
		super();
		this.SubID = SubID;
		this.SubName = SubName;
		this.Credits = Credits;
	}
	
	public int getSubID()
	{
		return SubID;
	}
	
	public void setSubID(int SubID)
	{
		this.SubID = SubID;
	}
	
	public String getSubName()
	{
		return SubName;
	}
	
	public void setSubName(String SubName)
	{
		this.SubName = SubName;
	}
	
	public int getCredits()
	{
		return Credits;
	}
	
	public void setCredits(int Credits)
	{
		this.Credits = Credits;
	}
	
}
