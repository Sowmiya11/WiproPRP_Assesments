package _12_01_ClassesAndObjects;

public class _01Box {
    double width;
    double height;
    double depth;
    public Box() 
    {
    }
    Box(double width,double height,double depth)
    {
		this.depth=depth;
		this.width=width;
		this.height=height;
		System.out.println("volume of this box in constructor"+depth*width*height);
   }
    public double volume(double width,double height,double depth)
    {
		return (width*height*depth);
	}
	public static void main(String[] args)
	{		
    Box area=new Box(2,3,5);
    System.out.println("Volume is:"+area.volume(7, 5, 4));
	}

}
