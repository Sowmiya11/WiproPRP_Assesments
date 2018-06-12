package _11_00_MiniProject;
public class _01_DisplayEmployeeDetailProjectOne
{
	public static void main(String[] args) 
	{
		int empN=Integer.parseInt(args[0]);
		switch(empN)
		{
		case 1001:
			Employee empobj1=new  Employee(1001, "Ashish","01/04/2009",'e',"R&D",20000,8000,3000);
			empobj1.salaryCal();
			break;
		case 1002:
			Employee empobj2=new  Employee(1002,"Sushma","23/08/2012",'c',"PM",30000,12000,9000);
			empobj2.salaryCal();
			break;
		case 1003:
			Employee empobj3=new  Employee(1003,"Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
			empobj3.salaryCal();
			break;
		case 1004:
			Employee empobj4=new  Employee(1004,"Chahat","29/01/2013",'r',"Front_Desk",12000,6000,2000);
			empobj4.salaryCal();
			break;
		case 1005:
			Employee empobj5=new  Employee(1005,"Ranjan","16/07/2005",'m',"Engg",50000,20000,20000);
			empobj5.salaryCal();
			break;
		case 1006:
			Employee empobj6=new  Employee(1006,"Suman","1/1/2000",'e',"Manufacturing",23000,9000,4400);
			empobj6.salaryCal();
			break;
		case 1007:
			Employee empobj7=new  Employee(1007,"Tanmay","12/06/2006",'c',"PM",29000,12000,10000);
			empobj7.salaryCal();
			break;
			default:
				System.out.println("There is no employee with empid :"+empN);
     }
		//emp.close();

}
}
class Employee
{ 
	public int empNo;
	public String empName;
	public String joinDate;
	public char desigCode;
	public String dept;
	public int basic;
	public int hRA;
	public int iT;
	public String Designation;
	public int dA;
	public Employee()
	{	
	}
	public Employee(int empNo,String empName,String joinDate,char desigCode,String dept,int basic,int hRA,int iT)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.joinDate=joinDate;
		this.desigCode=desigCode;
		this.dept=dept;
		this.basic=basic;
		this.hRA=hRA;
		this.iT=iT;
	
	switch(desigCode)
	{
	case 'e':
		 Designation = "Engineering";
		 dA=20000;
		 break;
	case 'c':
		 Designation ="Consultant";
		 dA=32000;
		 break;
	case 'k':
		 Designation ="Clerk";
	     dA=12000;
	     break;
	case 'r':
		Designation ="Receptionist";
	    dA=15000;
	    break;
	case 'm':
		Designation ="Manager";
		dA=40000;
	}
	}
	public void salaryCal()
	{   
		int salary=basic+hRA+dA-iT;
		System.out.println("Emp No.\tEmp_Name\tDepartment\tDesignation\tSalary");
		System.out.print(empNo+"\t"+empName+"\t\t"+dept+"\t\t"+Designation+"\t\t"+salary);
	}
}
