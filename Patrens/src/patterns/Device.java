package patterns;


	
	class Charger
	{
		private String brand;
		private float voltage;
		public  Charger(String brand,float voltage)
		{
			super();
			
			this.brand = brand;
			this.voltage = voltage;
			
			
		}
		public String getBrand() {
			return brand;
		}
		public float getVoltage() {
			return voltage;
		}
	
		
	}	
		class OS 
		{
			private String name;
			private float size;
			public OS(String name, float  size)
			{
				super();
				this.name  = name;
				this.size  = size;
			}
			public String getName()
			{
				return name;
			}
			public float getSize()
			{
				return size;
			}
		}	
			class Mobile
			{
				OS os = new OS("andriod",20.34f);
				public void hasA(Charger ch)
				{
					System.out.println(ch.getBrand());
					System.out.println(ch.getVoltage());
				}
			}
		
		
	
	
	
	
public class Device {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Charger c = new Charger("samsung",54.8f);
		
		Mobile m = new Mobile();
		m.hasA(c);
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
	}
}


