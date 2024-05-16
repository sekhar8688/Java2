package patterns;
import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] b = new int[3][5];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(" enter a age of student " + i + " enter a class " + j);
				b[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]);
				
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
