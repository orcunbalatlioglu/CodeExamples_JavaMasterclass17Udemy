public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        System.out.println(worker1);

        Worker worker2 = new Worker("Nameless Worker 2", "02/01/2001");
        System.out.println(worker2);

        Worker worker3 = new Worker("Nameless Worker 3", "02/01/2001");
        System.out.println(worker3);

        Employee employee = new Employee();
        System.out.println(employee);

        Employee employee2 = new Employee("01/02/2020");
        System.out.println(employee2);

        SalariedEmployee salariedEmployee = new SalariedEmployee();
        System.out.println(salariedEmployee);

        SalariedEmployee salariedEmployee2 = new SalariedEmployee(1000.2);
        System.out.println(salariedEmployee2);

        SalariedEmployee salariedEmployee3 = new SalariedEmployee("Jamie","03/04/2001","01/02/2020",1000.2);
        System.out.println(salariedEmployee3);

        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        System.out.println(hourlyEmployee);

        HourlyEmployee hourlyEmployee2 = new HourlyEmployee(25.2);
        System.out.println(hourlyEmployee2);

        HourlyEmployee hourlyEmployee3 = new HourlyEmployee("Max","01/02/2002","01/02/2005",25.2);
        System.out.println(hourlyEmployee3);

        System.out.println(salariedEmployee3.getName() + " is " + salariedEmployee3.getAge());
        System.out.println(salariedEmployee3.getName() + " collected his payment: "+ salariedEmployee3.collectPay());
        salariedEmployee3.retire();
        if(salariedEmployee3.isRetired()){
            System.out.println(salariedEmployee3.getName() + " is retired");
        }
        System.out.println(salariedEmployee3);

        System.out.println(hourlyEmployee3.getName() + " is " + salariedEmployee3.getAge());
        System.out.println(hourlyEmployee3.getName() + " collected his payment: "+ hourlyEmployee3.collectPay());
        System.out.println(hourlyEmployee3.getName() + " collected his double payment: "+ hourlyEmployee3.getDoublePay());


    }
}
