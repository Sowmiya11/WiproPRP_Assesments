package _11_04_Array;

public class _10ReverseTwoTwoMatrix 
{
	public static void main(String[] args) 
	{
		if(args.length>3)
		{
		int no1=Integer.parseInt(args[0]);
		int no2=Integer.parseInt(args[1]);
		int no3=Integer.parseInt(args[2]);
		int no4=Integer.parseInt(args[3]);
		int[][] arr=new int[][] {{no1,no2},{no3,no4}};
		int newArr[][]=new int[2][2];
		for(int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
				newArr[i][j]=arr[i][j];
				System.out.print(newArr[i][j]+" ");
			}
			System.out.println();
		}
		}
		else
			System.out.println("Please enter 4 integer numbers");
	}

}
