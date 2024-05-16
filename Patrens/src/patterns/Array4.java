package patterns;
import java.util.Scanner;
public class Array4 {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[5];
		for (int i=0;i<a.length;i++)
		{
			System.out.print(" enter a age of student " + i);
			a[i]=scan.nextInt();
			
		}
		

	 for (int i=0;i<a.length;i++)
		{
			 System.out.print(a[i]) ;
			
		}
	 System.out.println();
		
		// TODO Auto-generated method stub

	}

}


