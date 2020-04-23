/***
* CSE292 - Fall 2018

* AirlineReservationSystem.java

* Purpose: Assigns seats on each flight of the airline's only plane from economy to first class

*

* @author Jesus Medina

* @version 1.0 10/31/2018

*/

package HomeWork7_19;
import java.util.Scanner;

public class AirlineReservationSystem {
	
	
	boolean[] firstClass = new boolean[5];
	boolean[] economyClass = new boolean[5];
	int numFirstClass = 0;
	int numEconomyClass = 0;
	Scanner scan = new Scanner(System.in);

	public void book(){
	    System.out.println("Press 1 for economy and 2 for first class.");
	    int choice = scan.nextInt();
	    if (choice == 1)
	        economyClass();
	    else if (choice == 2)
	        firstClass();
	    else
	        System.out.println("Invalid selection");                 
	}

	private void firstClass(){
	    if (numFirstClass < 5){            
	        for (int i = 0; i < firstClass.length; i++){                
	            if(!firstClass[i]){
	                firstClass[i] = true;
	                System.out.println("First Class. Seat number: "+(i+1)); 
	                numFirstClass++;
	                break;
	            }
	        }
	    }        
	    else if (numEconomyClass < 5){
	        System.out.println("No more seats in 1st class. Press 1 if you would like to book a seat in economy class.");
	        int choice = scan.nextInt();            
	        if (choice == 1)
	           economyClass();
	        else 
	            System.out.println("The next flight leaves in 3 hours.");
	    }        
	    else
	        System.out.println("All seats are booked, the next flight leaves in 3 hours.");        
	}

	private void economyClass(){
	    if (numEconomyClass < 5){            
	        for (int i = 0; i < economyClass.length; i++){                
	            if(!economyClass[i]){
	                economyClass[i] = true;
	                System.out.println("Economy Class. Seat number: "+(i+6)); 
	                numEconomyClass++;
	                break;
	            }
	        }
	    }        
	    else if (numFirstClass < 5){
	        System.out.println("No more seats in economy. Press 1 if you would like to book a seat in first class.");
	        int choice = scan.nextInt();            
	        if (choice == 1)
	           firstClass();
	        else 
	            System.out.println("The next flight leaves in 3 hours.");
	    }        
	    else
	        System.out.println("All seats are booked, the next flight leaves in 3 hours.");        
	}    
	

}
