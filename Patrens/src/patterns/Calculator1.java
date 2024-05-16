package patterns;
import java.util.Scanner;
interface calculator
{
	public void add();
	public void sub();
}
class mycalculator1 implements calculator
{
	public void add()
	{
		int a  = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a  = 10;
		int b = 20;
		int c = a-b;
		System.out.println(c);
	}
}
class mycalculator2 implements calculator
{
	public void add()
	{
		int a  = 10;
		int b = 20;
		int c = a*b;
		System.out.println(c);
	}
	public void sub()
	{
		int a  = 10;
		int b = 20;
		int c = a/b;
		System.out.println(c);
	}
	
	
}
class mycalculator3 implements calculator
{
	public void add()
	{
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter n values");
		int n = scan.nextInt();
	}
	public void sub()
	{
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter n values");
		int n = scan.nextInt();
	}
}

class math 
{
	public static void permit(calculator ref)
	{
		ref.add();
		ref.sub();
	}
}



public class Calculator1 {
	public static void main(String[] args) {
		mycalculator1 mc1 = new mycalculator1();
		mycalculator2 mc2 = new mycalculator2();
		mycalculator3 mc3 = new mycalculator3();
		
		
		math.permit(mc1);
		math.permit(mc2);
		math.permit(mc3);
		
	}

}
