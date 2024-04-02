class InvalidAgeException extends Exception
{
	String msg;
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}
public class Ageofperson {
	void validateage(int age) throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException(" MY AGE");
	}

	

	public static void main(String[] args) {
		Ageofperson ob=new Ageofperson ();
		try
		{
			ob.validateage(12);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("complete");
	}
 }
	
		