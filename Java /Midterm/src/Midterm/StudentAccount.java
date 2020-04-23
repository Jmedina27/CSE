package Midterm;

public class StudentAccount {
	
	private String name;
	private int homeWorkPoints;
	private int examPoints;
	private static double finalPoints;
	private String courseName;
	private static int year = 0;
	private static String teachersName;
	private static int totalNumberStudents = 0;
	private static int totalHomeWorkPointsAllStudents = 0;
	private static int examPointsAllStudents = 0;
	private static double finalPointsAllStudents;
	
	//constructor for Account that has a name, homework points, and exam points
	public StudentAccount(String name, int homeWorkPoints, int examPoints) {
		this.name = name;
		totalNumberStudents++;
		if (homeWorkPoints > 0 ) {
			this.homeWorkPoints = homeWorkPoints;
			totalHomeWorkPointsAllStudents += homeWorkPoints/totalNumberStudents;
		}
		if (examPoints > 0) {
			this.examPoints = examPoints;
			examPointsAllStudents += examPoints/ totalNumberStudents;
		}
		finalPoints = (homeWorkPoints *.3) + (examPoints * .7);
		finalPointsAllStudents = (totalHomeWorkPointsAllStudents * .3) + (examPointsAllStudents * .7);
	}
	
	//constructor for Account that has a name, homework points, no other information
	public StudentAccount(String name, int homeWorkPoints) {
		this(name, homeWorkPoints, 0);
	}

	//constructor for Account that has a name and no other information
	public StudentAccount(String name) {
		this(name,0,0);
	}
	
	//constuctor for Account that has no name
	public StudentAccount() {
		this("",0,0);
	}
	
	//set name of the course 
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	//set name of the teacher
	public void setTeacherName(String teacherName) {
		this.teachersName = teacherName;
	}
	
	//set Name of the student
	public void setName(String name) {
		this.name = name;
	}
	
	//set exam points, which has a maximum of 100 points
	public void setExamPoints(int examPoints) {
		if (examPoints > 0 && examPoints <= 100) {
			this.examPoints = examPoints;
		}
	}
	
	//set homework points, where the maximum is 100 points
	public void setHomeWorkPoints(int homeWorkPoints) {
		if (homeWorkPoints > 0 && homeWorkPoints <= 100 ) {
			this.homeWorkPoints = homeWorkPoints;
		}
	}
	
	
	
	//get name of the course
	public String getCourseName() {
		return courseName;
	}
	
	//get name of the teacher
	public static String getTeacherName() {
		return teachersName;
	}
	
	//set year of course
	public void setYear(int year) {
		this.year = year;
	}
	// get year of course
	public static int getYear() {
		return year;
	}
	
	//get name of the student
	public String getName() {
		return name;
	}
	
	//get exam total exam points
	public int getExamPoints() {
		return examPoints;
	}
	
	//get total homework points
	public int getHomeWorkPoints() {
		return homeWorkPoints;
	}
	
	//show name, homework points, exam points, and final points
	public String toString() {
		
		return String.format("Name: %10s%10s%,10d", getName(), "HomeWork", getHomeWorkPoints());
	}
	
	//get total number of students
	public static int getTotalNumberStudents() {
		return totalNumberStudents;
	}
	
	//get the total homework points of all the students
	public static int getAverageHomeWorkPointsAllStudents() {
		return totalHomeWorkPointsAllStudents; 
	}
	
	//get the total of all exam points of all the students
	public static int getAverageExamPointsAllStudents() {
		return examPointsAllStudents;
	}
	
	public static double getFinalPoints() {
		return finalPoints;
	}
	
	public static double getFinalPointsAllStudents() {
		return finalPointsAllStudents;
	}
	

}
