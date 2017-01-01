import java.util.*;
public class voc
{
	public static void main(String args[])
	{
Scanner x=new Scanner(System.in);
char c=x.next().charAt(0);
	if((c=='A'||c=='a')||(c=='E'||c=='e')||(c=='I'||c=='i')||(c=='O'||c=='o')||(c=='U'||c=='u'))
	{
	System.out.println("vowel");
	}
		
                else
		{
		System.out.println("constant");
		}
	}
}
