package jprg;
import java.util.Scanner;
class BinToDec
	{
	BinToDec()
		{
		int n,s=0,p=0,r;
		double pw;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		n=sc.nextInt();
		while(n!=0)
			{
			r=n%10;
			pw=Math.pow(2.0,p);
			s=s+r*(int)pw;
			p++;
			n=n/10;
			}
		System.out.printf("\n%d",s);
		}
	public static void main(String args[])
		{
		BinToDec BCon=new BinToDec();
		}
	}