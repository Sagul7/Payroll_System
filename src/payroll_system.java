class Empolyee {
    String name;

    public void calculatePay(Double Salary) {
        System.out.println("Salary of SalariedEmployee " + (12 * Salary));
    }

    public void calculatePay(Double hourlyRate, Double hourlyWorked)
    {
        System.out.println("Salary of HourlyEmployee "+ (hourlyRate * hourlyWorked));
    }
}

public class payroll_system {
    public static void main(String[] args) {
     Empolyee emp=new Empolyee();
     emp.name="sagul";
     System.out.println(emp.name);
     emp.calculatePay(4000.0);
     emp.calculatePay(1000.0,24.0);


    }
}
