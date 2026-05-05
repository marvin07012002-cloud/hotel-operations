public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;


// employeeId, name, department, payRate, hoursWorked
    public double getTotalPay() {
        double totalPay;
        totalPay = hoursWorked * payRate;
        return totalPay;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40){
            return hoursWorked;
        }
        return 40;
    }

    public double getOverTimeHours() {
        if (hoursWorked > 40){
            return hoursWorked - 40;
        }
        return 0;
    }
}
