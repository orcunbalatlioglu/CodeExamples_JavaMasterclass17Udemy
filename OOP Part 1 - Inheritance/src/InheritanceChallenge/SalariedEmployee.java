import java.time.LocalDate;
public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;
    public SalariedEmployee(){
        super();
    }

    public SalariedEmployee(double annualSalary){
        super();
        this.annualSalary = annualSalary;
    }

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        super.terminate(LocalDate.now().toString());
        isRetired = true;
    }

    @java.lang.Override
    public double collectPay() {
        return annualSalary / 26;
    }

    public boolean isRetired() {
        return isRetired;
    }

    @java.lang.Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
