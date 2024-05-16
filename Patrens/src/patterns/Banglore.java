package patterns;


	
	class Bike
	{
		private String brand;
		public float mileage;
		
		
		

		public Bike(String brand, float mileage) {
			super();
			this.brand = brand;
			this.mileage = mileage;
		}

		public String getBrand() {
			return brand;
		}

		public float getMileage() {
			return mileage;
		}
	}
	class Books
	{
		private  String Name;
		private String Author;
		public Books(String name, String author) {
			super();
			Name = name;
			Author = author;
		}
		public String getName() {
			return Name;
		}
		public String getAuthor() {
			return Author;
		}
	}
	class Brain
		{
			private float weight;
			private String colour;
			public Brain(float weight, String colour) {
				super();
				this.weight = weight;
				this.colour = colour;
			}
			public float getWeight() {
				return weight;
			}
			public String getColour() {
				return colour;
			}
			
		}
	class heart
	{
		private float Weight;
		private int BPM;
		public heart(float weight, int bPM) {
			super();
			Weight = weight;
			BPM = bPM;
		}
		public float getWeight() {
			return Weight;
		}
		public int getBPM() {
			return BPM;
		}
	
	}

	public class Human {
  
	Brain B =new Brain(45.6f,"gray"); 
	heart H = new heart(70.8f,72);
	public void hasA(Bike bi,Books bo) {
		System.out.println(bi.getBrand());
		System.out.println(bi.getMileage());
		System.out.println(bo.getName());
		System.out.println(bo.getAuthor());
	
	}
	}
	class Demo5
	{
		public static void main(String[] args) {
		Human  h = new Human();
		Bike b = new Bike("KTM",30.3f);
		Books bs  = new Books("Shiva","Shiva");
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package patterns;

public class Banglore {

}
