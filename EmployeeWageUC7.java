package com.bridgelabz.day8Assignment;

public class EmployeeWageUC7 {
	final static int EMP_RATE_PER_HR = 20;
	final static int DAY_IN_MONTH=20;
	final static int IS_FULL_TIME=1;
	final static int IS_PART_TIME=2;
	final static int HR_PER_DAY=8;
	final static int HALF_PER_DAY=4;
	static int empHours=0;
	static int empCheck = (int)Math.floor(Math.random() * 10) % 3;
	
	  public static void Welcome(){
		System.out.println("Welcome to Employee Wage Computation");
		
	 }
	  
	  public static void PresentOrAbsent(){
		    if(empCheck==IS_FULL_TIME)
		        System.out.println("The number is "+ empCheck+" So Employee is Full Time");
		    else if(empCheck==IS_PART_TIME)
		    	  System.out.println("The number is "+ empCheck+" So Employee is Part time");
		    else
		    	System.out.println("The number is "+ empCheck+" So Employee is Not present");	
	   }
	   
      public static void Employeewage(){
    	  int empWage=0;
    	    switch(empCheck){
    	      case 1:
    		      empHours=HR_PER_DAY;
    		      break;
    	      case 2:
    		      empHours=HALF_PER_DAY;
    		      break;
    	      default:
    		      empHours=0;
    		      break;
    	 }
    	    
    		   empWage=EMP_RATE_PER_HR*empHours*DAY_IN_MONTH;
    		   System.out.println("The Employee wage in a month is : "+ empWage);
      }
      
         public static void main(String[] args) {
	     EmployeeWageUC7.Welcome();
	     EmployeeWageUC7.PresentOrAbsent();
	     EmployeeWageUC7.Employeewage();
	}

}
