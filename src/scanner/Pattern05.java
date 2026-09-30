package scanner;

public class Pattern05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print(col+ " ");
			}
			System.out.println();
		}

	}

}
