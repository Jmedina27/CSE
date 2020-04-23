import java.sql.* ;
import java.util.Scanner;

public class JDBCExample {
	
	 public static void main(String args[]) {
		 
		 try{  
			//step1 load the driver class 
 			Class.forName("oracle.jdbc.driver.OracleDriver") ;
 			//step2 create  the connection object    
 			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jmedina", "mj2852") ;
   
 			//step3 create the statement object
			 //String query = "select employee_id, first_name, last_name, email, phone_number, salary from hr.employees" ;
			Scanner input = new Scanner(System.in);

			System.out.print("Enter an employee id to look up: ");
			String employee_id = input.nextLine();

			//query to print out emp information belonging to empno user inputted
			String query = "select * from emp where empno = " + employee_id;
 			PreparedStatement pstmt_employees = con.prepareStatement(query) ;
 			//step4 execute query  
			ResultSet rs_employees = pstmt_employees.executeQuery() ;
 			while (rs_employees.next()){
 				
 				System.out.println("Employee Number:" + rs_employees.getString(1)) ;
 				System.out.println("Name: " + rs_employees.getString(3) + ", " + rs_employees.getString(2)) ;
				System.out.println("Salary: " + rs_employees.getString(6)) ;
				System.out.println("Email: " + rs_employees.getString(9) + "\n") ;
			 }

			//Propmts user to input email address to change in databse under empno specified earlier
			System.out.print("Enter email address to update for empno: ");
			String email = input.nextLine();
			//executes update command updating email to the empno user inputted
			query = String.format("update emp set email= '%s' where empno= %s", email, employee_id);
			pstmt_employees = con.prepareStatement(query);
			rs_employees = pstmt_employees.executeQuery();

			//executes query that print new information with updated email
			query = "select * from emp where empno = " + employee_id;
			pstmt_employees = con.prepareStatement(query);
			rs_employees = pstmt_employees.executeQuery();
			while (rs_employees.next()) {
				System.out.println("Employee ID: " + rs_employees.getString(1));
				System.out.println("Name: " + rs_employees.getString(3) + ", " + rs_employees.getString(2)) ;
				System.out.println("Email: " + rs_employees.getString(9) + "\n");
			}

			//executes query that prints out employee information from emp_proj tables specified in user input 
			query = "select * from emp_proj where empno = " + employee_id + " and projno= 20";
			pstmt_employees = con.prepareStatement(query);
			rs_employees = pstmt_employees.executeQuery();
			while (rs_employees.next()) {
				System.out.println("Employee ID: " + rs_employees.getString(1));
				System.out.println("Project Number: " + rs_employees.getString(2)) ;
				System.out.println("Hours Worked: " + rs_employees.getString(3) + "\n");
			}
			//Prompts user to enter hoursworked for empno
			String hours = input.nextLine();
			//executes update statement and changes hoursworked to what the user provided
			query = String.format("update emp_proj set hoursworked = '%s' where empno = %s and projno = 20", hours, employee_id);
			pstmt_employees = con.prepareStatement(query);
			rs_employees = pstmt_employees.executeQuery();
			//executes query to print all new updated information
			query = "select * from emp_proj where empno = " + employee_id + " and empno = 20";
			pstmt_employees = con.prepareStatement(query);
			rs_employees = pstmt_employees.executeQuery();
			while (rs_employees.next()) {
				System.out.println("Employee ID: " + rs_employees.getString(1));
				System.out.println("Project Number: " + rs_employees.getString(2)) ;
				System.out.println("Hours Worked: " + rs_employees.getString(3));
			}

			query = "select ep.empno, ep.projno, \n" + 
			"    round(hourly_rate * (epo.hourOt),2) as Overtime_Project_Cost, \n" + 
			"    round(hourly_rate * (ep.hoursworked),2) as Project_Cost \n" + 
			"        from emp_proj ep \n" + 
			"            left join hourly_rate r on ep.empno = r.emp_no \n" + 
			"            left join emp_proj_overtime epo on epo.empno = ep.empno and epo.projno = ep.projno \n";
			pstmt_employees = con.prepareStatement(query);
			rs_employees = pstmt_employees.executeQuery();
			while (rs_employees.next()) {
				System.out.println("Employee ID: " + rs_employees.getString(1));
				System.out.println("Regular Pay: " + rs_employees.getString(2));
				System.out.println("Overtime Pay: " + rs_employees.getString(3));
			}

		 } catch(Exception e){ System.out.println(e);}	
 
	 }

}
