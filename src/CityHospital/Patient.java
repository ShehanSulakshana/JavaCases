package CityHospital;

public class Patient {


    private int patientId;
    private String name;
    private int age;
    private String ward;
    private Boolean isAdmitted;


    Patient(int patientId , String name , int age , String ward){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.ward = ward;
        this.isAdmitted = true;
    }

    public Patient(int patientId, String name) {
        this(patientId , name , 0 , "General");
    }


    public Patient setAge(int age) {
        if (age>0 && age<=120){
            this.age = age;
        }else {
            System.out.println("ERROR - Invalid Age " + age + " Age Unchanged. Still : " + this.age);
        }
        return this;
    }

    public Patient setWard(String ward) {
        if (ward ==  null || ward.isBlank()){
            this.ward = "General";
            System.out.println("WARNING : Invalid Ward. Defaulting to General");
        }else {
            this.ward = ward;
        }
        return this;
    }

    public void printInfo(){
        System.out.println("Patient ID :" + this.patientId + "  |  Name : " + this.name);
        System.out.println("Age : " + this.age + "  |  Ward : " + this.ward + "  |  Admitted : " + this.isAdmitted + "\n");
    }

    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getWard() {
        return ward;
    }
    public Boolean getAdmitted() {
        return isAdmitted;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name can not be null or blank");
        }
        this.name = name;
    }
}
