package _11_04_Array;

public class _11MaxIn3_3Matrix {

	public static void main(String[] args) 
	{
		if(args.length==9)
		{
		int no1=Integer.parseInt(args[0]);
		int no2=Integer.parseInt(args[1]);
		int no3=Integer.parseInt(args[2]);
		int no4=Integer.parseInt(args[3]);
		int no5=Integer.parseInt(args[4]);
		int no6=Integer.parseInt(args[5]);
		int no7=Integer.parseInt(args[6]);
		int no8=Integer.parseInt(args[7]);
		int no9=Integer.parseInt(args[8]);
		int[][] arr=new int[][] {{no1,no2,no3},{no4,no5,no6},{no7,no8,no9}};
		int max=arr[0][0];
		for(int i=2;i>=0;i--)
		{
			for(int j=2;j>=0;j--)
			{
				if(max<arr[i][j])
					max=arr[i][j];
			}
		}
		System.out.println(max);
		}
		else
			System.out.println("Please enter 9 integer numbers");

	}

}
