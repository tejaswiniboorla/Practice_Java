package strings;

public class ReversingWithoutSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Interview";
		String reversed="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reversed=reversed+str.charAt(i);
		}
				System.out.println(reversed);
				
				
				
				
				String str2="Hello World";
				String reversed2="";
				for(int i=str2.length()-1;i>=0;i--)
				{
					reversed2=reversed2+str2.charAt(i);
				}
				System.out.println(reversed2);
				
				
				String str3="Python";
				String reversed3="";
				for(int i=str3.length()-1;i>=0;i--)
				{
					reversed3=reversed3+str3.charAt(i);
				}
				System.out.println(reversed3);
				
				
				String str4="I Love My India";
				String reversed4="";
				for(int i=str.length()-1;i>=0;i--)
				{
					reversed4=reversed4+str4.charAt(i);
				}
				System.out.println(reversed4);
				
				
				String str5="Today is very very cold day";
				String reversed5="";
				for(int i=str5.length()-1;i>=0;i--)
				{
					reversed5=reversed5+str5.charAt(i);
				}
				System.out.println(reversed5);
	}
	

}
