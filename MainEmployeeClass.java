import java.util.*;
public class MainEmployeeClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService ob1=new EmployeeService();
		boolean result = true;
		while(result)
		{
			System.out.println("Enter your choice or press 4 to exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				ob1.addEmpl();
				break;
			case 2:
				ob1.deleteEmp();
				break;
			case 3:
				ob1.updateEmployee();
				break;
				default: 
					result = false;
			}
		}
		// TODO Auto-generated method stub

	}

}
