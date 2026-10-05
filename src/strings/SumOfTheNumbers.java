package strings;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A123456R9";
		int sum=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum=sum+Integer.parseInt(str.charAt(i)+"");
			}
		}
			System.out.println(sum);
		
		
	}	
		
	}
	
