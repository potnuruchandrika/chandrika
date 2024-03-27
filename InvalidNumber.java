
public class InvalidNumber {
	  InvalidNumber(int Number)
	{
		if(Number<0)
		{
			throw new ArithmeticException("Negative Number");
			
		}
		else
		{
			System.out.println("not negative ");
		}
	}

	public static void main(String[] args) {
		
		try {
			InvalidNumber ob=new InvalidNumber(4);
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
