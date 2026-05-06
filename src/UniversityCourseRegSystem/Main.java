package UniversityCourseRegSystem;

public class Main {

    public static void main(String[] args){

        Student graduateStudent = new GraduateStudent(
                "2023IT010",
                "OUSL",
                "Kamal",
                86,
                "Artificial Intelligence"
        );

        Student student = new Student(
                "2023IT010",
                "OUSL",
                "Nimal",
                75
        );

        graduateStudent.displayDetails();




    }



}
