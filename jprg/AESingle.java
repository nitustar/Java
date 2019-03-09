package jprg;
import java.util.Scanner;
class AEqn
	{
	void calculate(int m,int n,String op)
		{
		int r=0;
		if(op.equals("+"))
			{
			r=m+n;
			}
		else if(op.equals("-"))
			{
			r=m-n;
			}
		else if(op.equals("*"))
			{
			r=m*n;
			}
		else if(op.equals("/"))
			{
			r=m/n;
			}
		else if(op.equals("%"))
			{
			r=m%n;
			}
		else
			{
			System.out.printf("\nInvalid Operator...!");
			}
		System.out.printf("\nResult = %d",r);
		}
	void fact(int n)
		{
		int r=1,x;
		x=n;
		while(n!=0)
			{
			r=r*n--;
			}
		System.out.printf("\nfactorial of %d = %d",x,r);
		}
	public static void main(String args[])
		{
		int x,y;
		String z;
		AEqn a=new AEqn();
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter Any two Integer : ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.printf("\nEnter Any Operator : ");
		z=sc.next();
		a.calculate(x,y,z);
		System.out.print("\nEnter any Integer : ");
		x=sc.nextInt();
		a.fact(x);
		}
	}