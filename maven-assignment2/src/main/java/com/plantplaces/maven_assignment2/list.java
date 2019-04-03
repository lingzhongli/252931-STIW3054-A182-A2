package com.plantplaces.maven_assignment2;

public class list extends read implements Runnable {
	
	String result;
	String[] lines;
	String[] lines2;
	
	
	list (String result,String [] lines, String [] lines2) {
	       this.result=result;
	       this.lines=lines;
	       this.lines2=lines2;
	    }
	
	 public void run(){
		 
		 
				
		 lines2 = result.split(System.getProperty("line.separator"));
		 
		 for (int i=(lines.length-lines2.length);i<lines.length;i++){
				
		        if(getLine(i).contains("STIA")||getLine(i).contains("STID")||getLine(i).contains("STIJ")||getLine(i).contains("STIK")||getLine(i).contains("STIN")
		        		||getLine(i).contains("STIW")||getLine(i).contains("STQM")||getLine(i).contains("STQS")){
		        	try{
				System.out.println("Thread 3- "+ getLine(i)+"\n");
				Thread.sleep(2000);}
		        	catch (InterruptedException e) {
						e.printStackTrace();
					}
		        	}
		        }

		    }
	 
	  String getLine(int i) {
		    return lines[i];
		}
	  
}
