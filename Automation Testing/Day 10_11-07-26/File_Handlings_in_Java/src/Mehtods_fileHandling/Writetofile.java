package Mehtods_fileHandling;




import java.io.FileWriter;
import java.io.IOException;

public class Writetofile {

    public static void main(String[] args) {

        try {

            
            FileWriter myWriter = new FileWriter("D:\\filess");

            myWriter.write("Welcome To Coforge Technologies! All the best for learning!");

            myWriter.close();

            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}