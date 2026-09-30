package day01;

public class ContinueForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		for(int num=1;num<=10;num++)
		{
			if(num==7)
			{
				continue;
			}
			System.out.println(num);
		}
		System.out.println("Bye");

	}

}
