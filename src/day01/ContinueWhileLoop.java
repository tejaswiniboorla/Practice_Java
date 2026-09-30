package day01;

public class ContinueWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int num=0;
		while(num<=9)
		{
			num++;
			if(num==7)
			{
				continue;
			}
			System.out.println(num);
			
		}
		System.out.println("Bye");

	}

}
