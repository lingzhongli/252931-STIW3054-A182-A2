package com.plantplaces.maven_assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;




import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class read {
	static String[] lines;
	static String[] lines2;
	
	 public static void main(String[] args)throws IOException {
		 
		File file=new File("C:\\Users\\user\\Downloads\\A182 Draft Stud.pdf");
		FileInputStream fis= new FileInputStream(file);
		
		PDFParser parser = new PDFParser(fis);
		
		parser.parse();
		
		COSDocument cosDoc=parser.getDocument();
		
		PDDocument pdDoc = new PDDocument(cosDoc);
		
		PDFTextStripper strip = new PDFTextStripper();
		
		String data = strip.getText(pdDoc);
		
		strip.setStartPage(18); 
		strip.setEndPage(20);
		
		String result = strip.getText(pdDoc);
		
		lines = data.split(System.getProperty("line.separator"));
		
		
		
		Thread t1= new Thread(new total_couse(data, lines));
        t1.start();
		
		
		Thread t2= new Thread(new calculate_day(data, lines));
        t2.start();
		
		
		Thread t4= new Thread(new calculate_course(result, lines, lines2));
        t4.start();
        try {
    		t4.join();
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
		
		
		Thread t3= new Thread(new list(result, lines, lines2));
        t3.start();
		
		Thread t5= new Thread(new display(data, lines));
        t5.start();
		

			
		

}
	 



	 
}
