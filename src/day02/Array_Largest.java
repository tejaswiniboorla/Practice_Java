package day02;

public class Array_Largest {

	public static void main(String[] args) {
		int[] arr= {10,2,3,-1,99,7,99};
		int LargestNum=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>LargestNum)
			
				LargestNum=arr[i];
		}
		System.out.println(LargestNum);
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]==99)
				{
					System.out.println("Index of 99 is " + i);
					break;
				}
			}
	}
}
