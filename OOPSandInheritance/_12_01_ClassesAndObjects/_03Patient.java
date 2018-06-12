package _12_01_ClassesAndObjects;
import java.util.Scanner;
public class _03Patient {
	public static void main(String[] args)
	{   Scanner pat=new Scanner(System.in);
		System.out.println("Enter the name of the patient:");
		String name=pat.next();
		System.out.println("Enter the weight of the patient:");
		double weight=pat.nextDouble();
		System.out.println("Enter the height of the patient:");
		double height=pat.nextDouble();
		Patients pati=new Patients(name,weight,height);
		System.out.println("BMI of the patient is "+pati.bmi());
		pat.close();
	}
}
class Patients
{
	String name;
	double weight;
	double height; 
   public Patients() 
   {
   }
   public Patients(String name,double weight,double height )
   {
	this.height=height;
	this.weight=weight;
	this.name=name;
   }
   public double bmi() 
   {
	return (weight/(height*height)*703);
   }	
}



