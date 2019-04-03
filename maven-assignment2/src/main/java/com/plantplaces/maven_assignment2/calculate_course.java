package com.plantplaces.maven_assignment2;

public class calculate_course extends read implements Runnable {
	
	String result;
	String[] lines;
	String[] lines2;
	
	
	calculate_course (String result,String [] lines, String [] lines2) {
	       this.result=result;
	       this.lines=lines;
	       this.lines2=lines2;
	    }
	
	 public void run(){
		 
		 
				
		 lines2 = result.split(System.getProperty("line.separator"));
		 int count=0;
		 System.out.println("");
		 for (int i=(lines.length-lines2.length);i<lines.length;i++){
				
		        if(getLine(i).contains("STIA")||getLine(i).contains("STID")||getLine(i).contains("STIJ")||getLine(i).contains("STIK")||getLine(i).contains("STIN")
		        		||getLine(i).contains("STIW")||getLine(i).contains("STQM")||getLine(i).contains("STQS")){
				count++;}
		        }
		        try{
		        System.out.println("Thread 4- "+ count+ " courses from SOC\n");
		        Thread.sleep(2000);}
		        catch (InterruptedException e) {
					e.printStackTrace();
				}
		    }
	 
	  String getLine(int i) {
		    return lines[i];
		}
	  
}
