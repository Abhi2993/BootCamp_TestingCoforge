package ScannerDemo;
import java.util.*;
public class next {
 
	 public static void main (String []args) {
		 
		 Scanner input = new Scanner (System.in);
		 System.out.println("enter your name ");
		 
		 
		 String value = input.next();
		 System.out.println("text Entered:" + value);
		 
		 input.close();
		 }
}
