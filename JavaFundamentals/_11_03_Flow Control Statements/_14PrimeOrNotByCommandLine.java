package _11_03_FlowControlStatements;

public class _14PrimeOrNotByCommandLine
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		if(args.length!=0)
		{
			int num=Integer.parseInt(args[0]);
			if(num==1||num==0)
				System.out.println(num+" is neither prime nor composite");
			else
			{
				for(int i=2;i<num/2;i++)
				{
					if(i%num==0)
					{
						flag=true;
						break;
					}
				}
			}
			if(flag)
				System.out.println(num+" is a prime number");
			else
				System.out.println(num+" is not a prime number");
		}
		else
			System.out.println("Please enter an integer number ");
	}
}
