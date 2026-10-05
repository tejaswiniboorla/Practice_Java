package strings;

public class ReversingEachWord {

	public static void main(String[] args) {
		String str="I Love Java";
		String result="";
		String[] words=str.split(" ");
		for(String word: words) {
			String reverse="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse=reverse+word.charAt(i);
			}
			result=result+reverse+" ";
	
		}
		
		System.out.println(result.trim());
		
		String str2="I Love My India";
		String[] words2=str2.split(" ");
		String reverse2="";
		for(String word2: words2)
		{
			String result2="";
			for(int i=word2.length()-1;i>=0;i--)
			{
				result2=result2+word2.charAt(i);
			}
			reverse2=reverse2+result2+" ";
		}
		System.out.println(reverse2.trim());
	}
}