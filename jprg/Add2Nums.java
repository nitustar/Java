package jprg;
import java.util.Scanner;
class Add2Nums
	{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.printf("\nEnter Any Two Integers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.printf("\nSum=%d",c);
		}
	}
