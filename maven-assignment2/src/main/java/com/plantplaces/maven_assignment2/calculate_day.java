package com.plantplaces.maven_assignment2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class calculate_day extends read implements Runnable {
	
	String data;
	String[] lines;

	
	
	calculate_day (String data,String [] lines) {
	       this.data=data;
	       this.lines=lines;
	
	    }
	
	 public void run(){
		 
				
		 lines = data.split(System.getProperty("line.separator"));
		 
		 String dateBeforeString="null";
		 String dateAfterString="null";
		 for (int i=0;i<lines.length;i++){
				
		        if(getLine(i).contains("25/5/2019")){
		        	dateBeforeString="2019-05-25";	
		        }
		        
		        if(getLine(i).contains("20/6/2019")){
		        	dateAfterString ="2019-06-20";	
			    }
	    }
		 
		 	LocalDate dateBefore = LocalDate.parse(dateBeforeString);
			LocalDate dateAfter = LocalDate.parse(dateAfterString);
				
			long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

			System.out.println("");
			try{
			System.out.println("Thread 2- "+noOfDaysBetween+ " days\n");
			Thread.sleep(2000);}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("");
	 }
	 
	  String getLine(int i) {
		    return lines[i];
		}
	  
}
	 

	  

