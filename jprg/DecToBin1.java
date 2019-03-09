package jprg;
import java.util.Scanner;
class DecToBin1
	{
	DecToBin1()
		{
		int n,s=0,r,p=0;
		double pw;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		n=sc.nextInt();
		while(n!=0)
			{
			r=n%8;
			pw=Math.pow(10.0,p);
			s=s+r*(int)pw;
			p++;
			n=n/8;
			}
		System.out.printf("\n%d",s);
		}
	public static void main(String args[])
		{
		DecToBin1 BCon=new DecToBin1();
		}
	}