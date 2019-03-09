package jprg;
import java.util.*;
class OutOfRangeException extends Exception
	{
	OutOfRangeException(int x)
		{
		System.out.printf("\nSorry ! Can not be process with %d.",x);
		}
	}
class Factorial
	{
	void fact(int n)throws OutOfRangeException
		{
		int f=1;
		if(n<1||n>10)
			{
			throw new OutOfRangeException(n);
			}
		else
			{
			while(n>1)
				{
				f=f*n;
				n--;
				}
			System.out.printf("\nFactorial = %d ",f);
			}
		}
	}
class PrgOneExc
	{
	public static void main(String a[])
		{
		Factorial obj=new Factorial();
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.printf("\nEnter any Integer : ");
		num=sc.nextInt();
		try
			{
			obj.fact(num);
			}
		catch(OutOfRangeException e)
			{}
		}
	}