//CHeck Employee Is Prasent Or Absent


import java.util.*;
import java.util.Random;


public class EmployeeWages {
	Public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		Attendance();
}		
public static void Attendance()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
}

} 




/*  uc2/Calculate Daily EmployeeWage


import java.util.Random;

	pblic class EmployeeWage {
	public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		CalculateDailyWages();
}

public static void CalculateDailyWages()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	int RatePerHour = 20;
	int FullDayHour = 8;
	int TotalWages = 0;
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
		TotalWages = RatePerHour * FullDayHour;
		System.out.println("Daily Wages  : "+ TotalWages);
		
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
}

} 




/* uc3 Calculate Part Time Wage


import java.util.Random;

public class EmployeeWages {
	public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		CalculateDailyWages();
}

public static void CalculateDailyWages()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	int RatePerHour = 20;
	int PartTimeHour = 4;
	int FullDayHour = 8;
	int TotalWages= 0;
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
		TotalWages = RatePerHour * PartTimeHour;
		System.out.println("Daily PartTime Wages  : "+ TotalWages);
		
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
 }

 }  


/* Uc4 Employee Wage Using Switch Case



import java.util.Random;
import java.util.Scanner;


public class EmployeeWages{
        public static void main( String []args )
        {
                System.out.println("Welcome");
                Jadeja();
        }
        static void Jadeja(){
                Scanner in = new Scanner(System.in);
                int PartTimeHour = 4;
                int RatePerHour = 20;
                int FullDayHour = 8;
                int Day = 0 ;
                Random rn = new Random ();
                int rand =rn.nextInt(3);
                        switch(rand){
                                        case 1:
                                                System.out.println("IT's Full Time Wages: ");
                                                System.out.println("Enter NUmber Of Working Day's: ");
                                                Day = in.nextInt();
                                                int FullTimeWages = RatePerHour * (FullDayHour * Day);
                                                System.out.println("FullTimeWages for " + Day +" Days: " + "Rs." + FullTimeWages);
                                                break;
                       
                                        case 2:
                                                System.out.println("IT's Part Time Wages: ");
                                                System.out.println("Enter Number Of Working Day's: ");
                                                Day = in.nextInt();
                                                int PartTimeWages = Day * PartTimeHour * FullDayHour;
                                                System.out.println("PartTimeWages for " + Day +" days: " + "Rs." + PartTimeWages);
                                                break;
                                        default:
                                                System.out.println("Employee is Absent..........!");
                                                break;
                                     }
                        in.close();
        		}
        }


//Calculate Wage For Month


import java.util.Random;
import java.util.*;


public class EmployeeWage{
        public static void main( String []args )
        {
                System.out.println("Welcome");
                Dhoni();
        }

                static void Dhoni(){
                                        int TotalWorkingHour = 8 ;
                                        int TotalWorkingDay  = 20 ;
                                        int RatePerHour = 20 ;
                                        int IsPartTime = 2 ;
                                        int IsFullTime = 1 ;
                                        int RatePerhour = 4 ;


                                        Random rn = new Random();
                                        int rand = rn.nextInt(3);
                                        if (rand == 0)
                                        {
                                                System.out.println("----------This is Full time Work in Month---------");
                                                int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerHour ;
                                                System.out.println("Total Employee Wages is: " + TotaEmployeeWage);
                                        }
                                        else if (rand == 0)
                                        {
                                                System.out.println("-------This is Part Time Work in Month--------");
                                                int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerhour;
                                                System.out.println("Total Employee Wages is: "+ TotaEmployeeWage);
                                        }
                                        else
                                        {
                                                System.out.println("----Employee is Absent------");
                                        }



                           }


}

//Calculate Employee Wage Using Till Condition

import java.util.Random;
import java.util.Scanner;

			public class EmployeeWage {

			public static final int FullDayHour = 8;
			public static final int WorkingDayMonth = 20;
			public static final int maxHoursInMonth = 100;
			public static final int perHour = 20;

	public static void main(String x[]) {

		//UC6_Employee_Wages _Till The Condition
		MonthlyWages();
	}

	static void MonthlyWages() {
		int fullTimeDays = 0;
		int partTimeDays = 0;
		int totalempHour = 0;
		int totalWorkingDay = 0;
		int absent = 0;

		while (maxHoursInMonth > totalempHour && WorkingDayMonth > totalWorkingDay) {

			totalWorkingDay++;

			Random rn = new Random();
			int rand = rn.nextInt(3);

			switch (rand) {

			case 0:
				fullTimeDays++;
				totalempHour = totalempHour + FullDayHour;
				break;
			case 1:
				partTimeDays++;
				totalempHour = totalempHour + (FullDayHour / 2);
				break;
			default:
				absent++;
				break;
				
			}
		}
		int FullTimeSalary = perHour * (FullDayHour * fullTimeDays);
		int PartTimeSalary = (partTimeDays * (FullDayHour / 2)) * perHour;

		System.out.println("------------Employee_Wages-------------");
		System.out.println("---------------------------------------");
		System.out.println("FullTime_Days_in_month: " + fullTimeDays);
		System.out.println("PartTime_Days_in_month: " + partTimeDays);
		System.out.println("Absent_Days_in_month: " + absent);
		System.out.println("Total_working_Days_IN_month : " + (fullTimeDays + partTimeDays));
		System.out.println("Total_Hours    :===> " + totalempHour);
		System.out.println("FullTime_Salary:===> " + FullTimeSalary);
		System.out.println("PartTime_Salary:===> " + PartTimeSalary);
		System.out.println("Total_Salary   :===> " + (FullTimeSalary + PartTimeSalary));
		System.out.println("---------------------------------------");
		System.out.println(totalWorkingDay);

	}
} 
