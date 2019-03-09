package jprg;
import java.util.Scanner;
class Calculator
	{
	static void add(int a,int b)
		{
		System.out.printf("\nAddition of %d and %d = %d",a,b,a+b);
		}
	static void sub(int a,int b)
		{
		System.out.printf("\nSubtraction of %d and %d = %d",a,b,a-b);
		}
	static void mult(int a,int b)
		{
		System.out.printf("\nMultiplication of %d and %d = %d",a,b,a*b);
		}
	}
class Cal extends Calculator
	{
	static void power(int a,int b)
		{
		double p=Math.pow(a,b);
		System.out.printf("\nPower of %d on %d = %f",a,b,p);
		}
	static void sqrt(int a)
		{
		double s=Math.sqrt(a);
		System.out.printf("\nSquare Root of %d = %f",a,s);
		}
	}
class TestCal
	{
	public static void main(String a[])
		{
		int x,y,ch;
		Scanner sc=new Scanner(System.in);
		do
			{
			System.out.printf("\nOptions For Calculation with Integers ");
			System.out.printf("\n1. Addition of 2 Integers : ");
			System.out.printf("\n2. Subtraction of 2 Integers : ");
			System.out.printf("\n3. Multiplication of 2 Integers : ");
			System.out.printf("\n4. Power of a Integers : ");
			System.out.printf("\n5. Square Root of a Integers : ");
			System.out.printf("\n0. Exit");
			System.out.printf("\nEnter Your Choice : 0/1/2/3/4/5 : ");
			ch=sc.nextInt();
			if(ch==1)
				{
				System.out.printf("\nEnter 2 Integers : ");
				x=sc.nextInt();
				y=sc.nextInt();
				Calculator.add(x,y);
				}
			else if(ch==2)
				{
				System.out.printf("\nEnter 2 Integers : ");
				x=sc.nextInt();
				y=sc.nextInt();
				Calculator.sub(x,y);
				}
			else if(ch==3)
				{
				System.out.printf("\nEnter 2 Integers : ");
				x=sc.nextInt();
				y=sc.nextInt();
				Calculator.mult(x,y);
				}
			else if(ch==4)
				{
				System.out.printf("\nEnter 2 Integers : ");
				x=sc.nextInt();
				y=sc.nextInt();
				Cal.power(x,y);
				}
			else if(ch==5)
				{
				System.out.printf("\nEnter a Integers : ");
				x=sc.nextInt();
				Cal.sqrt(x);
				}
			else if(ch==0)
				{
				System.exit(0);
				}
			else
				{
				System.out.printf("\nInvalid Option ! ");
				}
			}while(12<=15);
		}
	}		