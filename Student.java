/**
 * Student Class
 * 
 * This class should cover tracking student data. The date we want to capture includes first name, last name, 
 * TU email, graduation date (month/year), total points and what events they attended. Will use TU email for student’s ID.
 * 
 * Hackaton Group 5
 * 
 * Last Updated: 9/10/22
 */
public class Student {
	private String firstName;
	private String lastName;
	private	String email;
	private String gradDate;
	private int totalPoints;
	private int[][] events;
	
	public Student(String firstName, String lastName, String email, String gradDate)
	{
		firstName = this.firstName;
		lastName = this.lastName;
		email = this.email;
		gradDate = this.gradDate;
	}
	public Student(String firstName, String lastName, String email, String gradDate, int totalPoints)
	{
		firstName = this.firstName;
		lastName = this.lastName;
		email = this.email;
		gradDate = this.gradDate;
		totalPoints = this.totalPoints;
	}
	
	//Add reaming methods
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	//Add Test of getters and setters

}
