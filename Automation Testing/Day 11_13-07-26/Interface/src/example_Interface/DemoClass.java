package example_Interface;


interface FirstInterface {
    public void myMethod();   
}

interface SecondInterface {
    public void myOtherMethod();   
}

// DemoClass implements FirstInterface and SecondInterface
class DemoClasss implements FirstInterface, SecondInterface {

    public void myMethod() {
        System.out.println("Enter Some text...");
    }

    public void myOtherMethod() {
        System.out.println("Enter Some other text...");
    }
}

public class DemoClass {
    public static void main(String[] args) {

        DemoClasss myObj = new DemoClasss();

        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
