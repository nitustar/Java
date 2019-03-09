package jprg;
import java.util.Scanner;
class CircleArea
	{
	public static void main(String args[])
		{
		int r;
		double ar;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the Radius of Circle : ");
		r=sc.nextInt();
		ar=3.14*r*r;
		System.out.printf("\n Area of Circle = %f",ar);
		}
	}