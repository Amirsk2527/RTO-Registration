package Com.service;

import java.util.Scanner;

import Com.model.Vehicle;

public class Pune implements Rto {

		Vehicle v = new Vehicle();
		Scanner s=new Scanner(System.in);
		@Override
		public void regVehicle() {
		System.out.println("Enter registeration id: ");
		v.setRegId(s.nextInt());
		System.out.println("Enter model name: ");
		s.nextLine();
		v.setModelName(s.nextLine());
		System.out.println("Enter price here: ");
		v.setPrice(s.nextFloat());
		System.out.println("Enter colour: ");
		v.setColour(s.next());
		System.out.println("Enter area: ");
		v.setArea(s.next());
		System.out.println("Enter owner name: ");
		s.nextLine();
		v.setOwnerName(s.nextLine());
		System.out.println("Enter mob no: ");
		v.setMob(s.nextLong());
		System.out.println("Enter adhar no: ");
		v.setAdhar(s.nextLong());
		System.out.println("Vehicle registeredsuccessfully");
		}
		@Override
		public void viewDetails() {
		System.out.println("____________________Vehicledetails__________________");
		System.out.println("Registeration id:"+v.getRegId());
		System.out.println("Model name: "+v.getModelName());
		System.out.println("Price: "+v.getPrice());
		System.out.println("Colour: "+v.getColour());
		System.out.println("Area: "+v.getArea());
		System.out.println("Owner name: "+v.getOwnerName());
		System.out.println("Mob.No: "+v.getMob());
		System.out.println("Aadhar card no: "+v.getAdhar());
		}
		@Override
		public void updateVehicle() {
		System.out.println("1.Update price\n2.Update Ownername");
		System.out.println("What you want to update?\nEnterchoice");
		int ch=s.nextInt();
		switch(ch) {
		 case 1:
		 System.out.println("Enter new price: ");
		 float pr=s.nextFloat();
		 v.setPrice(pr);
		 System.out.println("Price updated");
		 break;
		 case 2:
		 System.out.println("Enter new owner name: ");
		 s.nextLine();
		 String nm=s.nextLine();
		 v.setOwnerName(nm);
		 System.out.println("Name updatedsuccessfully");
		 break;
		 default:
			 System.out.println("Invalid input");
			}
		}
}
			

	