package java_practice;

public class Marks_Grade {
	public static void main(String[] args)

	{
		int Marks=9;
		 if(Marks>=90 && Marks<=100)
		{
			System.out.println("Grade A");
		
		}
		else if (Marks>=75 && Marks<=89)
		{
			System.out.println("Grade B");
		}
		else if (Marks>=60 && Marks<=74)
		{
			System.out.println("Grade C");
		}
		else if(Marks>=40 && Marks<=59)
		{
			System.out.println("Grade D");
		}
		else if(Marks>=0 && Marks<=39)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Not Valid");
		}
}
}
