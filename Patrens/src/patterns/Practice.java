package patterns;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 5;
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
	
		
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
			if(i==0||i==n-1||j==0||j==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		int count = 1;
	for(int i=0;i<n;i++)
	{
		for (int j=0;j<n;j++)
		{
			if(count <10)
			{
				System.out.print("0");
			}
			System.out.print(count + " ");
			count++;
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	
	for (int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(i+j+1+ " ");
			
		}
		System.out.println();
		
	}
	
	System.out.println();
	System.out.println();
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	
	for (int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
	}
		
	System.out.println();
	System.out.println();
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	
	
	for( int i=0;i<=n;i++)
	{
		for(int k=0;k<=n-i-1;k++)
		{
			System.out.print(" ");
		}
		for (int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	
		
	for (int i=0;i<=n;i++)
	{
		for(int k=0;k<=n-i-1;k++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		
	System.out.println();
	System.out.println();
	
	
	for(int i=0;i<n;i++)
	{
		for(int k=0;k<n-1-i;k++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			if(j==0||j==i||i==n-1)
			{
				System.out.print("*" + " ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
		
	}
	System.out.println();
	System.out.println();
	
		
		
	for(int i=1;i<=n;i++)
	{
		for(int k=1;k<=n-i;k++)
		{
			System.out.print(" ");
		}	
		for(int j=1;j<=i;j++)
			{
			if(j==1||j==i||i==n)
			{
				 System.out.print(j+ " ");
			}
		else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==n)
				{
					System.out.print(j+" " );
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i+1;j++)
		{
			System.out.print(i+j-1+ " ");
		}
		System.out.println();
	}
		
		
	System.out.println();
	System.out.println();
		
		
		String s1="shiva";
		String s2 = "sekharreddy";
		System.out.println(s1.compareTo(s2));
		//System.out.println(s2);
		
		String s = "Tap";
		String s3 = "academy";
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
