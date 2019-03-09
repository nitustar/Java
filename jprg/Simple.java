package jprg;
import java.util.Scanner;
class Calculator
	{
	static void add2Ints(int a, int b)
		{
		System.out.printf("\n%d + %d = %d",a,b,a+b);
		}
	
	static void sub2Ints(int a, int b)
		{
		System.out.printf("\n%d - %d = %d",a,b,a-b);
		}
	}


class CalculatorAT   //developed by Yash Chopra
	{
	static void add2Ints(int a, int b)
		{
		System.out.printf("\n%d + %d = %d",a,b,a+b);
		}
	static void sub2Ints(int a, int b)
		{
		System.out.printf("\n%d - %d = %d",a,b,a-b);
		}
	static void Multi2Ints(int a, int b)
		{
		System.out.printf("\n%d * %d = %d",a,b,a*b);
		}
	}

class CalculatorET extends Calculator   //developed by Aditya Chopra
		{
		static void Multi2Ints(int a, int b)
			{
			
			System.out.printf("\n%d * %d = %d",a,b,a*b);
			}
		}

			
class Simple
	{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.printf("\nEnter Two Integers : ");
		m=sc.nextInt();
		n=sc.nextInt();
		/*
		CalculatorAT.add2Ints(m,n);
		CalculatorAT.sub2Ints(m,n);
		CalculatorAT.Multi2Ints(m,n);
		*/
		CalculatorET.add2Ints(m,n);
		CalculatorET.sub2Ints(m,n);
		CalculatorET.Multi2Ints(m,n);

		}
	}

	