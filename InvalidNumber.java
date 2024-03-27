
public class InvalidNumber {
	 void validateage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Invalid age");
			
		}
		else
		{
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args) {
		InvalidNumber ob= new InvalidNumber(); 
		
		try {
			ob.validateage(20);
			
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
