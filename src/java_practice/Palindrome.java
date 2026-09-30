package java_practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=101;
		int Originalnum=num1;
		int reverse1=0;
		while(num1>0)
		{
			int Lastdigit1=num1%10;
			reverse1=reverse1*10+Lastdigit1;
			num1=num1/10;
		}
		System.out.println("Reverse:"+reverse1);
		if(Originalnum==reverse1)
		{
			System.out.println("Polindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
	}
}
}