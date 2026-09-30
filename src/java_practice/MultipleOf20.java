package java_practice;

public class MultipleOf20 {

	public static void main(String[] args) {
		int num=40;
		if(num%20==0)
		{
			System.out.println("Multiple of 20");
		}
		else if(num%4==0)
		{
			System.out.println("Multiple of 4");
		}
		else
		{
			System.out.println("Not a multiple of 4");
		}
	}

}
