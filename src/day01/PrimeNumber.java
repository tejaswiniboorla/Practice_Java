package day01;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=91;
		boolean flag=false;
		if(num==1)
			System.out.println("1 is neither prime number nor composite number");
		else if(num==2)
			System.out.println("Prime Number");
		else if(num%2==0)
			System.out.println("Not a prome number");
		else
		{
		for(int Fact=3;Fact<num;Fact=Fact+2)
		{
			if(num%Fact==0)
			{
				flag=true;
			
				System.out.println("Not a Prime");
				
			break;
		}
		}
		if(flag==false)
		System.out.println("Prime Number");
	}
}
}
