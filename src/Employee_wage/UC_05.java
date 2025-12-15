package Employee_wage;
import java.util.Random;
public class UC_05 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 8;
        int workingDays = 20;

        int totalMonthlyWage = 0;

        Random random = new Random();

        for (int day = 1; day <= workingDays; day++) {

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

            int dailyWage = empHours * wagePerHour;
            totalMonthlyWage += dailyWage;
        }

        System.out.println("Total Monthly Employee Wage = " + totalMonthlyWage);
    }
}
