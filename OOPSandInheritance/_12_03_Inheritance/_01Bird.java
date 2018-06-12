package _12_01_ClassesAndObjects;
class Animal
{	
	public void eat()
	{  
			System.out.println("Animal is eating...");
	}
	public void sleep()
	{
			System.out.println("Animal is sleeping now");

	}
}
public class _01Bird extends Animal
{

	@Override
		public void eat() 
	   {
			
			System.out.println("Bird is eating now..");
		}
   @Override
	public void sleep() 
   {
	        
			System.out.println("Bird is sleeping now..");
	}
   public void fly()
   {
	  
	System.out.println("Bird is flying now...");  
   }
   public static void main(String[] args)
   {
	   System.out.println("****Animal instance*****");
	   Animal animal=new Animal();
	   animal.eat();
	   animal.sleep();
	   System.out.println("****Bird instance*****");
	Bird bird=new Bird();
	bird.fly();
	bird.eat();
	bird.sleep();
   }
}
