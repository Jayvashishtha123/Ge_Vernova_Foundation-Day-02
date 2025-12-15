package Employee_wage;
import java.util.Random;

public class UC_06 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 8;

        int maxWorkingDays = 20;
        int maxWorkingHours = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        Random random = new Random();

        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            // 0 = Absent, 1 = Full Time, 2 = Part Time
            int empType = random.nextInt(3);
            int empHours = 0;

            switch (empType) {
                case 1:
                    empHours = fullTimeHours;
                    break;

                case 2:
                    empHours = partTimeHours;
                    break;

                default:
                    empHours = 0;
            }

            // Prevent exceeding max working hours
            if (totalWorkingHours + empHours > maxWorkingHours) {
                empHours = maxWorkingHours - totalWorkingHours;
            }

            totalWorkingHours += empHours;
            totalWage += empHours * wagePerHour;
        }

        System.out.println("Total Working Days  : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Monthly Wage  : " + totalWage);
    }
}
