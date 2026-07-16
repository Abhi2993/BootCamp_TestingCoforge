package exceptionhandlingdemo;

public class ThrowsDeclearation {
	
	    int x = 143;

	    public void m1() {
	        System.out.println("Value of x is: " + x);
	    }

	    public static void main(String[] args) throws InterruptedException {

	       ThrowsDeclearation obj =
	                new ThrowsDeclearation();

	        obj.m1();

	        Thread.sleep(1000);   // Pause for 1 second

	        System.out.println("Program resumed after 1 second.");
	    }
	}