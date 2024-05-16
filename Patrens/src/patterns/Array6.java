package patterns;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][][] c = new int [3][4][5];
		for (int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				for(int k=0;k<c[i][j].length;k++)
				{
					System.out.print("enter the age" + i+ "enter the class" + j + "enter the students" + k);
				c[i][j][k] = scan.nextInt();
				}
				
			}
		}
		for (int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				for(int k=0;k<c[i][j].length;k++)
				{
					System.out.print(c[i][j][k] + " ");
				 
				}
				System.out.println();
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
