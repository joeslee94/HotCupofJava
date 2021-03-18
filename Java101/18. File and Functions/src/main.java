import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class main {

	public static void main(String[] args) 
	{
		// file = abstract representation of file and directory path names.
		//methods with files
		/*
		File file = new File("New Text Document.txt");
		
		if(file.exists())
		{
			System.out.println("The file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else
		{
			System.out.println("The file does not exist");
		}
		*/
		
		//file writer
		/*
		try
		{
			
			FileWriter writer = new FileWriter("New Text Document.txt");
			writer.write("My first line written in Java to a txt.\n");
			writer.write("My second line written in Java to a txt.\n");
			writer.write("Lit line.\n");
			writer.write("Not sure how this is useful.\n");
			writer.append("Maybe way back in the day.\n");
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
			
		}
		*/
		
		//file reader reads contents of a file as a stream of characters
		
		try 
		{
			FileReader reader = new FileReader("New Text Document.txt");
			int data = reader.read();
			while(data!=-1)
			{
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();	
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
