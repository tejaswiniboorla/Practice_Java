package java_practice;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		char Gender='M';
		
		if(age==18)
		{
			System.out.println("Congrats");
			if(Gender=='F')
			{
				System.out.println("vote girl"); 
			}
		
		else
			
		{
			System.out.println("vote boy");
		}
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You cannot vote");
		}
	}
	}
}


