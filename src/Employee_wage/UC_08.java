package Employee_wage;

import java.util.Random;

public class UC_08 {

    private static final Random random = new Random();

    // ===== Class Method with Parameters =====
    public static void computeEmployeeWage(
            String companyName,
            int wagePerHour,
            int fullTimeHours,
            int partTimeHours,
            int maxWorkingDays,
            int maxWorkingHours) {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empType = random.nextInt(3);
            int empHours = getEmployeeHours(empType, fullTimeHours, partTimeHours);

            if (totalWorkingHours + empHours > maxWorkingHours) {
                empHours = maxWorkingHours - totalWorkingHours;
            }

            totalWorkingHours += empHours;
            totalWage += empHours * wagePerHour;
        }

        System.out.println("Company : " + companyName);
        System.out.println("Total Working Days  : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Monthly Wage  : " + totalWage);
        System.out.println("-----------------------------------");
    }

    // ===== Helper Method =====
    private static int getEmployeeHours(int empType, int fullTimeHours, int partTimeHours) {
        switch (empType) {
            case 1:
                return fullTimeHours;
            case 2:
                return partTimeHours;
            default:
                return 0;
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {

        computeEmployeeWage(
                "TCS",
                20,
                8,
                4,
                20,
                100
        );

        computeEmployeeWage(
                "Infosys",
                25,
                8,
                5,
                22,
                120
        );

        computeEmployeeWage(
                "Wipro",
                18,
                8,
                4,
                20,
                90
        );
    }
}
