package jprg; 
import java.util.Scanner;
class Person
	{
	int id; String nm,city;
	void input()
		{
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter the Id of Person : ");
		id=sc.nextInt();
		System.out.printf("\nEnter the name of the Person : ");
		nm=sc.next();
		System.out.printf("\nEnter the City of the Person : ");
		city=sc.next();
		}
	void display()
		{
		System.out.printf("\nID of the Person : %d",id);
		System.out.printf("\nName of the Person : %s",nm);
		System.out.printf("\nCity of the Person :%s",city);
		}
	}

class Socialworker extends Person
	{
	public static void main(String args[])
		{
		Socialworker p[]=new Socialworker[3];
		p[0]=new Socialworker();
		p[1]=new Socialworker();
		p[2]=new Socialworker();

		p[0].input();
		p[1].input();
		p[2].input();
		
		p[0].display();
		p[1].display();
		p[2].display();
		}
	}