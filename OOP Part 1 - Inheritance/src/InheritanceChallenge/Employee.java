public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static long employeeNo = 1;
    public Employee(){
        super();
    }
    public Employee(String hireDate){
        super();
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }

    @java.lang.Override
    public String toString() {

        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}'+ super.toString();
    }
}
