package sba2;
//Write a program Implement the filereader until the file ending character is “-1” and print all the data of the file.

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ques4 {
public static void main(String[] args) {
		
		
		try{
			FileReader fr=new FileReader("D:example2.txt");
		
			int i;
			while((i=fr.read())!=-1)
			{
		
			System.out.print((char)i);
		}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
