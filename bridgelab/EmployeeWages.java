package bridgelab;

import java.util.Random;

public class EmployeeWages
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to employee wage computation. ");

        Random rand = new Random();

        int empHrs=0;

        int salary;

        int present = 1;

        int absent = 2;

        int part_time_present = 3;

        int wage_per_hr = 20;

        int full_day_hr = 8;

        int part_time_hr = 8;

        int max_working_days = 20;

        int max_working_hrs = 100;

        int working_hrs=0;

        int working_days=0;

        while (working_hrs < max_working_hrs && working_days < max_working_days) {

            int check = rand.nextInt(3) + 1;

            if (check == present) {

                System.out.println("Employee is present.");

            } else if (check == part_time_present) {

                System.out.println("Employee is present for part time.");

            } else {

                System.out.println("Employee is absent.");

            }

            switch (check) {

                case 1 -> empHrs = 8;
                case 2 -> empHrs = 0;
                case 3 -> empHrs = 4;

            }

            int this_day = empHrs*wage_per_hr;

            System.out.println(this_day);

            working_hrs = working_hrs + empHrs;

            working_days = working_days + 1;

        }

        salary = working_hrs * wage_per_hr;

        System.out.println("salary of month is : " + salary);

    }

}
