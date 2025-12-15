package Employee_wage;
import java.util.Random;

public class UC_03 {
    public static void main(String[] args) {
        //USE-CASE-03:- Add Part tim Employee & Wage

        int wagePerHour=20;
        int fullTimeHours=8;
        int partTimeHours = 8;

        Random random = new Random();
        int empType = random.nextInt(3);
        int empHours = 0;
        switch (empType) {
            case 1:
                empHours = fullTimeHours;
                System.out.println("Employee is Full Time");
                break;

            case 2:
                empHours = partTimeHours;
                System.out.println("Employee is Part Time");
                break;

            default:
                empHours = 0;
                System.out.println("Employee is Absent");
        }
        int dailyWage = empHours * wagePerHour;
        System.out.println("Daily Employee Wage = " + dailyWage);
    }
}
