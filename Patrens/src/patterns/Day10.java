package patterns;

import java.util.ArrayList;

class Student implements Comparable<Student>
{
	 private int id;
	 private String name;
	 private String email;
	 private float height;
	 
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String email, float height) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		
		return id + " " + name + " "+ email + " "+height + " ";
	}
	  @Override
	public int compareTo(Student s2) {
		  Student s1 = this;
		  Integer i1=s1.id;
		  Integer i2 = s2.id;
		  return s1.compareTo(s2);
		
	}
	
}
public class Day10 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList <Student> ();
		Student s1 = new Student(1,"sekhar","sek@gmail.com",5.9f);
		Student s2 = new Student(2,"vinay","sek@gmail.com",5.4f);
		Student s3 = new Student(3,"kingu","sek@gmail.com",5.8f);
		Student s4 = new Student(4,"shiv","sek@gmail.com",5.5f);
	       al.add(s1);
	       al.add(s2);
	       al.add(s3);
	       al.add(s4);
	       System.out.println(al);

	}

}
