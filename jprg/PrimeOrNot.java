package jprg;
import java.util.Scanner;
class PrimeOrNot
	{
	int i,n;
	PrimeOrNot()
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Any Number : ");
		n=sc.nextInt();
		
		for(i=2;i<n;i++)
			{
			if(n%i==0)
				{
				System.out.print("\nNot Prime Number");
				break;
				}
			}
		if(i==n)
			{
			System.out.print("\nPrime Number");
			}
		}
	public static void main(String args[])
		{
		PrimeOrNot pn=new PrimeOrNot();
		}
	}