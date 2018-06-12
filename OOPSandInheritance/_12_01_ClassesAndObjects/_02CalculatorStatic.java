package _12_01_ClassesAndObjects;
class Calculator {
public static int powerInt(int num1,int num2) 
{
	
	return (int) Math.pow(num1, num2);
}
public static double powerDouble(double num1,int num2) {
	
	return Math.pow(num1, num2);
}
}
public class _02CalculatorStatic{
	public static void main(String[] args) {
		//Calculator cal=new Calculator();
		System.out.println(Calculator.powerDouble(2, 3));
		System.out.println(Calculator.powerInt(2, 4));
	}
}
