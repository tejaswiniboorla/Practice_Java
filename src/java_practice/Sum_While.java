package java_practice;

public class Sum_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=998877;
		int sum=0;
		for(;num>0;)
		{
		int lastdigit=num%10;
		sum=sum+lastdigit;
		num=num/10;
			
		}
		System.out.println("Sum of the numbers = " +sum);
		
		
		int i=1122334455;
		int sum1=0;
		while(i>0)
		{
			int lastdigit1=i%10;
			sum1=sum1+lastdigit1;
			i=i/10;
			
		}
		System.out.println("Sum of the numbers = " +sum1);
	}
		}