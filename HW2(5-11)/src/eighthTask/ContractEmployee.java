package eighthTask;

public class ContractEmployee extends Employee{
    private String federalTaxIdMember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String federalTaxIdMember, String name, int fixedMonthlyPayment) throws Exception {
        super(federalTaxIdMember);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.name = name;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ID: " + federalTaxIdMember + " Name: " + name + " Salary: " + calculatePay();
    }
}
