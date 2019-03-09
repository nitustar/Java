package jprg;
import java.util.Scanner;
import static java.lang.System.*;
class Eqn
	{
	static String fetchTerm(String eq, int i)
		{
		String term="";
		if(i==0)
			{
			if(eq.charAt(0)!='-')
				term="+";
			}
		while(i<eq.length() && eq.charAt(i)!='+' && eq.charAt(i) != '-' )
			{
			term+=eq.charAt(i);
			i++;
			}
			
		return(term);
		}
	
	public static void main(String args[])
		{
		String eq1="+4x^3-120x^2+10x^1-50x^0";
		String eq2="5x^3+12x^2+10x^1+50x^0";
		String termoq="",term="",rs;
		int j,t1,t2,i=0,rn1,rn2;
				
		/*
		if(eq1.charAt(0)!='-')
			term="+";
		*/

		while(i<eq1.length())
			{
			term=fetchTerm(eq1,i);
			out.printf("%s",term);
			i=i+term.length();
			
			/*
			while(i<eq1.length() && eq1.charAt(i)!='+' && eq1.charAt(i) != '-' )
				{
				term+=eq1.charAt(i);
				i++;
				}
			
			
			t1=0;
			t2=term.length()-4;
			rs="";
			while(t1<=t2)
				{
				rs+=term.charAt(t1);
				t1++;
				}
			rn1=Integer.parseInt(rs);
			
			
			j=0;
			while(j<eq2.length())
				{
				termoq="";
				while(j<eq2.length() && eq2.charAt(j)!='+' && eq2.charAt(j) != '-' )
					{
					termoq+=eq2.charAt(j);
					j++;
					}
				if(term.charAt(term.length()-1)==termoq.charAt(termoq.length()-1)) //power comparison
					{
					t1=0;
					t2=termoq.length()-4;
					rs="";
					while(t1<=t2)
						{
						rs+=termoq.charAt(t1);
						t1++;
						}
					rn2=Integer.parseInt(rs);
					rn1=rn1+rn2;
					}			
				j++;
				}
			out.printf("%d%c%c%c ",
				rn1,term.charAt(term.length()-3),term.charAt(term.length()-2),term.charAt(term.length()-1)); //,term.charAt(i-2),term.charAt(i-1));
			
					
			
			if(i<eq1.length())
				term=""+eq1.charAt(i);
			*/
			}
		}
	}