package day14assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Write a program to get the information about the file.
public class Ques3 {

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
