package _12_01_ClassesAndObjects;
class Student extends _03PersonA
{  	
	int regNo;
	String schoolName;
}
class Teacher extends _03PersonA
{
   double salary;
   String subject;
   public Teacher()
   {
   }
   public Teacher(String name,String gender,double salary, String subject)
   {
	   this.name=name;
	   this.gender=gender;
	   this.salary=salary;
	   this.subject=subject;
   }
   public void teacherDetail()
   {
	   System.out.println("NAME\tGENDER\tSALARY\t\tSUBJECT\t");

	   System.out.println(name+"\t"+gender+"\t"+salary+"\t"+subject);
   }
}
class CollegeStudent extends Student
{
    String year;
    String major;
    public CollegeStudent(String name,String gender,int regNo,String schoolName,String year,String major) 
	{	
		this.name=name;
		this.gender=gender;
		this.regNo=regNo;
		this.schoolName=schoolName;
		this.year=year;
		this.major=major;
	}
    public void studentDetail() 
    {
	System.out.println("NAME\tREGNO\tGENDER\t\tMAJOR\t\t\t\tCURRENT_YEAR \t\tSCHOOLNAME\t\t");
	System.out.println(name+"\t"+regNo+"\t"+gender+"\t"+major+"\t\t"+year+"\t"+schoolName);
	}
	

}
public class _03PersonA
{
	String name;
	String gender;
	
		public static void main(String[] args)
		{   
			System.out.println();
			System.out.println("****STUDENT DETAIL******");
			System.out.println();
			CollegeStudent clgstudent=new CollegeStudent("Sowmiya","Female",1513134,"GovtGirlsHreSecSchool","3RD year","ComputerScienceAndEngineering");
			clgstudent.studentDetail();
			System.out.println();
			System.out.println("****TEACHER DETAIL******");
			System.out.println();
			Teacher teacher=new Teacher("Raja","Male",20000,"ComputerScienceAndEngineering");
			teacher.teacherDetail();
		}
}
