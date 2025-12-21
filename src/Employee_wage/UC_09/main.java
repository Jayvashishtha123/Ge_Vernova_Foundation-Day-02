package Employee_wage.UC_09;


public class main {
    public static void main(String[] args) {

        CompanyEmpWage tcs =
                new CompanyEmpWage("TCS", 20, 20, 100);

        EmpWageBuilder builder =
                new EmpWageBuilder(tcs);

        builder.computeEmployeeWage();

        System.out.println("Company : " + tcs.companyName);
        System.out.println("Total Wage : " + tcs.totalWage);
    }
}
