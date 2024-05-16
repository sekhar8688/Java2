package patterns;

public class Getterketter {
private int Cid;
private String Cname;
private long Cnum;

public Getterketter(int Cid , String Cname,long Cnum)
{
	this. Cid = Cid;
	this.Cname = Cname;
	this.Cnum = Cnum;
	
}
public int GetCid()
{
	return Cid;
}
public String GetCname()
{
	return Cname;
}
public long GetCnum()
{
	return Cnum;
}
	
	public static void main(String[] args) {
		Getterketter c = new Getterketter(1,"sekhar",897822131L);
		System.out.println(c.GetCid());
		System.out.println(c.GetCname());
		System.out.println(c.GetCnum());
		
		// TODO Auto-generated method stub

	}

}
