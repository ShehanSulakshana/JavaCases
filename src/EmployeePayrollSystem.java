import java.util.Scanner;

public class EmployeePayrollSystem {
    public static void main (String[] args){

        System.out.println("\n#### Mini Employee Payroll System ####\n\n");

        Scanner Scan = new Scanner(System.in);

        System.out.print("[#] How many employees ? :");
        int EmpCount = Scan.nextInt();

        String[][] employees = new String[EmpCount][];
        //String[] item = new String[3];

        double Highest = 0 ;
        double Total = 0 ;

        for (int i = 0; i< EmpCount; i++){
            double EmpPayment = 0;

            System.out.println("\n[Employee "+ (i+1) +"]");
            System.out.print("~ Employee Name : ");
            String EmpName = Scan.next();

            System.out.print("~ Hourly Wage : ");
            double Hwage = Scan.nextDouble();

            System.out.print("~ Total Working Hours For A Week : ");
            int HourCount = Scan.nextInt();

            //Payment Calc
            if (HourCount>40){
                EmpPayment += 40*Hwage;
                EmpPayment += ((HourCount-40)*(1.5*Hwage));
            }else{
                EmpPayment += HourCount*Hwage;
            }

            //Store in single array
            String[] data = {EmpName, String.valueOf(Hwage), String.valueOf(HourCount) , String.valueOf(EmpPayment)};
            // Store in multi array
            employees[i] = data;

            //Calc Total of employee payments
            Total += EmpPayment;

            // Set Highest value
            if (EmpPayment>Highest){
                Highest = EmpPayment;
            }

        }


        System.out.println("\n\n[*] ALL EMPLOYEES ,WITH THEIR PAYMENTS....... ");
        for (int i = 0; i < employees.length ; i++) {
            System.out.println("\n# EMPLOYEE ["+(i+1)+"]");
            System.out.println("~ Employee Name               : "+ employees[i][0]);
            System.out.println("~ Hourly Wage                 : "+ employees[i][1]);
            System.out.println("~ Working Hours For A Week    : "+ employees[i][2]);
            System.out.println("~ Total Payment : "+ employees[i][3]);
        }

        System.out.println("\n\n[#] Highest payment for the week : " + String.valueOf(Highest));
        System.out.println("[#] Total Payment : " + String.valueOf(Total));





    }
}
