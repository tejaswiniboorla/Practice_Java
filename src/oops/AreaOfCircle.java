package oops;
 abstract class Shape{
	 abstract void area();
	 
}
 
class Circle extends Shape{
	int radius=5;
	void area()
	{
		double result=Math.PI*5*5;
		System.out.println(result);
	}
}

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.area();

	}

}
