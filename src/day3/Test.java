package day3;
import java.lang.*;
public class Test {
	int TestCode;
	String TestName;
	 Test()
	{
		
	}
	 Test(int TestCode1,String TestName1)
	 {
		 TestCode=TestCode1;
		 TestName=TestName1;
	 }
	Test(int TestCode1)
	{
		TestCode=TestCode1;
	}
	void print()
	{
		System.out.println(TestCode+":"+TestName);
	}
	int getTestCode()
	{
		return TestCode;
	}
	void setTestCode(int TestCode1)
	{
		TestCode1=TestCode;
	}
	String getTestName()
	{
		return TestName;
	}
	void setTestName(String TestName1)
	{
		TestName=TestName1;
	}
}
