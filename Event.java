/**
 * Event Class
 * 
 * This class should cover tracking and creating events. 
 * Needs to hold the event’s ID (attendance code, 4 digits), location, timestamp and point value. 
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
	private String[] students;
	
	public Event(int eventID, String name, String location, String timeStamp, String category, int pointValue)
	{
		eventID = this.eventID;
		name = this.name;
		location = this.location;
		timeStamp = this.timeStamp;
		category = this.category;
		pointValue = this.pointValue;
	}
	
	//Add rest of methods
	
	//Add getters and setters

}
