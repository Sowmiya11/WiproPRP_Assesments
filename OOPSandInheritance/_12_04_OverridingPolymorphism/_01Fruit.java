package _12_04_OverridingPolymorphism;
class Apple extends _01Fruit
{ 	
	public Apple() 
	{
	}
	public Apple(String name,String taste,int size) 
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	@Override
	public void eat()
	{
		System.out.println("NAME\t\tTASTE\t\t");
		System.out.println(name+"\t\t"+taste+"\t\t");
	}
}
class Orange extends _01Fruit
{	
	public Orange(String name,String taste,int size) 
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	@Override
	public void eat()
	{
		System.out.println("NAME\t\tTASTE\t\t");
		System.out.println(name+"\t\t"+taste+"\t\t");
	}
	
}
public class _01Fruit
{
	String name;
	String taste;
	int size;
	public void eat()
	{	
	}
	public static void main(String[] args) 
	{
		System.out.println("*******");
		Apple apple=new Apple("Apple","Sweet",20);
		apple.eat();
		Orange orange=new Orange("Orange","Better", 10);
		orange.eat();
	}

}
