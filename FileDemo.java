import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo
{
    public static void main(String[] args) {
        // Create a new file
        File myFile = new File("cwh111file.txt");
        try
        {
                myFile.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("Unable to create this file");
        }

        // Write to the file
        try
        {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this Java course\nOkay now bye");
            fileWriter.close();
        }
        catch (IOException e)
        {
           System.out.println("IOException caught");
        }

        // Read from the file
        try
        {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException caught");
        }

        // Delete the file
        if (myFile.delete())
        {
            System.out.println("Deleted the file: " + myFile.getName());
        }
        else
        {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
