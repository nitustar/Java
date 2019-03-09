package jprg; 
import java.util.Scanner;
class Person
	{
	private int id; 
	private String nm,city;
	void accept()
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
		System.out.printf("\n%7d%10s%10s",this.id,this.nm,this.city);
		}
	}

class SocialWorker
	{
	int id;
	String nm,ct,desig,cons;
	void input()
		{
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter Id Name City Designation and Constituency : ");
		this.id=sc.nextInt();
		this.nm=sc.next();
		this.ct=sc.next();
		this.desig=sc.next();
		this.cons=sc.next();
		}
	void output()
		{
		System.out.printf("\n%7d%10s%10s%10s%10s",this.id,this.nm,this.ct,this.desig,this.cons);
		}
	}


class Employee extends Person
	{
	String dept;
	int salary;
	void input()
		{
		Scanner sc = new Scanner(System.in);
		accept();
		System.out.printf("\nEnter Department Salary : ");
		this.dept=sc.next();
		this.salary=sc.nextInt();
		}
	void output()
		{
		display();
		System.out.printf("%10s%10d",this.dept,this.salary);
		}
	}
		

class TestSW
	{
	public static void main(String medicalcollege[])
		{
		System.out.printf("\nFor Social Workers :");
		SocialWorker sw1,sw2,sw3;
		sw1=new SocialWorker();
		sw2=new SocialWorker();
		sw3=new SocialWorker();

		sw1.input();
		sw2.input();
		sw3.input();
		sw1.output();
		sw2.output();
		sw3.output();

		System.out.printf("\nFor Employees :");
		Employee e1,e2,e3;
		e1=new Employee();
		e2=new Employee();
		e3=new Employee();

		e1.input();
		e2.input();
		e3.input();
		e1.output();
		e2.output();
		e3.output();
		}
	}
	
		