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
	private ArrayList<String> students;
	
	public Event(int eventID, String name, String location, String timeStamp, String category, int pointValue)
	{
		eventID = this.eventID;
		name = this.name;
		location = this.location;
		timeStamp = this.timeStamp;
		category = this.category;
		pointValue = this.pointValue;
		students = new ArrayList<String>();
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
	
	public void printStudents(){
		System.out.println(students.toString());
	}
	
	public void addStudent(String student){
		students.add(student);
	}
}
