package java_practice;

public class NumofDigits_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=122334;
		int count=0;
		for(;num>0;)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits = "+count);
		
		int i=98769876;
		int count1=0;
		while(i>0)
{
	i=i/10;
	count1++;
}
		System.out.println("Number of Digits = "+count1);
	}
}
