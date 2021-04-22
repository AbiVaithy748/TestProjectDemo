package Code;

public class Subject {
	private String SubName;
	private int Credits;
	
	public Subject (String SubName , int Credits)
	{
		super();
		this.SubName = SubName;
		this.Credits = Credits;
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
