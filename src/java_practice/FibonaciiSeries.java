package java_practice;

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		int count=10;
		System.out.print(a+" "+b+" ");
		count=count-2;
		for(;count>0;count--)
		{
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
			int a1=0;
			int b1=1;
			int c1=0;
			System.out.println(a+" "+" ");
			for(int count1=10;count1>2;count1--)
			{
				c1=a1+b1;
				System.out.print(c1+" ");
				a1=b1;
				b1=c1;
			}
		}
	
		
		

	

}
