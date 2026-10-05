package oops;
interface Vechicle{
	void start();
	void stop();
}
	class Car implements Vechicle{
		public void start()
		{
			System.out.println("Started");
		}
		public void stop()
		{
			System.out.println("Stopped");
		}
	
}
public class Program_Vechicles_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		//c.start();
		//c.stop();

	}

}
