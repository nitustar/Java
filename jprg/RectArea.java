package jprg;
import java.util.Scanner;
class RectArea
	{
	public static void main(String args[])
		{
		int l,b,ar;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length and Breadth of Rectangle : ");
		l=sc.nextInt();
		b=sc.nextInt();
		ar=l*b;
		System.out.printf("\n Area of Rectangle = %d",ar);
		}
	}