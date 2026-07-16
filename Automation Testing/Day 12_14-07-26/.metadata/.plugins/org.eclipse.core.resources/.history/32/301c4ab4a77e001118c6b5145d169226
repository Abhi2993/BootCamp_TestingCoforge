package exceptionhandlingdemo;


import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling_03 {

    int x, y;

    public void accept() throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two values");

        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void display() {

        int result = x + y;

        System.out.println("Addition = " + result);
    }

    public static void main(String ar[]) {

    	ExceptionHandling_03 ce = new ExceptionHandling_03();

        try {

            ce.accept();

        } catch (IOException ie) {

            System.out.println(ie);

        }

        ce.display();
    }
}