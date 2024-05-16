package patterns;
import java.util.Scanner;
public class Array8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]a=new int [2];
		long[]b=new long[2];
		for(int i=0;i<2;i++)
		{
			
				System.out.println("enter the age" + i );
				a[i]=scan.nextInt();
				System.out.println("Enter phn nnum :"+i);
				b[i]=scan.nextLong();
			}
		
	for(int i=0;i<2;i++)
	{
		System.out.println(a[i]);
		System.out.println(b[i]);
		}
	}
		// TODO Auto-generated method stub

}


