package jprg;
import java.util.Scanner;
class Show
	{
	static void display()
		{
		System.out.println("Welcome to Java");
		}
	}
class Add2Nos
	{
	static void sum(float a,float b)
		{
		float c;
		c=a+b;
		System.out.printf("\nSum of %.2f and %.2f = %.2f",a,b,c);
		}
	}
class Rectangle
	{
	static void rectArea(float a,float b)
		{
		float c;
		c=a*b;
		System.out.printf("\nArea of Rectangle = %.2f",c);
		}
	}
class Circle
	{
	static void cirArea(float r)
		{
		float c;
		c=3.14f*r*r;
		System.out.printf("\nArea of Circle = %.2f",c);
		}
	}
class DisAll
	{
	public static void main(String args[])
		{
		float a,b,r;
		Show.display();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter any Two Integer : ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		Add2Nos.sum(a,b);

		System.out.print("\nEnter Length and Breadth of Recangle : ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		Rectangle.rectArea(a,b);
		
		System.out.print("\nEnter the Radius of the Circle : ");
		r=sc.nextFloat();
		Circle.cirArea(r);
		}
	}