package javaemployee;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		
		//Start with Displaying Welcome to Employee Wage Computation Program on Master Branch
		System.out.println("Welcome to Employee Wage Computation Program!");
	
		
		//Check Employee is Present or Absent
		double empCheck = Math.floor(Math.random()*10) % 2;
		if (empCheck == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	
	}
}
