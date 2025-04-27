import java.util.Scanner;

public class TempConvert{
	public static void main(String[] args){
		int C ,F ,K ;
		double ToTemp;

		System.out.println("# UNIT LIST ");
		System.out.println("1) Celcius");
		System.out.println("2) Fahrenheit");
		System.out.println("3) Kelvin");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Temperature : ");
		double Temp = scanner.nextDouble();
		System.out.print("Enter the unit [no.] : ");
		int FromUnit = scanner.nextInt();
		System.out.print("To which unit? [no.] : ");
		int ToUnit = scanner.nextInt();

		if (FromUnit==1 && ToUnit==2){
			ToTemp = ((Temp*9/5)+32);
		}else if (FromUnit==1 && ToUnit==3){
			ToTemp = ((Temp)+273.15);
		}else if (FromUnit==2 && ToUnit==3){
			ToTemp = (((Temp-32)*5/9)+273.15);
		}else if (FromUnit==2 && ToUnit==1){
			ToTemp = ((Temp-32)*5/9);
		}else if (FromUnit==3 && ToUnit==1){
			ToTemp = (Temp-273.15);
		}else {
			ToTemp = (Temp-((273.15)*9/5)+32);
		}
		
		switch(ToUnit){
		case 1 :
			System.out.println("TEMP = "+ ToTemp + " C");
			break;
		case 2 :
			System.out.println("TEMP = "+ ToTemp + " F");
			break;
		case 3 :
			System.out.println("TEMP = "+ ToTemp + " K");
			break;
		}	
	}
}