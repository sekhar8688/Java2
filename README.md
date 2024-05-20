package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class yennam implements Comparable<yennam>
{
	private int id;
	private String name;
	private String email;
	private Double phone;
	public yennam() {
		// TODO Auto-generated constructor stub
	}
	public yennam(int id, String name, String email, Double phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
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
	public Double getPhone() {
		return phone;
	}
	public void setPhone(Double phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " "+name + " "+email+ " "+phone+ " ";
	}
	private void compareto(yennam y2) {
		yennam y1= this;
		y1.compareto(y2);
	}
	@Override
	public int compareTo(yennam o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class Day20 {

	public static void main(String[] args) {
		yennam y1 = new yennam(1,"sekhar","sekhar@gmail.com",7032954898d);
		yennam y2 = new yennam(2,"shiva","shiva@gmail.com",3947949749d);
		yennam y3 = new yennam (3,"shetty","shetty@g,ail.com",483393738d);
		ArrayList<yennam> al= new ArrayList<yennam>();
		al.add(y1);
		al.add(y2);
		al.add(y3);
		System.out.println();
	    Collections.sort(al);
	    System.out.println();
		

	}

}
