package Employee_wage.UC_09;

import java.util.Random;

public class EmpWageBuilder {

    private final CompanyEmpWage company;
    private static final Random random = new Random();

    public EmpWageBuilder(CompanyEmpWage company) {
        this.company = company;
    }

    public void computeEmployeeWage() {
        int totalHours = 0;
        int totalDays = 0;

        while (totalDays < company.maxWorkingDays &&
                totalHours < company.maxWorkingHours) {

            totalDays++;
            int empType = random.nextInt(3);
            int empHours = empType == 1 ? 8 : empType == 2 ? 4 : 0;

            if (totalHours + empHours > company.maxWorkingHours) {
                empHours = company.maxWorkingHours - totalHours;
            }

            totalHours += empHours;
            company.totalWage += empHours * company.wagePerHour;
        }
    }
}
