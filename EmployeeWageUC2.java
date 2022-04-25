package com.bridgelabz.day8Assignment;

public class EmployeeWageUC2 {
	public void Welcome(){
			System.out.println("Welcome to Employee Wage Computation");
			
		}
		   public void PresentOrAbsent(){
			   int isPresent=1;
			   double empCheck = Math.floor(Math.random() * 10) % 2;
			      if(empCheck==isPresent)
			        System.out.println("The number is "+ empCheck+" So Employee is Present");
			      else
			    	  System.out.println("The number is "+ empCheck+" So Employee is not Present");  
		   }

	      public static void main(String[] args) {
		     EmployeeWageUC2 employeeWageUC2=new EmployeeWageUC2();
		     employeeWageUC2.Welcome();
		     employeeWageUC2.PresentOrAbsent();
		}
}

	
