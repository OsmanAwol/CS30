package SkillBuilders;

import java.io.*;
import java.text.NumberFormat;

public class Statsp1 { 

	public static void main(String[] args) 
	
	
		{
		File dataFile = new File("../Chapter11/src/SkillBuilders/text1.txt");
		FileReader in;
		BufferedReader readfile;
		
		String stuName, score;
		
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScore = 0;

		int numScore = 0;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		try 
		{
			in = new FileReader(dataFile);
			readfile = new BufferedReader(in);
			
			while((stuName = readfile.readLine()) !=null) 
			
		{
				score = readfile.readLine();
				System.out.println(stuName + " " + score);
				
				numScores = numScores + 1;
				
				scoreValue = Double.parseDouble(score);
				
				totalScores = totalScores + scoreValue;
				
				totalScores = 

		}

		}

}
}