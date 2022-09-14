import java.util.ArrayList;
/**
 * Event Class
 * 
 * This class should cover tracking and creating events. 
 * Needs to hold the event�s ID (attendance code, 4 digits), location, timestamp and point value. 
 * 
 * Hackaton Group 5
 * 
 * Last Updated: 9/10/22
 */

public class Event {
	private int eventID;
	private String name;
	private String location;
	private String timeStamp;
	private String category;
	private int pointValue;
	private ArrayList<Student> students;
	
	public Event(int eventID, String name, String location, String timeStamp, String category, int pointValue)
	{
		this.eventID = eventID;
		this.name = name;
		this.location = location;
		this.timeStamp = timeStamp;
		this.category = category;
		this.pointValue = pointValue;
		students = new ArrayList<Student>();
	}
	
	public int getEventID(){
		return eventID;
	}
	public void setEventID(int eventID){
		this.eventID = eventID;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location = location;
	}

	public String getTimeStamp(){
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp){
		this.timeStamp = timeStamp;
	}
	
	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	
	public int getPointValue(){
		return pointValue;
	}
	public void setPointValue(int pointValue){
		this.pointValue = pointValue;
	}
	
	//adds student to attendance. Is called from Student
	public void addStudent(Student student){
		students.add(student);
	}
	
	//Prints event info and who attended
	public void printInfo(){
		System.out.println("Event ID: "+eventID);
		System.out.println("Event Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date & Time: "+timeStamp);
		System.out.println("Category: "+category);
		System.out.println("Point Value: "+pointValue);
		System.out.println("Students that attended:");
		for(int i=0; i<students.size(); i++){
			System.out.println(students.get(i).getFirstName()+" "+students.get(i).getLastName());
		}
		System.out.println();
	}
}
