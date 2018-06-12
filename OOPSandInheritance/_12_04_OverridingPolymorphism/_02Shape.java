package _12_04_OverridingPolymorphism;
class Circle extends _02Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	@Override
	public void erase() 
	{
		System.out.println("Erasing Circle");
	}
}
class Square extends _02Shape
{
	@Override
	public void draw() 
	{
		System.out.println("Drawing Square");
	}
	@Override
	public void erase() 
	{
		System.out.println("Erasing Square");
	}
}
class Triangle extends _02Shape
{
	@Override
	public void draw() 
	{
		System.out.println("Drawing Triangle");
	}
	@Override
	public void erase() 
	{
		System.out.println("Erasing Triangle");
	}
}
public class _02Shape {

	public void draw() 
	{
		System.out.println("Drawing Shape");
	}
	public void erase() 
	{
	  System.out.println("Erasing Shape");	
	}
	public static void main(String[] args) 
	{
		Shape c=new Circle();
		c.draw();
		c.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
		Shape s=new Square();
		s.draw();
		s.erase();

	}

}