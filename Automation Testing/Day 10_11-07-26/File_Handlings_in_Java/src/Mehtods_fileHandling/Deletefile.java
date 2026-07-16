package Mehtods_fileHandling;

import java.io.File;

public class Deletefile{

    public static void main(String[] args) {

        try {
            File myObj = new File("C:\\Users\\Abhinandan Prasad\\OneDrive\\Pictures.txt");

            if (myObj.delete()) {
                System.out.println("deleted the file " + myObj.getName());
                
            } else {
                System.out.println("failed to delete");
            }

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}