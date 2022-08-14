package bridgelab;

import java.util.Random;

public class EmployeeWages {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HOURS_IN_MONTH = 18;


    public static int getEmpHrs() {
        int empHrs;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;

            case IS_PART_TIME:
                empHrs = 4;
                break;

            default:
                empHrs = 0;
        }
        return empHrs;
    }
    public static void empWageComputation(String company, int numbersOfWorkingDays, int maxHoursPerMonth,
                                          int empRatePerHr) {
        int days = 0;
        int totalWorkingHrs = 0, totalEmpWage;
        while (days < numbersOfWorkingDays && totalWorkingHrs <= maxHoursPerMonth) {
            days++;
            int empHrs = getEmpHrs();
            totalWorkingHrs += empHrs;
            System.out.println("employee hrs : " + empHrs);
        }
        totalEmpWage = totalWorkingHrs * empRatePerHr;
        System.out.println("Total Employee wage for company " + company + " is " + totalEmpWage);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to employee wage computation problem");
        empWageComputation("WIPRO", 20, 10, 2);
        empWageComputation("INFOSYS", 10, 20, 4);


    }

}
