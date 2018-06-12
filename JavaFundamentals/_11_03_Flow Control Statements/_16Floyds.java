package _11_03_FlowControlStatements;

public class _16Floyds {

	public static void main(String[] args) 
	{
		if(args.length!=0)
		{
			int n=Integer.parseInt(args[0]);
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				System.out.print("*");
				System.out.println();
			}
		}
		else
		{
			System.out.println("Please enter an integer number");
		}
	}

}
