import java.time.LocalDate;
public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(){
        super();
    }
    public HourlyEmployee(double hourlyPayRate){
        super();
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @java.lang.Override
    public double collectPay() {
        return 40*hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }

    @java.lang.Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
