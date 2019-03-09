package jprg;
import java.util.Scanner;
class Age
	{
	public static void main(String Args[])
		{
		int cd,cm,cy,dm,dd,dy,d=0,m=0,y=0;
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter the Current Date : ");
		cd=sc.nextInt();
		cm=sc.nextInt();
		cy=sc.nextInt();
		System.out.printf("\nEnter the Date of Birth : ");
		dd=sc.nextInt();
		dm=sc.nextInt();
		dy=sc.nextInt();
		if(cd<dd)
			{
			cd=cd+30;
			cm=cm-1;
			}
		d=cd-dd;
		if(cm<dm)
			{
			cm=cm+12;
			cy=cy-1;
			}
		m=cm-dm;
		y=cy-dy;
		System.out.printf("\nThe Age is %d-%d-%d",d,m,y);
		}
	}