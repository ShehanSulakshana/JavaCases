package CityHospital;

public class Doctor extends MedicalStaff {

    private double consultationFee;
    private int numberOfConsultations;

    public Doctor(String staffId , String name , double baseSalary ,double consultationFee, int numberOfConsultations) {
        super(staffId , name , baseSalary );
        this.consultationFee = consultationFee;
        this.numberOfConsultations = numberOfConsultations;
    }

    @Override
    double calculateSalary() {
        double monthlySalary = this.baseSalary + (this.consultationFee * this.numberOfConsultations);
        return monthlySalary;
    }



}
