package CityHospital;

public class Main {

    public static void main(String[] args){

        // ----------------------------------------
        Patient patient1 = new Patient(
                1001,
                "Alice Brown",
                35,
                "ICU"
        );

        Patient patient2 = new Patient(1002 , "Bob Perera");
        patient2.setAge(47).setWard("Cardiology");

        patient1.printInfo();
        patient2.printInfo();



        // -----------------------------------------

        Staff.displayHospitalInfo();

        Staff staff1 = new Staff(
                "5001",
                "Dr. Nimal Fernando",
                "Cardiology"
        );
        Staff staff2 = new Staff(
                "5002",
                "Nurse Priya Perera",
                "ICU"
        );
        Staff staff3 = new Staff(
                "5003",
                "Dr. Amara Silva",
                "Neurology"
        );

        Staff.displayHospitalInfo();

        staff1.displayStaff();
        staff2.displayStaff();
        staff3.displayStaff();

        System.out.println();

        // -----------------------------------------

        MedicalStaff[] medicalStaff = new MedicalStaff[4];

        medicalStaff[0] = new Doctor("D001", "Dr. Nimal Fernando", 5000, 300, 10);
        medicalStaff[1] = new Doctor("D002", "Dr. Priya Silva", 5500, 250, 12);
        medicalStaff[2] = new Nurse ("N001", "Nurse Ana Mendis", 3000, 40);
        medicalStaff[3] = new Nurse ("N002", "Nurse Kumari Perera", 2800, 35);

        for(MedicalStaff staff : medicalStaff){
            staff.printSlip();
            System.out.println();
        }


        // -----------------------------------------

        Patient p = new Patient(1001, "Alice Brown", 35, "ICU");
        System.out.println("Created: " + p.getName() + ", Age: " + p.getAge() + ", Ward: " + p.getWard());

        p.setAge(-10);
        p.setAge(150);
        p.setWard("");

        System.out.println("After attempts: " + p.getName() + ", Age: " + p.getAge() + ", Ward: " + p.getWard());





    }

}
