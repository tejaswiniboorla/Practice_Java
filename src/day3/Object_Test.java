package day3;

public class Object_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		t1.print();
		Test t2=new Test(101,"SSC Exam");
		t2.print();
		Test t3=new Test(102);
		t3.print();
		t3.setTestCode(104);
		System.out.println(t3.getTestCode());
		t2.setTestName("CBSC Exam");
		System.out.println(t2.getTestName());

	}

}
