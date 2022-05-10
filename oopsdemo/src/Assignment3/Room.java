package Assignment3;

import java.util.Scanner;

public class Room {
	private int roomNo;
	private String roomType;
	float area;
	boolean isAcMachine;
	Scanner s = new Scanner(System.in);
	
	public void inputDetails() {
		System.out.println("*********Enter Room details**********");
		System.out.println("Enter the room number :");
		roomNo = s.nextInt();
		System.out.println("Enter the room type :");
		roomType = s.nextLine();
		s.nextLine();
		System.out.println("Enter the area of the room in square meters :");
		area = s.nextFloat();
		System.out.println("Is the room have a Ac machine :");
		isAcMachine = s.nextBoolean();
		System.out.println("...........................................");
			
		}
	public void displayDetails() {
		System.out.println("**************Room Details*************");
		System.out.println(" Room number :"+roomNo);
		System.out.println("Room type is : "+roomType);
		System.out.println("Room area is : "+area);
		System.out.println("Does the room have AC machine : "+isAcMachine);
		System.out.println("****************");
		
	}

}
