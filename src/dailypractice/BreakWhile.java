package dailypractice;

public class BreakWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int i=1;
		while(i<=10)
		{
			if(i==7)
			{
				System.out.println("Number not Found");
				
				break;
			}
			System.out.println(i);
			i++;
			
		}
		System.out.println("Bye");
	}
		}
			