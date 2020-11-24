package Models;

import Models.Course;

import java.util.ArrayList;

public class Student {

	private String studentID;
	private String name;
	private String matricNumber;
	private String gender;
	private String nationality;
	private String password;
	private ArrayList<Course> courses;

	/**
	 * Setter method for Student for the following params
	 * @param name set the student name as name
	 * @param matricNumber set the student matric number as matricNumber
	 * @param gender set the student gender as gender
	 * @param nationality set the student nationality as nationality
	 * @param password set the student password number as password
	 */
	public Student( String name, String matricNumber, String gender, String nationality, String password) {
		this.studentID = matricNumber;
	    this.name = name;
		this.matricNumber = matricNumber;
		this.gender = gender;
		this.nationality = nationality;
		this.password = password;
		courses = new ArrayList<Course>();
	}

	/**
	 * Getter method for Student ID
	 * @return studentID
	 */
	public String getStudentID() {
		return studentID;
	}

	/**
	 * Getter method for Student name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter method for Matric Number
	 * @return matricnumber
	 */
	public String getMatricNumber() {
		return matricNumber;
	}

	/**
	 * Getter method for Student Gender
	 * @return Gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Getter method for Student Nationality
	 * @return nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * Get Courses Method
	 * @return Arraylist of Courses
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/**
	 * Gets Password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Adding course c
	 * @param c is the course that needs to be added
	 */
	public void addCourse(Course c)
	{
		courses.add(c);
	}

	/**
	 * Display all the courses registered for each student
	 */
	public void displayAllCourses() 
	{
		if(courses.size() == 0) 
		{
			System.out.println("No course registered for this student");
		}
		else 
		{
			System.out.println("Courses information");
			for(int i =0 ;i < courses.size();i++)
			{
				System.out.println(courses.get(i).toString());
			}
		}
		
	}

	/**
	 * Get the Course Count or size
	 * @return the number of vacancy in the course
	 */
	public int getCourseCount() 
	{
		return courses.size();
	}

	/**
	 * Dropping Course Function
	 * @param courseCode current course code used to remove the current course
	 */
	public void dropCourse(String courseCode)
	{
		for(int i =0; i<courses.size();i++)
		{
			if(courses.get(i).getCourseCode() == courseCode) 
			{
				courses.remove(i);
			}
		}
	}

	/**
	 * Check coursecode if it is equals to a course code it returns true otherwise false
	 * @param courseCode needed for checking the course code
	 * @return boolean
	 */
	public boolean checkCourseCode(String courseCode)
	{
		for(int i =0; i<courses.size();i++)
		{
			if(courses.get(i).getCourseCode() == courseCode) 
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Allowing the change of the index number from the current to the new index for course
	 * @param indexNumber current index for course
	 * @param newIndexNumber new index for same course
	 */
	public void changeIndex(int indexNumber, int newIndexNumber) 
	{
		for(int i =0; i<courses.size();i++)
		{
			if(courses.get(i).getIndexNumber() == indexNumber) 
			{
				courses.get(i).changeIndexNumber(newIndexNumber);
			}
		}
	}

	/**
	 * Checks index number if it is equals to a index number it returns true otherwise false
	 * @param indexNumber current index number for the course
	 * @return boolean
	 */
	public boolean checkCourseIndex(int indexNumber)
	{
		for(int i =0; i<courses.size();i++)
		{
			if(courses.get(i).getIndexNumber() == indexNumber) 
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Override method converts the Original toString method to one which prints out the following string
	 * @return printed out string below
	 */
	@Override
	public String toString() {
		return "StudentID: " + studentID + "\nName: " + name + "\nMatric Number: " + matricNumber + "\nGender: "
				+ gender + "\nNationality: " + nationality ;
	}
	
	
	
	
}
