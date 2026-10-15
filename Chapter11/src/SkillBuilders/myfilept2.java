package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class myfilept2 {
	
		 private static Scanner input;

		 public static void main(String[] args) {
			 
		 File textFile = new File("C:\\Users\\49257012\\git\\CS30\\Chapter11\\src\\SkillBuilders\\cs314.txt");
		 String response;
		 input = new Scanner(System.in);
		 if (textFile.exists()) 
		 {
			 
		 System.out.println("File already exists.");
		 
		 } 
		 else 
				 {
				 
				 try 
				 {
				
					 textFile.createNewFile();
				
					 System.out.println("cs314.txt file has been created.");
				 } 
				 catch (IOException e)
				 {
				
					 System.out.println("File could not be created.");
					 
					 System.err.println("IOException: " + e.getMessage());
					 
					
				 }
				 
				 } 
		 //Delete file if user chooses
					System.out.println("Would you like to (k)eep of (D)elete");
					response = input.next();
					
					if(response.equalsIgnoreCase("D"))
					{
						//Delete the file now
						if(textFile.delete())
						{
							System.out.println("File is Deleted:");
						
						}	 
					}
					else
					{
						System.out.println("File has been kept");
					}
		 }
		

	

}
