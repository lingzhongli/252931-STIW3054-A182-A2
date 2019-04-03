package com.plantplaces.maven_assignment2;


public class display extends read implements Runnable {
	
	String data;
	String[] lines;
	
	display(String data, String [] lines) {
	       this.data=data;
	       this.lines=lines;
	    }
	
	 public void run(){
		 
		 lines = data.split(System.getProperty("line.separator"));
		try{	
		 System.out.println("Thread 5- "+lines[getLineNumberWithFilter("STIW3054")]+"\n");
		 Thread.sleep(2000);}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		    
		    }
	 
	  int getLineNumberWithFilter(String filter) {
		    int n = 0;
		    for(String line : lines) {
		        if(line.indexOf(filter) != -1) {
		            return n;
		        }
		        n++;
		    }
		    return -1;
		}
	  
}

