package jprg;
import java.util.Scanner;
class BinaryConversion
	{
	BinaryConversion()
		{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		n=sc.nextInt();
		String s="";
		while(n!=0)
			{
			s=s+(char)n%2;
			n=n/2;
			}
		StringBuffer ss=new StringBuffer(s);
		ss.reverse();
		System.out.printf("\n Number in Binary : %s",ss);
		}
	public static void main(String args[])
		{
		BinaryConversion BCon=new BinaryConversion();
		}
	}