package java_practice;

public class Reverse_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int Reverse=0;
		for(;num>0;)
		{
			int LastDigit=num%10;
			Reverse=Reverse*10+LastDigit;
			num=num/10;
			
		}
		System.out.println("Reverse:"+Reverse);
	}
	
}
		