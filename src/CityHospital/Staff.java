package CityHospital;

public class Staff {

    public static final String HOSITAL_NAME ="City General Hospital";
    public static final int MAX_WARD_CAPACITY =30;
    private static int staffCount = 0 ;

    public static void displayHospitalInfo(){
        System.out.println("--- Hospital Info ---");
        System.out.println("Hospital : " + HOSITAL_NAME);
        System.out.println("Max Capacity : " + MAX_WARD_CAPACITY);
        System.out.println("Staff On Record : " + staffCount + "\n");
    }



    private String staffId;
    private String staffName;
    private String department;

    public Staff(String staffId, String staffName, String department) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.department = department;
        staffCount++;
    }

    public void displayStaff(){
        System.out.printf("[%s] %s - %s %n" , this.staffId , this.staffName , this.department);
    }


}
