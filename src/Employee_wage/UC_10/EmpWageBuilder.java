package Employee_wage.UC_10;

import java.util.Random;

public class EmpWageBuilder {

    private final CompanyEmpWage[] companies;
    private int count = 0;

    public EmpWageBuilder(int size) {
        companies = new CompanyEmpWage[size];
    }

    public void addCompany(CompanyEmpWage company) {
        companies[count++] = company;
    }

    public void computeAllWages() {
        for (int i = 0; i < count; i++) {
//            new EmpWageBuilder(companies[i]).computeEmployeeWage();
        }
    }
}

