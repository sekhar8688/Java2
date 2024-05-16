package patterns;

public class Area {

 void area (int length , int breadth)
 {
	 int area = length * breadth;
	 System.out.println(area);
 }

   public static void main(String[] args)
   {
	   int length = 56;
	   int breadth = 45;
	   
	   Area a = new Area();
	   a.area(length ,  breadth);
	   
   
   
   }








}