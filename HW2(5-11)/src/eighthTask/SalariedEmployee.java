package eighthTask;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public SalariedEmployee(String socialSecurityNumber, String name, int hourlyRate, int numberOfHoursWorked) throws Exception {
        super(socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked*22;
        this.name = name;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ID: " + socialSecurityNumber + " Name: " + name + " Salary: " + calculatePay();
    }
}
