
import java.time.LocalDate;
import java.time.Period;
public class employeeassessment {
    String name;
    int salary;
    LocalDate hiredate;
    public  employeeassessment( String name,int salary, LocalDate hiredate)
    {
    	this.name=name;
    	this.salary=salary;
    	this.hiredate=hiredate;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	 public int getYearsOfService() {
		    return Period.between(hiredate,LocalDate.now()).getYears();
	 }
	 
	 public   void printemployeeassessment( ){  
		    System.out.println("Name: " + name);
		    System.out.println("Salary: " + salary);
		    System.out.println("HireDate: " + hiredate);
	 }
	public static void main(String[] args) {
		employeeassessment tempemployee = new  employeeassessment("CHANDRIKA", 50000, LocalDate.parse("2022-04-01"));
		employeeassessment peremployee = new  employeeassessment("KARUNA", 70000, LocalDate.parse("2017-04-01"));
	   
	    tempemployee.printemployeeassessment();
	    System.out.println("Years of Service: " + tempemployee.getYearsOfService());
	    peremployee.printemployeeassessment();
	    System.out.println("Years of Service: " +  peremployee.getYearsOfService());

	}

}



	
