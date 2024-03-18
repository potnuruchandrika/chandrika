//package oopsassessment;

import java.util.Scanner;

class EmployeesInfo{
	double salary;
	int hours;
	EmployeesInfo(){
		salary=0;
		hours=0;
	}
	void getInfo(double sal,int hr)
	{
		salary=sal;
		hours=hr;
	}
	double addsal() {
		if(salary<5000) {
			salary=salary+1000;
		}
		return salary;
	}
	double AddSal() {
		if(hours >6) {
			salary=salary+500;
		}
		return salary;
	}
}
class EmployeeSalary{
	double salary;
	EmployeeSalary(double sal){
		salary=sal;
	}
	void printSal() {
		System.out.println("Salary : "+salary);
	}
}
public class Employee {
	public static void main(String[] args) {
		EmployeesInfo emp=new EmployeesInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		double salary =sc.nextDouble();
		System.out.println("Enter your working hours");
		int hours=sc.nextInt();
		emp.getInfo(salary, hours);
		salary=emp.addsal();
		salary=emp.AddSal();
		EmployeeSalary emp123= new EmployeeSalary(salary);
		emp123.printSal();
		
	}

	}



