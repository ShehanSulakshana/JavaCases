package CityHospital;

public class Nurse extends MedicalStaff{

    private int overtimeHours;

    public Nurse(String staffId, String name, double baseSalary, int overtimeHours) {
        super(staffId, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    double calculateSalary() {
        double monthlySalary = this.baseSalary + (this.overtimeHours * 15.0);
        return monthlySalary;
    }

}
