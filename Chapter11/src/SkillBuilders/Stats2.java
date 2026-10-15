package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class Stats2 

{
	public static void main(String[] args) 
	
	{
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		
		Scanner input = new Scanner(System.in);
		String fileName;
		
		int numStu;
		int numScore = 0;
		 
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScore = 0;
		
		//Write data to file
		
		System.out.println("Enter the file name");
		fileName = input.next();
		
		System.out.println("How many students?");
		numStu = input.nextInt();
		
		String stuName;
		Object score;
		try
		{
			 
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for(int i=0; i < numStu; i++)
			{
				 System.out.println("Enter student name: ");
				 stuName = input.next();
				 
				 System.out.println("Enter text score");
				 score = input.next();
				 
				 writeFile.write(stuName);
				 writeFile.newLine();
				 writeFile.write((int) score);
				 writeFile.newLine();
				 
			}//ends for loop
			
			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
			
			
			
		}
		
		catch (IOException e)
		{
			System.out.println("Problem reading file");
			System.err.println("FileNotFoundException:  " + e.getMessage());
			
		}
		try
		{
			dataFile = new File(fileName);
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((stuName = readFile.readLine()) !=null) 
				
			{
					score = readFile.readLine();
					System.out.println(stuName + " " + score);
					
					numScore = numScore + 1;
					
					scoreValue = Double.parseDouble((String) score);
					
					totalScore = totalScore + scoreValue;
					
					totalScore =  totalScore + scoreValue;
					
					if(scoreValue < lowScore)
					{
							lowScore = scoreValue;
					}
					if(scoreValue > highScore)
					{
							highScore = scoreValue;
					}
					
				}//ends while loop
			
			
			
		}
		catch (IOException e)
		{
			System.out.println("Problem reading file");
			System.err.println("FileNotFoundException:  " + e.getMessage());
			
		}
		
		
	
	}

}
