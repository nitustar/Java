package jprg;
import java.util.Scanner;
class Power
	{
	Power()
		{
		int i,x=1,n,p;
		Scanner sc=new Scanenr(System.in);
		System.out.print("\nEnter any no. : ");
		n=sc.nextInt();
		System.out.print("\nEnter the Power of no. : ");
		p=sc.nextInt();
		for(i=0;i<p;i++)
			{
			x=x*n;
			}
		System.out.printf("\nPower of %d of %d = %d",n,p,x);
		}
	public static void main(String args[])
		{
		Power p=new Power();
		}
	}