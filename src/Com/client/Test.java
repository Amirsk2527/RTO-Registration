package Com.client;

import java.util.Scanner;

import Com.service.Pune;
import Com.service.Rto;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Rto rto = new Pune();
		
		while(true) {
			System.out.println("Welcome to Vehicle registeration system\nOptions");
			System.out.println("1.Register your vehicle\n2.View your vehcile\n3.Update your details");
			System.out.println("What is your choice?");
			int ch=s.nextInt();
			switch(ch) {
				case 1:
				    rto.regVehicle();
				break;
				case 2:
					rto.viewDetails();
				break;
				case 3:
					rto.updateVehicle();
				break;
				default:
					System.out.println("Invalid input");
			}
		}
	}
}


