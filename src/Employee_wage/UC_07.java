package Employee_wage;
import java.util.Random;

public class UC_07 {

    // ===== Class Variables (Constants) =====
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 8;

    private static final int MAX_WORKING_DAYS = 20;
    private static final int MAX_WORKING_HOURS = 100;

    private static final Random random = new Random();

    // ===== Class Method =====
    public static void computeEmployeeWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS &&
                totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

            int empType = random.nextInt(3);
            int empHours = getEmployeeHours(empType);

            if (totalWorkingHours + empHours > MAX_WORKING_HOURS) {
                empHours = MAX_WORKING_HOURS - totalWorkingHours;
            }

            totalWorkingHours += empHours;
            totalWage += empHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Working Days  : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Monthly Wage  : " + totalWage);
    }

    // ===== Helper Method (DRY) =====
    private static int getEmployeeHours(int empType) {
        switch (empType) {
            case 1:
                return FULL_TIME_HOURS;
            case 2:
                return PART_TIME_HOURS;
            default:
                return 0;
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {
        computeEmployeeWage();
    }
}
