
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class TestingJFrame extends JFrame {
	
	public TestingJFrame() {
		getContentPane().setBackground(Color.RED);
		setTitle("Input Dialog in Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(2000, 1000);
		getContentPane().setLayout(null);

    }

    private void closeIt(){

        this.getContentPane().setVisible(false);
        this.dispose();

    }
	public static void main(String[] args)
	{
		//Add input
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Event> events = new ArrayList<Event>();
		
		boolean run = true;
		Scanner input1 = new Scanner(System.in);
		while(run){
			String a = "hi";
			String path;
			TestingJFrame frame = new TestingJFrame();
			path = JOptionPane.showInputDialog(frame,"Type \"Create Event\", \"Create Student\", \"Mark Attendance\", \"View Event\", \"View Student\", \"View All Students\", \"View All Events\", or \"EXIT\" to end.");
			
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
					
					String path2 = JOptionPane.showInputDialog("Type the student ID/email.");
					
					for(int counter2 = 0; counter2 < students.size(); counter2++){
						if(students.get(counter2).getEmail() == path2){
							students.get(counter2).printInfo();
						}
					}
					break;

				case("View Event"):
					
					String path3 = JOptionPane.showInputDialog("Type the event ID number.");
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

		String info_string = JOptionPane.showInputDialog("Type \"eventID,eventName,eventLocation,start time,eventCategory,pointValue\"");
		
		String [] info = info_string.split(",");
		//System.out.println(Arrays.toString(info));
		String place1 = (Arrays.toString(info));
		place1 = JOptionPane.showInputDialog("Answer",place1);
		
		Event event = new Event(Integer.valueOf(info[0]), info[1], info[2], info[3], info[4], Integer.valueOf(info[5]));

		return event;

	}

	public static Student Create_Student(){

		
		
		String info_string = JOptionPane.showInputDialog("First Name,Last Name,Email,Graduation Date\"");

		String [] info = info_string.split(",");
		
		String place2 = (Arrays.toString(info));
		place2 = JOptionPane.showInputDialog("Answer",place2);
		
		Student student = new Student(info[0], info[1], info[2], info[3]);
		
		String new1 = info[0];
		new1 = JOptionPane.showInputDialog("Answer",new1);
		
		return student;
	}

	public static ArrayList<String> Attendance(){

		String info_string1 = JOptionPane.showInputDialog("Type the event ID number.");
		String info_string2 = JOptionPane.showInputDialog("Type the student ID/email.");
		
		ArrayList<String> returned_info = new ArrayList<String>();
		returned_info.add(info_string1);
		returned_info.add(info_string2);

		return returned_info;


	}

}