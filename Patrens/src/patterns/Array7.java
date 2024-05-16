package patterns;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] b = new int[3][];
		b[0] = new int[2];
		b[1] = new int [5];
		b[2] = new int[2];
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
		System.out.println();
		// TODO Auto-generated method stub

	}

}
