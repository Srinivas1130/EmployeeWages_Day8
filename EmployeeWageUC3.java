package com.bridgelabz.day8Assignment;

public class EmployeeWageUC3 {
	final int EMP_RATE_PER_HR = 20;
	final int HR_PER_DAY=8;
	public void Welcome(){
		System.out.println("Welcome to Employee Wage Computation");
		
	}
	   public void PresentOrAbsent(){
		   int isPresent=1;
		   double empCheck = Math.floor(Math.random() * 10) % 2;
		      if(empCheck==isPresent){
		    	  int empWage=EMP_RATE_PER_HR*HR_PER_DAY;
		           System.out.println("The number is "+ empCheck+" So Employee is Present");
		           System.out.println("The Employee wage is : "+ empWage);
		      }
		      else
		    	  System.out.println("The number is "+ empCheck+" So Employee is not Present");  
	   }

      public static void main(String[] args) {
	     EmployeeWageUC3 employeeWageUC3=new EmployeeWageUC3();
	     employeeWageUC3.Welcome();
	     employeeWageUC3.PresentOrAbsent();
	}
}


