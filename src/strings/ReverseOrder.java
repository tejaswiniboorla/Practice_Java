package strings;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I Love Java";
		String[] words=str.split(" ");
		String result="";
		for(int i=words.length-1;i>=0;i--)
		{
			result=result+words[i]+" ";
		}
		System.out.println(result.trim());
		
		
		String str2="I love My India";
		String[] words2=str2.split(" ");
		String reverse2="";
		for(int i=words2.length-1;i>=0;i--)
		{
			reverse2=reverse2+words2[i]+" ";
		}
		System.out.println(reverse2.trim());
	
	
	String str3="Java is Programming Language";
	String[] words3=str3.split(" ");
	String reverese3="";
	for(int i=words3.length-1;i>=0;i--)
	{
		reverese3=reverese3+words3[i]+" ";
	}
	System.out.println(reverese3.trim());
	}
	}