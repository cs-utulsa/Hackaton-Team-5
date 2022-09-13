import java.util.ArrayList;
/**
 * Student Class
 * 
 * This class should cover tracking student data. The date we want to capture includes first name, last name, 
 * TU email, graduation date (month/year), total points and what events they attended. Will use TU email for student�s ID.
 * 
 * Hackaton Group 5
 * 
 * Last Updated: 9/11/22
 */
public class Student {
	private String firstName;
	private String lastName;
	private	String email;
	private String gradDate;
	private int totalPoints;
	private ArrayList<Event> events;
	
	public Student(String firstName, String lastName, String email, String gradDate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gradDate = gradDate;
		totalPoints = 0;
		events = new ArrayList<Event>();
	}
	public Student(String firstName, String lastName, String email, String gradDate, int totalPoints)
	{
		firstName = this.firstName;
		lastName = this.lastName;
		email = this.email;
		gradDate = this.gradDate;
		totalPoints = this.totalPoints;
		events = new ArrayList<Event>();
	}
	
	
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}	
	
	public String getGradDate() 
	{
		return gradDate;
	}
	public void setGradDate(String gradeDate) 
	{
		this.gradDate = gradDate;
	}
	
	public int getTotalPoints() 
	{
		return totalPoints;
	}			
	
	//Adds event to student's events.
	//Add student to event's attendance
	//Updates students points
	public void attendEvent(Event event){
		events.add(event);
		event.addStudent(this);
		totalPoints += event.getPointValue();
	}
	
	//Prints student's info and events attended
	public void printInfo(){
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Email: "+email);
		System.out.println("Graduates: "+gradDate);
		System.out.println("Total Points: "+totalPoints);
		
		System.out.println("\nEvents Attended: ");
		for(int i = 0; i < events.size(); i++){
			System.out.println(events.get(i).getName());
		}
	}

}
