package patterns;

public class Constuctorchaining {
	
	private int Cid;
	private String Cname;
	private long Cnum;
	public Constuctorchaining() {
		Cid = 1;
		Cname = "Sekhar";
		Cnum = 89784588L;
	}		
		public Constuctorchaining(int Cid, String Cname,long Cnum)
		{
			this();
			this.Cid = Cid;
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
		Constuctorchaining c1 = new Constuctorchaining(2,"shiva",8393738l);
		System.out.println(c1.GetCid());
		System.out.println(c1.GetCname());
		System.out.println(c1.GetCnum());
		System.out.println(c1.GetCid());
		System.out.println(c1.GetCname());
		System.out.println(c1.GetCnum());
		// TODO Auto-generated method stub

	}

}
