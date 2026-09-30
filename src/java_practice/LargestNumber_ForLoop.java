package java_practice;

public class LargestNumber_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=787654;
		int Largestnum=0;
		for(;num>0;)
		{
			int digit=num%10;
			if(digit>Largestnum)
			{
				Largestnum=digit;
			}
			num=num/10;
		}
		System.out.println("LargestNumber is : "+Largestnum);
		
	

	}
	}