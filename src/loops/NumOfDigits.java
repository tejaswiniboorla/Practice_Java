package loops;

public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=987654321;
		int count=0;
		for(int i=0;i<num;i++)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		int num1=89798789;
		int count1=0;
		while(num1>0)
		{
			count1++;
			num1=num1/10;
		}
		System.out.println(count1);
	}

}
