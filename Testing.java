/**
 * Testing Class
 * 
 * This class will be used for testing and demonstration. It should take in console commands for creating a new student, 
 * creating an event, marking a students attendance for an event, printing a student�s information (see student class) and 
 * printing a event�s information (see event class). No information is saved. When the method is stopped, all data is wiped.
 * 
 * Commands:
 * EXIT
 * Create Event
 * Create Student
 * Mark Attendance
 * View Student
 * View Event
 * View All Students
 * View All Events
 * 
 * Hackaton Group 5
 * 
 * Last Updated: 9/10/22
 */

import java.util.Scanner;

public class Testing {
	
	private String[] students;
	private int[] events;
	
	public static void main(String[] args)
	{
		//Add input
		boolean run = true;
		while(run){

			System.out.println("Type \"Create Event\", \"Create Student\", \"Mark Attendance\", \"View Student\", \"View Event\", or \"EXIT\" to end.");
			Scanner input1 = new Scanner(System.in);
			String path = input1.nextLine();
			

			switch(path){

				case("Create Event"):
					Create_Event();
					break;

				case("Create Student"):
					Create_Student();
					break;

				case("Mark Attendance"):
					Mark_Attendance();
					break;

				case("View Student"):
					View_Student(false);
					break;

				case("View Event"):
					View_Event(false);
					break;

				case("EXIT"):
					run = false;
					break;

				default:
					System.out.println("Invalid input!");
					break;

			}


		}


	}

	public static void Create_Event(){

	}

	public static void Create_Student(){

	}

	public static void Mark_Attendance(){

	}

	public static void View_Student(boolean all_students){

	}

	public static void View_Event(boolean all_events){
		
	}

}
