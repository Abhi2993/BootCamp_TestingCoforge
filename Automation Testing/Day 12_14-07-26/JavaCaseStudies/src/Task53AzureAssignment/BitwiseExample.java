package Task53AzureAssignment;

public class BitwiseExample {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("AND = " + (a & b));
        System.out.println("OR = " + (a | b));
        System.out.println("XOR = " + (a ^ b));
        System.out.println("Complement of a = " + (~a));
        System.out.println("Left Shift = " + (a << 1));
        System.out.println("Right Shift = " + (a >> 1));
    }
}