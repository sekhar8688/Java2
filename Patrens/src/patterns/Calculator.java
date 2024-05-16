package patterns;

public class Calculator {

	int a = 40;
	int b = 45;
	
	void add()
	{
		int c = a+b;
		System.out.println(c);
		
	}
	
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add();
		// TODO Auto-generated method stub

	}

}
