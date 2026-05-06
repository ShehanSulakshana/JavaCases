package CityHospital;

public abstract class MedicalStaff {

    protected String staffId;
    protected String name;
    protected double baseSalary;

    public MedicalStaff(String staffId, String name, double baseSalary) {
        this.staffId = staffId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void printSlip(){
        System.out.printf("==== Payslip: %s ====%n" ,  name);
        System.out.println("Staff ID : " + staffId);
        System.out.println("Base     : $" + baseSalary);
        System.out.println("Total    : $" + this.calculateSalary());
    }

}
