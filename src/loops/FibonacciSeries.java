package loops;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b+" ");
		for(int i=10;i>2;i--)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		
		
	}
}