package jprg;
import java.util.Scanner;
class Person
	{
	static int id,age;
	static String name,city;
	static Scanner sc=new Scanner(System.in);
	static void data()
		{
		System.out.printf("\nEnter Id : ");
		id=sc.nextInt();
		System.out.printf("\nEnter the Name : ");
		name=sc.next();
		System.out.printf("\nEnter the Age : ");
		age=sc.nextInt();
		System.out.printf("\nEnter the City : ");
		city=sc.next();
		}
	static void display()
		{
		System.out.printf("\n%5d%10s%10d%10s",id,name,age,city);
		}
	}
class Employee extends Person
	{
	static String dpt;
	static int sal;
	static void data()
		{
		Person.data();
		System.out.printf("\nEnter the Department of the Employee : ");
		dpt=sc.next();
		System.out.printf("\nEnter the Salary of the Employee : ");
		sal=sc.nextInt();
		}
	static void display()
		{
		Person.display();
		System.out.printf("%10s%10d",dpt,sal);
		}
	}
class Student extends Person
	{
	static int std,mark;
	static String sub;
	static void data()
		{
		Person.data();
		System.out.printf("\nEnter the Class of the Students : ");
		std=sc.nextInt();
		System.out.printf("\nEnter the School Name : ");
		sub=sc.next();
		System.out.printf("\nEnter the Marks of the Student : ");
		mark=sc.nextInt();
		}
	static void display()
		{
		Person.display();
		System.out.printf("%10d%10s%10d",std,sub,mark);
		}
	}

class SocialWorker extends Person
	{
	static int sal;
	static String desig,cons;
	static void data()
		{
		Person.data();
		System.out.printf("\nEnter the Designation : ");
		desig=sc.next();
		System.out.printf("\nEnter the Constituency : ");
		cons=sc.next();
		System.out.printf("\nEnter the Salary : ");
		sal=sc.nextInt();
		}
	static void display()
		{
		Person.display();
		System.out.printf("%10s%10s%10d",desig,cons,sal);
		}
	}

class FullTime extends Employee
	{
	static int time,hr;
	static void data()
		{
		Employee.data();
		System.out.printf("\nEnter the Starting Work Time : ");
		time=sc.nextInt();
		System.out.printf("\nEnter the Working Hours : ");
		hr=sc.nextInt();
		}
	static void display()
		{
		Employee.display();
		System.out.printf("%10d%10dhr",time,hr);
		}
	}
class PartTime extends Employee
	{
	static int time,hr;
	static void data()
		{
		Employee.data();
		System.out.printf("\nEnter the Starting Work Time : ");
		time=sc.nextInt();
		System.out.printf("\nEnter the Working Hours : ");
		hr=sc.nextInt();
		}
	static void display()
		{
		Employee.display();
		System.out.printf("%10d%10dhr",time,hr);
		}
	}
class DisModeStudent extends Student
	{
	static int at,dist;
	static void data()
		{
		Student.data();
		System.out.printf("\nEnter the Attendence of the Student : ");
		at=sc.nextInt();
		System.out.printf("\nEnter the Distance from the School : ");
		dist=sc.nextInt();
		}
	static void display()
		{
		Student.display();
		System.out.printf("%5d%5dkm",at,dist);
		}
	}
class RegularStudent extends Student
	{
	static int at,dist;
	static void data()
		{
		Student.data();
		System.out.printf("\nEnter the Attendence of the Student : ");
		at=sc.nextInt();
		System.out.printf("\nEnter the Distance from the School : ");
		dist=sc.nextInt();
		}
	static void display()
		{
		Student.display();
		System.out.printf("%10d%10dkm",at,dist);
		}
	}

class AllPerson
	{
	public static void main(String a[])
		{
		int ch,c,d,e,f,g,h,i,l,n;
		Scanner sc=new Scanner(System.in);
		do
			{
			System.out.printf("\n All Data... ");
			System.out.printf("\n1. Employee Menu ");
			System.out.printf("\n2. Student Menu ");
			System.out.printf("\n3. SocialWorkers ");
			System.out.printf("\n0. Exit ");
			System.out.printf("\nEnter Your Choice : 0/1/2/3 : ");
			ch=sc.nextInt();
			switch(ch)
				{
				case 0 :System.exit(0);
				
				case 1 :do
						{
				 		System.out.printf("\n Employee Options ");
						System.out.printf("\n1. Full Time Employee ");
						System.out.printf("\n2. Part Time Employee ");
						System.out.printf("\n0. Exit ");
						System.out.printf("\nEnter Your Choice : 0/1/2 : ");
						c=sc.nextInt();
						switch(c)
							{
							case 0 :System.exit(0);
							case 1 :do
									{
									System.out.printf("\n1. Enter Data  : ");
									System.out.printf("\n2. Dispaly All Data : ");
									System.out.printf("\n0. Exit ");
									System.out.printf("\nEnter your Choice : 0/1/2 : ");
									d=sc.nextInt();
									switch(d)
									 	{
										case 0 :System.exit(0);
									 	case 1 :System.out.printf("\nEnter the no. of Entery : ");
											n=sc.nextInt();
											for(l=0;l<n;l++)
												{
												FullTime.data();
												}
									 	case 2 :for(l=0;l<n;l++)
												{
												FullTime.display();
												}
										default : System.out.printf("\nInvalid Choice ! ");
										}
									}while(1==1);
								
							case 2 :do
									{
									System.out.printf("\n1. Enter Data : ");
									System.out.printf("\n2. Dispaly All Data : ");
									System.out.printf("\n0. Exit ");
									System.out.printf("\nEnter your Choice : 0/1/2 : ");
									e=sc.nextInt();
									switch(e)
									 	{
										case 0 :System.exit(0);
									 	case 1 :PartTime.data();
											break;
									 	case 2 :PartTime.display();
											break;
										default : System.out.printf("\nInvalid Choice ! ");
										}
									}while(1==1);
								
									
							default : System.out.printf("\n Invalid Choice ! ");
							}
						}while(1==1);
					
						
				case 2 : do
						{
						System.out.printf("\n Student Options ");
						System.out.printf("\n1. Distance Mode Student ");
						System.out.printf("\n2. Regular Student ");
						System.out.printf("\n0. Exit ");
						System.out.printf("\nEnter Your Choice : 0/1/2 : ");
						f=sc.nextInt();
						
						switch(f)
							{
							case 0 :System.exit(0);
							case 1 :do
									{
									System.out.printf("\n1. Enter the Data : ");
									System.out.printf("\n2. Display All Data ");
									System.out.printf("\n0.Exit ");
									System.out.printf("\nEnter your Choice : 0/1/2 : ");
									g=sc.nextInt();
									switch(g)
										{
										case 0 :System.exit(0);
										case 1 :DisModeStudent.data();
											break;
										case 2 :DisModeStudent.display();
											break;
										default :System.out.printf("\nInvalid Choice ! ");
										}
									//} mujrim 
									}while(1==1);
								
							case 2 :do
									{
									System.out.printf("\n1. Enter Data : ");
							 		System.out.printf("\n2. Dispaly All Data : ");
									System.out.printf("\n0. Exit ");
									System.out.printf("\nEnter your Choice : 0/1/2 : ");
									h=sc.nextInt();
									switch(h)
									 	{
										case 0 :System.exit(0);
									 	case 1 :RegularStudent.data();
											break;
									 	case 2 :RegularStudent.display();
											break;
										default : System.out.printf("\nInvalid Choice ! ");
										}
									}while(1==1);
								
							default :System.out.printf("\nInvalid Choice ! ");
							}
						}while(1==1);
					
				case 3 :do
						{
						System.out.printf("\n1. Enter Data in Social Worker : ");
						System.out.printf("\n2. Dispaly All Data : ");
						System.out.printf("\n0. Exit ");
						System.out.printf("\nEnter your Choice : 0/1/2 : ");
						i=sc.nextInt();
						switch(i)
						 	{
							case 0 :System.exit(0);
						 	case 1 :SocialWorker.data();
								break;
						 	case 2 :SocialWorker.display();
								break;
							default : System.out.printf("\nInvalid Choice ! ");
							}
						}while(1==1);
					
				default :System.out.printf("\nInvalid Choice ! ");
				}	
			}while(1==1);
		}
	}
