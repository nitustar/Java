package jprg;
import java.util.Scanner;
import static java.lang.System.*;
class AEQn
	{
	static String simplify(String eq)
		{
		String term="",t="";
		String arr[]=new String[50];
		int i,j,p1,p2,nxt=-1;
		i=0;		
		while(i<eq.length())
			{
			term=fetchTerm(eq,i);
			arr[++nxt]=term;
			 
			if(i==0 && eq.charAt(0) != '+' && eq.charAt(0) != '-')
				i=i+term.length()-1;
			else
				i=i+term.length();
			
			}
		
		for(i=0;i<nxt;i++)
			for(j=i+1;j<=nxt;j++)
				{
				p1=Integer.parseInt(""+arr[i].charAt(arr[i].length()-1));
				p2=Integer.parseInt(""+arr[j].charAt(arr[j].length()-1));
				if(p1<p2)
					{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					}
				}
		t="";
		for(i=0;i<=nxt;i++)
			t+=arr[i];
		return(t);
		}

	static String fetchTerm(String eq, int i)
		{
		String term="";
		
		if(i==0)
			{
			if(eq.charAt(0)!='-' && eq.charAt(0)!='+')
				term="+";
			else
				{
				term=""+eq.charAt(i);
				i++;
				}
			}
		
		else
			{
			term=""+eq.charAt(i);
			i++;
			}
		
		while(i<eq.length() && eq.charAt(i)!='+' && eq.charAt(i) != '-' )
			{
			term+=eq.charAt(i);
			i++;
			}
			
		return(term);
		}
	static int getNumFrom(String term)
		{
		char sign=' ';
		int i=0,num=0,dgt=0;
		boolean flag;
		if(term.charAt(i) != '+' && term.charAt(i) !='-')
			sign='+';
		else 
			{
			sign=term.charAt(i);
			i++;
			}

		flag=true;
		num=0;
		while(flag==true)
			{
			switch(term.charAt(i))
				{
				case '0' : dgt=0;break;
				case '1' : dgt=1;break;
				case '2' : dgt=2;break;
				case '3' : dgt=3;break;
				case '4' : dgt=4;break;
				case '5' : dgt=5;break;
				case '6' : dgt=6;break;
				case '7' : dgt=7;break;
				case '8' : dgt=8;break;
				case '9' : dgt=9;break;
				default : flag=false;
				}
			if(flag==true)
				num=num*10+dgt;
			i++;
			}
		if(sign=='-')
			num=-num;
		return(num);
		}
				
	
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		String eq1=""; //="+4x^3-120x^2+10x^1+50x^0";
		String eq2=""; //"5x^3+12x^2+10x^1+50x^0";
		String term="",oterm="";
		System.out.printf("\nEnter First Equation : ");
		eq1=sc.next();
		simplify(eq1);
		/*
		System.exit(0);		
		System.out.printf("\nEnter Second Equation : ");
		eq2=sc.next();
		/////////////////////////////
		//eq1=simplify(eq1);
		//eq2=simplify(eq2);		
		///////////////////////////////

		int res=0,i=0,j=0;
		while(i<eq1.length())
			{
			term=fetchTerm(eq1,i);
			res=getNumFrom(term);
			j=0;
			while(j<eq2.length())
				{
				oterm=fetchTerm(eq2,j);
				if(term.charAt(term.length()-1) == oterm.charAt(oterm.length()-1))
					{
					res+=getNumFrom(oterm);
					}
				
				if(j==0 && eq2.charAt(0) != '+' && eq2.charAt(0) != '-')
					j=j+oterm.length()-1;
				else
					j=j+oterm.length();
				}
			if(res>=0)
				out.printf("+%d",res);
			else
				out.printf("%d",res);
			out.printf("%c%c%c",term.charAt(term.length()-3),term.charAt(term.length()-2),term.charAt(term.length()-1)    );
				
			

			if(i==0 && eq1.charAt(0) != '+' && eq1.charAt(0) != '-')
				i=i+term.length()-1;
			else
				i=i+term.length();
			
			}
		*/
		}
	}