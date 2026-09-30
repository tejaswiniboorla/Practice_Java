package java_practice;

public class NumberOfDigits_ForLoop {

	private static final String Count = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num=123456;
	int count=0;
	for(;num>0;)
	{
		num=num/10;
		count++;
	}
	System.out.println("Number of Digits = " + count);
	
	
	
	long num1=1234567890l;
	int count1=0;
	while(num1>0)
	{
		num1=num1/10;
		count1++;
	}
	System.out.println("Number of Digits = " +count1);
	
	}
	
}
