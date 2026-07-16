package Task53AzureAssignment;

public class BankingApplication {
    public static void main(String[] args) {

        double balance = 25000;

        if (balance >= 10000) {
            System.out.println("Eligible for Personal Loan");
        } else {
            System.out.println("Not Eligible");
        }
    }
}