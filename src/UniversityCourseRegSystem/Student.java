package UniversityCourseRegSystem;

public class Student {

    // Q1
    private final String registrationNumber;
    private final String universityName;
    private String name;
    private int marks;

    static int totalStudents;

    // Q2
    public String getRegistrationNumber() {return registrationNumber;}
    public String getUniversityName() {return universityName;}

    public String getName() {return name;}
    public void setName(String name) {
        if (marks>=0 && marks<=100){
            this.name = name;
        }else{
            System.out.println("Invalid Marks.");
        }
    }

    public int getMarks() {return marks;}
    public void setMarks(int marks) {this.marks = marks;}


    // Q3
    public Student() {
        this.registrationNumber = "Not Added";
        this.universityName = "Not Added";
        this.name = "Not Added";
        this.marks = 0;
    }

    public Student(String registrationNumber, String universityName, String name, int marks) {
        this.registrationNumber = registrationNumber;
        this.universityName = universityName;
        this.name = name;
        this.marks = marks;
    }

    // Q5
    void calculateGrade(){
        char Grade;
        if(this.marks>=75){
            Grade ='A';
        } else if (this.marks>=65) {
            Grade ='B';
        } else if (this.marks>=55) {
            Grade ='C';
        } else if (this.marks>=40) {
            Grade = 'D';
        }else {
            Grade = 'F';
        }
        System.out.println("Student Grade : "+ Grade);
    }

    void calculateGrade(int marks){
        if (marks>100 || marks<0){
            System.out.println("Invalid Marks");
            return;
        }
        char Grade;
        if(marks>=75){
            Grade ='A';
        } else if (marks>=65) {
            Grade ='B';
        } else if (marks>=55) {
            Grade ='C';
        } else if (marks>=40) {
            Grade = 'D';
        }else {
            Grade = 'F';
        }
        System.out.println("Student Grade : "+ Grade);
    }


    // Q6
    public void displayDetails(){
        System.out.println("Reg. No. : "+ this.registrationNumber + " | University : " + this.universityName + " | Name : " + this.name + " | Marks : " + this.marks);
    }








}
