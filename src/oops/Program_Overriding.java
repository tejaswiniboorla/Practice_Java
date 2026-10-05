package oops;
class Animal{
	void sound()
	{
		System.out.println("Animal");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog");
	}
}

public class Program_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.sound();
	}

}
