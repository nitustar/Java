package jprg;
import java.util.Scanner;
class Leap
	{
	void year(int yr)
		{
		if(yr%400==0)
			{
			System.out.printf("\n%d is Leap Year !!",yr);
			}
		else if(yr%100==0)
			{
			System.out.printf("\n%d is Leap Year !!",yr);
			}
		else if(yr%4==0)
			{
			System.out.printf("\n%d is Leap Year !!",yr);
			}
		else
			{
			System.out.printf("\n%d is Not Leap Year !!",yr );
			}
		}
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter Any Year : ");
		int yr=sc.nextInt();
		Leap l=new Leap();
		l.year(yr);
		}
	}