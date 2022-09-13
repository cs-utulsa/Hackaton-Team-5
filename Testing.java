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
import java.util.ArrayList;
import java.util.Arrays;

public class Testing {
	
	public static void main(String[] args)
	{

		//Add input
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Event> events = new ArrayList<Event>();

		boolean run = true;
		Scanner input1 = new Scanner(System.in);
		while(run){

			System.out.println("Type \"Create Event\", \"Create Student\", \"Mark Attendance\", \"View Event\", \"View Student\", \"View All Students\", \"View All Events\", or \"EXIT\" to end.");
			String path = input1.nextLine();

			switch(path){

				case("Create Event"):
					Event new_event = Create_Event();
					events.add(new_event);
					break;

				case("Create Student"):
					Student new_student = Create_Student();
					students.add(new_student);
					break;

				case("Mark Attendance"):
					ArrayList<String> necessary_info = Attendance();
					for(int counter = 0; counter < events.size(); counter++){
						if(events.get(counter).getEventID() == Integer.valueOf(necessary_info.get(0))){
							for(int counter2 = 0; counter2 < students.size(); counter2++){
								if(students.get(counter2).getEmail() == necessary_info.get(1)){
									events.get(counter).addStudent(students.get(counter2));
									students.get(counter2).attendEvent(events.get(counter));
								}
							}
						}
					}
					
					break;

				case("View Student"):
					System.out.println("Type the student ID/email.");
					String path2 = input1.nextLine();
					for(int counter2 = 0; counter2 < students.size(); counter2++){
						if(students.get(counter2).getEmail() == path2){
							students.get(counter2).printInfo();
						}
					}
					break;

				case("View Event"):
					System.out.println("Type the event ID number.");
					String path3 = input1.nextLine();
					for(int counter = 0; counter < events.size(); counter++){
						if(events.get(counter).getEventID() == Integer.valueOf(path3)){
							events.get(counter).printInfo();
						}
					}
					break;

				case("View All Students"):
					for(int counter = 0; counter < students.size(); counter++){
						students.get(counter).printInfo();
					}
					break;

				case("View All Events"):
					for(int counter = 0; counter < events.size(); counter++){
						events.get(counter).printInfo();
					}
					break;

				case("EXIT"):
					run = false;
					break;

				default:
					System.out.println("Invalid input!");
					break;

			}

		}

		input1.close();

	}

	public static Event Create_Event(){

		System.out.println("Type \"eventID,eventName,eventLocation,start time,eventCategory,pointValue\"");
		Scanner input = new Scanner(System.in);
		String info_string = input.nextLine();

		String [] info = info_string.split(",");
		System.out.println(Arrays.toString(info));

		Event event = new Event(Integer.valueOf(info[0]), info[1], info[2], info[3], info[4], Integer.valueOf(info[5]));

		return event;

	}

	public static Student Create_Student(){

		System.out.println("Type \"First Name,Last Name,Email,Graduation Date\"");
		Scanner input = new Scanner(System.in);
		String info_string = input.nextLine();

		String [] info = info_string.split(",");
		System.out.println(Arrays.toString(info));

		Student student = new Student(info[0], info[1], info[2], info[3]);
		System.out.println(info[0]);
		return student;
	}

	public static ArrayList<String> Attendance(){

		System.out.println("Type the event ID number.");
		Scanner input = new Scanner(System.in);
		String info_string1 = input.nextLine();
		System.out.println("Type the student ID/email.");
		String info_string2 = input.nextLine();

		ArrayList<String> returned_info = new ArrayList<String>();
		returned_info.add(info_string1);
		returned_info.add(info_string2);

		return returned_info;


	}

}
