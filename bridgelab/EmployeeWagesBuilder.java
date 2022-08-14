package bridgelab;

import java.util.Random;

public class EmployeeWagesBuilder{

    //constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int numbersOfWorkingDays;
    private final int maxHoursPerMonth;
    private final int empRatePerHr;


    public EmployeeWagesBuilder(String company, int numbersOfWorkingDays, int maxHoursPerMonth, int empRatePerHr) {
        this.company = company;
        this.numbersOfWorkingDays = numbersOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.empRatePerHr = empRatePerHr;
    }
    public int getEmpHrs() {
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
    public void empWageComputation() {
        int days = 0;
        int totalWorkingHrs = 0, totalEmpWage;
        while (days < numbersOfWorkingDays && totalWorkingHrs <= maxHoursPerMonth) {
            days++;
            int empHrs = getEmpHrs();
            totalWorkingHrs += empHrs;
            System.out.println("emp hrs : " + empHrs);
        }
        totalEmpWage = totalWorkingHrs * empRatePerHr;
        System.out.println("Total Emp wage for company " + this.company + " is " + totalEmpWage);
    }



    public static void main(String[] args) {

        System.out.println("Welcome to employee wage computation problem");
        EmployeeWagesBuilder infosys = new EmployeeWagesBuilder("Infosys", 20, 10, 2);
        EmployeeWagesBuilder wipro = new EmployeeWagesBuilder("Wipro", 10, 20, 4);
        infosys.empWageComputation();
        wipro.empWageComputation();


    }

}
