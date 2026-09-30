package java_practice;

public class FactorsOf24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=32;
		System.out.println("Factors of "+num+" are:");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
	{
				System.out.print(i+" ");
	}
	}
		int num1=48;
		System.out.println("\nFactors of "+num1+" are :");
		int i1=1;
		while(i1<=num1)
		{
			if(num1%i1==0)
			{
				System.out.print(i1+" ");
			}
			
			i1++;
		}
		
	}
}
		