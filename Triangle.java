import java.io.*;
public class Triangle
{
	public Triangle()
	{
		float s1=3,s2=4,s3=5;
		float p=s1+s2+s3;
		float a=(s1*s2)/2;
		System.out.println("Perimeter of the triangle ="+p);
		System.out.println("Area of the triangle ="+a);
	}
	public static void main(String args[])
	{
		Triangle ob=new Triangle();
	}
}