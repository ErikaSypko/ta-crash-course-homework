package eighthTask;

import java.util.ArrayList;

public abstract class Employee implements Calculable, Comparable<Employee> {
    protected String employeeId;
    protected String name;
    private static ArrayList<String> IDs = new ArrayList<>();

    public Employee(String employeeId) throws Exception {
        if (IDs.contains(employeeId)) {
            throw new Exception("Id is already used " + employeeId);
        }
        this.employeeId = employeeId;
        IDs.add(employeeId);
    }

    @Override
    public abstract int calculatePay();

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(calculatePay(), e.calculatePay());
    }
}

