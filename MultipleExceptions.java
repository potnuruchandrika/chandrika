
public class MultipleExceptions {

	public static void main(String[] args) {
		try
		{
			int a=100/0;
			int b[]=new int[10];
			b[12]=10;
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		catch(ArithmeticException e)
		
		{
		System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		

	}

}
