import java.util.Scanner;

public class AssesmentExcep2{
	int a;
	class oddException extends Exception
	{
		oddException(String message) {
			super(message);
		}
	}
	void numberodd(int a) throws oddException
	{
		if(a%2!=0)
		{
	throw new oddException("odd number");
}
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	AssesmentExcep2 b= new AssesmentExcep2();
	try {
		b.numberodd(a);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
	