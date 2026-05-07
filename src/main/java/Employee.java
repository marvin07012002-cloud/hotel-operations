public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int timeClockIn;

    // employeeId, name, department, payRate, hoursWorked
    public double getTotalPay() {
        double totalPay;
        totalPay = hoursWorked * payRate;
        return totalPay;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        }
        return 40;
    }

    public double getOverTimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public void punchIn(int time) {
        this.timeClockIn = time;
    }

    public void punchOut(int time) {
        int todayHours = time - this.timeClockIn;

        this.hoursWorked = todayHours + this.hoursWorked;


    }


}
