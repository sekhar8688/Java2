package patterns;

class Sekhar{
	public void admitStudemts()
	{
		System.out.println("admitStudents");
	}
	public void conductExam()
	{
		System.out.println("conductExam");
	}
 class School extends Sekhar
{
	public void admitStudemts()
	{
		System.out.println("admitStudents");
	}
	public void conductExam()
	{
		System.out.println("conductExam");
	}
	public void conductFieldTrips()
	{
		System.out.println("conductFieldTrips");
	}
    class College extends Sekhar
	{
	public void admitStudemts()
	{
	System.out.println("admitStudents");
	}
	public void conductExam()
	{
	System.out.println("conductExam");
	}
	public void conductIntrenships()
	{
	System.out.println("conductIntrenships");
	}
     class University extends  Sekhar
	{
	public void admitStudemts()
	{
	System.out.println("admitStudents");
	}
	public void coundutExam()
	{
	System.out.println("conductExam");
	}
	public void coundutresearch()
	{
	System.out.println("coundutresearch");
	}
  }
}
}



class Shiva
{
	void Sekhar(Sekhar ref )
	{
		ref.admitStudemts();
		ref.conductExam();
		ref.counductFiledTrips();
	}
}
	
	
 public class EducationalInstitute {
	

	public static void main(String[] args) {
		School s = new School();
		College c = new College();
		University u = new University();
		
		EducationalInstitute ref;
	}
}
}

