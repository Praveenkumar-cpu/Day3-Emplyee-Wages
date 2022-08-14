package bridgelab;

public class EmployeeWagesBuilder{
    final static int IS_FULL_TIME = 1;
    final static int IS_PART_TIME = 2;
    private int numberOfCompanies = 0;

    private static int numberOfWorkingDays=0;

    private static int maxHoursPerMonth = 0;

    private static int empRatePerHr = 0;
    private  Company[] company;

    public EmployeeWagesBuilder(int numberOfWorkingDays, int maxHoursPerMonth, int empRatePerHr) {
        EmployeeWagesBuilder.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.empRatePerHr = empRatePerHr;
        this.company = new Company[5];
    }


    public void addCompanyDetailsForEmpWage(String companyName, int empRatePerHr, int numberOfWorkingDays,
                                            int maxWorkingHrsPerMonth) {
        company[numberOfCompanies] = new Company(companyName, empRatePerHr, numberOfWorkingDays,
                maxWorkingHrsPerMonth);
        numberOfCompanies++;
    }

    public void companyEmpWage() {
        for (int i = 0; i < numberOfCompanies; i++) {
            this.empWageComputation(company[i]);
        }
    }

    // method to get working hour of a employee for a day
    public int getEmpHrs() {
        int empHrs;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        // checking how much employee has worked daily
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


    public void empWageComputation(Company company) {
        int days = 0;
        int totalWorkingHrs = 0;
        int totalEmpWage = 0;
        while (days < company.numberOfWorkingDays && totalWorkingHrs <= company.maxWorkingHrsPerMonth) {
            
            days++;
            int empHrs = this.getEmpHrs();
            totalWorkingHrs += empHrs;
            System.out.println("emp hrs : " + empHrs);
        }
        totalEmpWage = totalWorkingHrs * company.empRatePerHr;
        System.out.println("Total employee wage for company " + company.companyName + " is " + totalEmpWage);
    }

    public static void main(String args[]) {
        // welcome message
        System.out.println("Welcome to employee wage computation problem");
        System.out.println("Calculating wages for employees");
        EmployeeWagesBuilder empWageBuilder = new EmployeeWagesBuilder(numberOfWorkingDays, maxHoursPerMonth, empRatePerHr);
        empWageBuilder.addCompanyDetailsForEmpWage("infosys", 20, 20, 100);
        empWageBuilder.addCompanyDetailsForEmpWage("wipro", 25, 20, 80);
        empWageBuilder.companyEmpWage();
    }


}
