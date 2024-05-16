package patterns;
import java.util.Scanner;
public class Arrays2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of students :");
		int m=scan.nextInt();
		int [] []a = new int [2][m];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print("enter the age of class " + i + " students "+ j );
			a[i][j]=scan.nextInt();
			
			}
		}
			for(int i =0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					
						System.out.print(a[i][j] + "  ");
						
				}
				
				System.out.println();
				}
	}
}

			
		
	


	
		
		// TODO Auto-generated method stub

	


	
	
