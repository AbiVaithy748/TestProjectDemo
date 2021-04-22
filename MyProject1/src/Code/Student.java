package Code;

public class Student {
	private int StuID;
	private String SName;
	
	public Student (int StuID , String SName)
	{
		super();
		this.StuID = StuID;
		this.SName = SName;
	}
	
	public int getStuID()
	{
		return StuID;
	}
	
	public void setStuID(int StuID)
	{
		this.StuID = StuID;
	}
	
	public String getSName()
	{
		return SName;
	}
	
	public void setSName(String SName)
	{
		this.SName = SName;
	}

}
