package _12_01_ClassesAndObjects;

public class _02Employee extends _02Person
{
	double annualSalary;
	String nationalInsuranceNumber,yearOfEmpStartToWork;
	public  Employee()
	{	
	}
	public Employee(String name,double annualSalary,String nationalInsuranceNumber,String yearOfEmpStartToWork)
	{
		this.name=name;
		this.annualSalary=annualSalary;
		this.nationalInsuranceNumber=nationalInsuranceNumber;
		this.yearOfEmpStartToWork=yearOfEmpStartToWork;
	}
	public void employeeDetails() {
		System.out.println("****EMPLOYEE DETAILS****");
		System.out.println("NAME\tInsuranceNumber\tyearOfEmpStartToWork\tAnnualSalary");
		System.out.println(name+"\t"+nationalInsuranceNumber+"\t\t"+yearOfEmpStartToWork+"\t\t"+annualSalary);
	}

}
