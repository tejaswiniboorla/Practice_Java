package day3;

public class Access {
	
	private int privateNum;
	int defaultNum;
	protected int protectedNum;
	public int publicNum;
	
	void print()
	{
		System.out.println(privateNum+""+defaultNum+""+protectedNum+""+publicNum);
	}
}

