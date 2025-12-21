package Employee_wage.UC_09;

public class CompanyEmpWage {

    public final String companyName;
    public final int wagePerHour;
    public final int maxWorkingDays;
    public final int maxWorkingHours;

    public int totalWage;

    public CompanyEmpWage(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }
}
