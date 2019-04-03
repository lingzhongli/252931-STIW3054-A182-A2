package com.plantplaces.maven_assignment2;

public class total_couse extends read implements Runnable {
	
	String data;
	String[] lines;

	
	
	total_couse (String data,String [] lines) {
	       this.data=data;
	       this.lines=lines;

	    }
	
	 public void run(){
		 
		 
				
		 lines = data.split(System.getProperty("line.separator"));
		 int count=0;
	     int count2=0;
	     int total;
		 System.out.println("");
		 for (int i=0;i<lines.length;i++){
				
		        if(getLine(i).contains(".")){
				count++;}
		        
		        if(getLine(i).contains("BIL.")){
					count2++;}
		        
		        }
		 
		 		total=count-count2;

		        try{
		        System.out.println("Thread 1- "+ total+ " courses\n");
		        Thread.sleep(2000);}
		        catch (InterruptedException e) {
					e.printStackTrace();
				}
		    }
	 
	  String getLine(int i) {
		    return lines[i];
		}

}
