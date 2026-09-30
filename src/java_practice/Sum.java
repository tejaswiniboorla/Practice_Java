package java_practice;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456;
		int sum=0;
		for(int num1=0;num1>0;num1++)
		{
			int LastDigit=num1%10;
			sum=sum+ LastDigit;
			num1=num1/10;
			
			
		}
		System.out.println("Sum of the Digits of "+num+" =" +sum);
	}
}
