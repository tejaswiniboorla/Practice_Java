package scanner;

public class Pattern_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int row=1;row<=n;row++)
		{
		for(int col=1;col<=n-row+1;col++)
		{
			System.out.print(col +" " );
		}
		System.out.println();
	}

}
}
