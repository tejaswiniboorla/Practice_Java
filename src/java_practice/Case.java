package java_practice;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='!';
		if(ch>='A' && ch<='Z')
		{
			System.out.println("UpperCase");
			
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("LowerCase");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}

}
