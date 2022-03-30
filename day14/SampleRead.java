package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleRead {

	public static void main(String[] args) {
		File file1=new File("D:SampleOutputWriter.txt");
		int len=(int) file1.length();
		try(FileReader fr=new FileReader(file1))
		{
			char[] x=new char[len];
			fr.read(x,0,7);
			String filecontent=new String(x);
			System.out.println(filecontent);
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
