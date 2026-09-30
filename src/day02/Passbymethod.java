package day02;

public class Passbymethod {
	
	static void increment1(int num)
	{
		num++;
	}
	static void increment2(int[] arr)
	{
		arr[0]++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data=10;
		increment1(data);
		System.out.println(data);
		
		int[] arrA= {100,200,300};
		increment2(arrA);
		System.out.println(arrA[0]);
		System.out.println(arrA[2]);
		System.out.println(arrA[1]);
	}

}
