package Task53AzureAssignment;

public class LoginValidation {
    public static void main(String[] args) {

        boolean username = true;
        boolean password = true;

        if (username && password) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Login");
        }
    }
}