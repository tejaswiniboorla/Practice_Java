package java_practice;

public class Reverse_WhileLoop {

	public static void main(String[] args) {
		int num=123456;
		
		int Reverse=0;
		for(;num>0;)
		{
			int Lastdigit=num%10;
			Reverse=Reverse*10+Lastdigit;
			num=num/10;
			
		}
		System.out.println("Reverse:"+Reverse);
		
		
		int num1=909;
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
			System.out.println("Polindrome");
		
		else
		
			System.out.println("Not a Palindrome");
		
		
	}

}
