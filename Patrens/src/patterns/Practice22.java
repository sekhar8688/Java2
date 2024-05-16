package patterns;

import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n%10==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		
       if(n>=100&&n<=108)
       {
    	   System.out.println("Yes");
       }
       else
       {
    	   System.out.println("No");
       }
       int m = scan.nextInt();
       int k  = scan.nextInt();
       if(m%2==0&&n%2==0)
       {
    	  System.out.println(m*k);
       }
       else
       {
    	   System.out.println(m+k);
       }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
