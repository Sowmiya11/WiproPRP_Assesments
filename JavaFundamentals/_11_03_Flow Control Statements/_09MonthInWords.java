package _11_03_FlowControlStatements;
public class _09MonthInWords 
{
	public static void main(String[] args) 
	{
		String[] monthName= {" ","jan","feb","march","april","may","june","july","aug","sep","oct","november","dec"};
		if(args.length==0)
		{
			System.out.println("Please enter the month in numbers");
		}
		else
		{
			int month=Integer.parseInt(args[0]);
			if(month>0&&month<13)
			{
				System.out.println(monthName[month]);
			}
			else
			System.out.println("Enter the valid number");
		}
		
	}
}
