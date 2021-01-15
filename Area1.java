import java.io.*;
import java.util.Scanner;
public class Area1
{
	public static void main(String args[])
	{
		System.out.println("Enter the radius of the circle :");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		Area1 obj=new Area1();
		obj.calculateArea(r);
		System.out.println("Enter the length and breadth of the rectangle :");
		double len=sc.nextDouble();
		double b=sc.nextDouble();
		Area1 obj1=new Area1();
		obj1.calculateArea(len,b);
	}
	void calculateArea(double radius)
	{
		double Area=3.14*radius*radius;
		System.out.println("Area of the Circle : "+Area);
	}
	void calculateArea(double length,double breadth)
	{
		double Area=length*breadth;
		System.out.println("Area of the rectangle : "+Area);
	}
}