package strings;

public class ReversingString_SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java";
		StringBuilder sb=new StringBuilder(str);
		String reversed=sb.reverse().toString();
		System.out.println(reversed);
		
		String str1="Hello World";
		StringBuilder sb1=new StringBuilder(str1);
		String reversed1=sb1.reverse().toString();
		System.out.println(reversed1);
		
		String str3="I love Java";
		StringBuilder sb3=new StringBuilder(str3);
		String reversed3=sb3.reverse().toString();
		System.out.println(reversed3);
		
		
		
		String str4="Python";
		StringBuilder sb4=new StringBuilder(str4);
		String reversed4=sb4.reverse().toString();
		System.out.println(reversed4);
		
		
		
		String str5="I Love My India";
		StringBuilder sb5=new StringBuilder(str5);
		String revered5=sb5.reverse().toString();
		System.out.println(revered5);
		}

}
