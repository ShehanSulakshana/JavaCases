package UniversityCourseRegSystem;

//Q7
public class GraduateStudent extends Student implements Reportable{

    //Q8
    private String researchArea;

    public GraduateStudent(String registrationNumber, String universityName, String name, int marks, String researchArea) {
        super(registrationNumber, universityName, name, marks);
        this.researchArea = researchArea;
    }

    //Q9
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Research Area : "+ researchArea);
    }

    //Q14

    @Override
    public void generateReport(){

    }

    @Override
    public void printReport(){

    }

}
