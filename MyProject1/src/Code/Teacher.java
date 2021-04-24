package Code;

public class Teacher {
	private int TID;
	private String TName;
	private String SubjectName;
	
	public Teacher(int TID , String TName , String SubjectName)
	{
		super();
		this.TID = TID;
		this.TName = TName;
		this.SubjectName = SubjectName;
	}
	
	public int getTID()
	{
		return TID;
	}
	
	public void setTID(int TID)
	{
		this.TID = TID;
	}
	
	public String getTName()
	{
		return TName;
	}
	
	public void setTName(String TName)
	{
		this.TName = TName;
	}
	
	public String getSubjectName()
	{
		return SubjectName;
	}
	
	public void setSubjectName(String SubjectName)
	{
		this.SubjectName = SubjectName;
	}
}
