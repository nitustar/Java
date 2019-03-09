package jprg;
import java.util.Scanner;
class Unicode
	{
	public static void main(String args[])
		{
		/*
		String s;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter Any Character : ");
		s=sc.next();
		c=s.charAt(0);
		System.out.printf("\n%d",(int)c);
		*/
		for(int i=1024;i<=1030;i++)
			{
			System.out.printf("\n%c = %d\n",(char)i,i);
			}
		}
	}