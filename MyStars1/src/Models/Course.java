package Models;

public class Course {
	private String courseCode;
	private  String school;
	private int indexNumber;
	private int vacancy;

	/**
	 * Course getter Class, Houses all the getter functions of the class Course
	 * @param courseCode The coursecode in courses.txt
	 * @param school The school of which the student is from
	 * @param indexNumber the indexnumber of the course selected
	 * @param vacancy the no of vacancies of the courses
	 */
	public Course(String courseCode, String school, int indexNumber, int vacancy) {
		this.courseCode = courseCode;
		this.school = school;
		this.indexNumber = indexNumber;
		this.vacancy = vacancy;
	}

	/**
	 * Gets Course Code
	 * @return the course code
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * Gets School
	 * @return school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * Gets the index number
	 * @return index number
	 */
	public int getIndexNumber() {
		return indexNumber;
	}

	/**
	 * Gets the vacancy of each course
	 * @return vacancy
	 */
	public int getVacancy() {
		return vacancy;
	}

	/**
	 * Gets the new index number
	 * @param newIndexNumber param is the new index number for the course
	 */
	public void changeIndexNumber(int newIndexNumber)
	{
		this.indexNumber = newIndexNumber;
	}

	/**
	 * Override method converts the Original toString method to one which prints out the following string
	 * @return printed out string below
	 */
	@Override
	public String toString() {
		return "Models.Course Code: " + courseCode + "\nSchool: " + school + "\nIndex Number: " + indexNumber + "\nVacancy: "
				+ vacancy ;
	}

}
