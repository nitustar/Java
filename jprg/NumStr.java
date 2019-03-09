package jprg;
import java.util.Scanner;
class Number
	{
	void sqr(int x)
		{	
		int c;
		c=x*x;
		System.out.printf("\nSquare of %d = %d",x,c);
		}
	void sqRoot(int x)
		{
		double c;
		c=Math.sqrt(x);
		System.out.printf("\nSquare Root of %d = %.2f",x,c);
		}
	void fact(int x)
		{
		int i=1,c=1;
		while(i<=x)
			{
			c=c*i;
			i++;
			}
		System.out.printf("\nFactorial of %d = %d",x,c);
		}
	void prime(int x)
		{
		double t; int i;
		t=x/2;
		for(i=2;i<=t;i++)
			{
			if(x%i==0)
				System.out.printf("\n%d is not Prime Number.",x);
				break;
			}
		if(i>t)
			{
			System.out.printf("\n%d is Prime Number.",x);
			}
		}
	void table(int x)
		{
		int c,i;
		for(i=1;i<=10;i++)
			{
			c=i*x;
			System.out.printf("\n%d X %d = %d",x,i,c);
			}
		}
	}
class Str
	{
	void len(String str)
		{
		int i;
		i=str.length();
		System.out.printf("\nLength of String = %d",i);
		}
	void vowel(String str)
		{
		int i,x=0;
		char t;
		str=str.toLowerCase();
		for(i=0;i<str.length();i++)
			{
			t=str.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
				{
				x++;
				}
			}
		System.out.printf("\nNumber of Vowels = %d",x);
		}
	void revStr(String str)
		{
		String t="";
		int i=str.length()-1;
		while(i>=0)
			{
			t+=str.charAt(i);
			i--;
			}
		System.out.printf("\nReverse of String = %s",t);
		}
	void palindrome(String str)
		{
		int i=0,j=str.length()-1;
		while(i<j)
			{
			if(str.charAt(i)!=str.charAt(j))
				break;
			i++;
			j--;
			}
		if(i>j)
			{
			System.out.printf("\n%s is Palindrome..!",str);
			}
		else
			{
			System.out.printf("\n%s is not Palindrome..!",str);
			}
		}
	void unicode(String str)
		{
		char c;
		int i=0;
		while(i<str.length()-1)
			{
			c=str.charAt(i);
			System.out.printf("\n%d",(int)c);
			i++;
			}
		}
	}
class IntStr
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		Number n=new Number();
		int x; String str;
	
		System.out.print("\nEnter Any Number to find Square : ");
		x=sc.nextInt();
		n.sqr(x);
	
		System.out.print("\nEnter Any Number to find Square Root : ");
		x=sc.nextInt();
		n.sqRoot(x);
	
		System.out.print("\nEnter Any Number to find Factorial : ");
		x=sc.nextInt();
		n.fact(x);
	
		System.out.print("\nEnter Any Number to find Prime : ");
		x=sc.nextInt();
		n.prime(x);
	
		System.out.print("\nEnter Any Number to find Table : ");
		x=sc.nextInt();
		n.table(x);
	
		Str st=new Str();
		System.out.print("\nEnter Any String to find Length : ");
		str=sc.next();
		st.len(str);

		System.out.print("\nEnter Any String to Count no. of Vowels : ");
		str=sc.next();
		st.vowel(str);

		System.out.print("\nEnter Any String to Reverse : ");
		str=sc.next();
		st.revStr(str);

		System.out.print("\nEnter Any String to find Palindrome : ");
		str=sc.next();
		st.palindrome(str);

		System.out.print("\nEnter Any String to find Unicode : ");
		str=sc.next();
		st.unicode(str);
		}
	}		