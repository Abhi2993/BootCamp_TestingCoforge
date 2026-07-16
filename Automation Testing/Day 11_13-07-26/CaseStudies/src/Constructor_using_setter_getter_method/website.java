//constructor using instance variable 

package Constructor_using_setter_getter_method;



public class website {

    
    String webName;
    int webAge;

    // Constructor
    website(String name, int age) {
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String args[]) {

        website obj1 = new website("Abhinandan Prasad", 23);
        website obj2 = new website("https://www.google.com/", 18);

        // Accessing object data through reference variables
        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge);
    }
    
    
}
