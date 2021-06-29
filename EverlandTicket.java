package ½Ç½À;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class EverlandTicket {
	

	public static void main(String[] args) {
		Ever_Input everProcess = new Ever_Input();
		Ever_Array arrayProcess = new Ever_Array();
		Ever_Check checkProcess = new Ever_Check();
		
	    while(true ) {
	    	arrayProcess.clearAll();
	    	do {
	    		everProcess.inputDate();	    	  	
	    		checkProcess.checkTicketPrice();			
	    	  	System.out.println(everProcess.ticket);
	    	  	System.out.println("¤Ñ");
	    	  	everProcess.inputID();	    	  	
	    	  	if (everProcess.socialNumber.equals("0")) {} 	
	    	  	checkProcess.checkTicketType(everProcess.birthMonth, everProcess.birthDay,
	    	  			everProcess.birthYear, everProcess.birthDate, everProcess.socialNumber);
	    	  	System.out.println("¤Ñ");					
	    	  	everProcess.inputCount();			
	    	  	if(everProcess.count == 0) {}    
	    	  	System.out.println("¤Ñ");					
	    	  	everProcess.inputAdvantage();	    	  	
	    	  	if(everProcess.benefit == 0) {}			    	  	
	    	  	checkProcess.checkBenefit();	    	  	
	    	  	everProcess.inputAddOrder();
	    	  	arrayProcess.addToArrayListAll(everProcess.age, everProcess.ticket, 
	    	  			everProcess.price, everProcess.count, everProcess.b);
	    	} while(everProcess.add == 1);		    	
	    	arrayProcess.printData(everProcess.age, everProcess.ticket, 
    	  			everProcess.price, everProcess.count, everProcess.b);			
	    	everProcess.myInput.close();
			break;			
		}		
	}	
}


