/***
* CSE292 - Fall 2018

* AirlineReservationSystemTest.java

* Purpose: Tests that the AirlineReservationSystem.java is done correctly 

*

* @author Jesus Medina

* @version 1.0 10/31/2018

*/


package HomeWork7_19;
import java.util.Scanner;

public class AirlineReservationSystemTest {
	static boolean running = true;
	   
	public static void main(String[] args) {
		 AirlineReservationSystem tickets = new AirlineReservationSystem();
		    Scanner scan = new Scanner(System.in);
		    while(running){
		        tickets.book();
		        System.out.println("Type 'Quit' to quit, else any key to continue.");
		        String quit = scan.next();
		        if (quit.equalsIgnoreCase("Quit"))
		            running = false;
		    }       
		
	}

}
