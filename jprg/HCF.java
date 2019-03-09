package jprg;
import java.util.Scanner;
class HCF
	{
	public static void main(String args[])
		{
		int div,dvn,t;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter any 2 Integer : ");
		div=sc.nextInt();
		dvn=sc.nextInt();
		while(dvn%div!=0)
			{
			t=div;
			div=dvn%div;
			dvn=t;
			}
		System.out.printf("\nHCF : %d",div);
		}
	}	