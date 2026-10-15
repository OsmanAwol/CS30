package SkillBuilders;

import java.io.File;
import java.util.Scanner;

public class ClassFile {

	public static void main(String[] args)
	{
		File textFile;
		String fileName;
		try (Scanner input = new Scanner(System.in)) {
			//obtain file name from user
			System.out.println("Enter file name:");
			
			fileName = input.next();
		}
			
		//creat a new file
		textFile = new File(fileName);
		
		//Determine if the file exists
		if(textFile.exists())
		{
			System.out.println("File exists.");		
		}
		else
		{
			System.out.println("File does not exist.");
		}
	}

}
