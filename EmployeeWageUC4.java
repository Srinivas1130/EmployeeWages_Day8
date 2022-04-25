package com.bridgelabz.day8Assignment;

public class EmployeeWageUC4 {
	final int EMP_RATE_PER_HR = 20;
	final int IS_FULL_TIME=1;
	final int IS_PART_TIME=0;
	final int HR_PER_DAY=8;
	final int HALF_PER_DAY=4;
	double empCheck = Math.floor(Math.random() * 10) % 2;
	
	  public void Welcome(){
		System.out.println("Welcome to Employee Wage Computation");
		
	 }
	  
	  public void PresentOrAbsent(){
		   int isPresent=1;
		     if(empCheck==isPresent)
		        System.out.println("The number is "+ empCheck+" So Employee is Full Time");
		      else
		    	  System.out.println("The number is "+ empCheck+" So Employee is Part time");  
	   }
	   
      public void Employeewage(){
    	  int empWage=0;
    	    if(empCheck==IS_FULL_TIME){
    		   empWage=EMP_RATE_PER_HR*HR_PER_DAY;
    		   System.out.println("The Employee wage is : "+ empWage);
    	  }
    	    else{
    		   empWage=EMP_RATE_PER_HR*HALF_PER_DAY;
    		  System.out.println("The Employee wage is : "+ empWage);
    	   }
      }
      
         public static void main(String[] args) {
	     EmployeeWageUC4 employeeWageUC4=new EmployeeWageUC4();
	     employeeWageUC4.Welcome();
	     employeeWageUC4.PresentOrAbsent();
	     employeeWageUC4.Employeewage();
	}

}
