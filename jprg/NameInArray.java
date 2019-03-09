package jprg;
import java.util.*;
class NameInArray
	{
	int i; String x[]=new String[5];
	public void accept()
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter 5 Names : ");
		for(i=0;i<5;i++)
			{
			x[i]=sc.next();
			}
		}
	public void display()
		{
		Arrays.sort(x);
		System.out.printf("Display their Names : ");
		for(i=0;i<5;i++)
			{	
			System.out.printf("\n%s",x[i]);
			}
		}
	public static void main(String args[])
		{
		NameInArray na=new NameInArray();
		na.accept();
		na.display();
		}
	}