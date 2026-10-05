package loops;

public class SumOfTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9998;
		int sum=0;
		for(int i=0;i<num;i++)
		{
			
			int LastDigit=num%10;
			sum=sum+LastDigit;
			num=num/10;
		}
		System.out.println(sum);
		int num1=8888;
		int sum1=0;
		while(num1>0)
		{
			int lastdigit1=num1%10;
			sum1=sum1+lastdigit1;
			num1=num1/10;
		}
		System.out.println(sum1);
	}
}