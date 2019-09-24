package Midterm;

import java.util.Scanner;

public class StudentAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		StudentAccount Student1 = new StudentAccount("Jesus Medina");
		StudentAccount Student2 = new StudentAccount("John Letterman");
		StudentAccount Student3 = new StudentAccount("Richard Musk", 70);
		StudentAccount Student4 = new StudentAccount("Robert Lynch", 40, 50);
		StudentAccount Student5 = new StudentAccount("Frank Miller", 80, 90);
		StudentAccount Student6 = new StudentAccount("Roger Franklin", 50, 70);


		StudentAccount[] Class = {Student1, Student2, Student3, Student4, Student5, Student6};
		
		Student1.setCourseName("CSE292 Object Oriented Programming");
		Student1.setYear(2018);
		Student1.setTeacherName("Dr. John Dung Vu");
		
		
		for (int count = 0; count < Class.length; count++) {
			System.out.println(Class[count].toString());
		}
		System.out.printf("Course Name: %5s%n", Student1.getCourseName());
		System.out.printf("Year: %5%n", Student1.getYear());
		System.out.printf("Lecturer: %5s%n", Student1.getTeacherName());
		System.out.printf("Total Students: %5d%n", Student1.getTotalNumberStudents());
		System.out.printf("Total HomeWork Points: %5d%n", Student1.getAverageHomeWorkPointsAllStudents());
		System.out.printf("Average Exam points: %5d%n", Student1.getAverageExamPointsAllStudents());
		System.out.printf("Average Final Points : %5d%n", Student1.getFinalPointsAllStudents());
	}

}
