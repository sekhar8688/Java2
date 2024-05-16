package patterns;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]a = new int[5];
		for (int i=0;i<5;i++)
		{
			System.out.println( "enter the age of student" + i);
			a[i] = scan.nextInt();
		}
		for (int i=0;i<5;i++)
		{
			System.out.print( a[i]);
		}	
		
	}

}
