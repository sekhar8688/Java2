package patterns;
import java.util.Scanner;
public class Bench {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a [][][] = new int [2][][];
		a[0]= new int [3][];
		a[1]= new int [2] [];
		a[0][0]= new int[25];
		a[0][1]= new int[30];
		a[0][2]= new int[28];
		a[1][0]= new int[20];
		a[1][1]= new int[27];
				
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for (int k=0;k<a[i][j].length;k++)
				{
					System.out.println("enter stuent of age "+ i + "enter student of room" + j + "enter a class" + k);
					a[i][j][k]= scan.nextInt();
				}
				
			}
		}
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for (int k=0;k<a[i][j].length;k++)
				{
				System.out.print(a[i][j][k]);
			}
			System.out.println();
		}
				

	}
	}

}
