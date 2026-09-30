package day3;

class TestT
{
	String numberOfStudents;
	int num1;
	int num2;
	void hello()
	{
		System.out.println("hello");
	}
	TestT(int num1,int num2)
	{
	this.num1=num1;
	this.num2=num2;
	}
	void bye()
	{
		this.hello();
		System.out.println(this.num1+" "+this.num2+" ");
		System.out.println(this.numberOfStudents);
	}
}

public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestT t1=new TestT(20,30);
		System.out.println(t1.num1);
		System.out.println(t1.num2);
	}

}
