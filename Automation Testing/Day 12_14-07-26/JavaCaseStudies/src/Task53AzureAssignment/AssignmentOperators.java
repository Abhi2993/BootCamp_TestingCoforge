package Task53AzureAssignment;

public class AssignmentOperators {

	public static void main(String[] args) {

		int accountBalance = 10000;

		System.out.println("Initial Balance : " + accountBalance);

		accountBalance += 5000;
		System.out.println("After Salary Credit : " + accountBalance);

		accountBalance -= 2000;
		System.out.println("After Electricity Bill : " + accountBalance);

		accountBalance *= 2;
		System.out.println("Balance after Bonus : " + accountBalance);

		accountBalance /= 2;
		System.out.println("Current Balance : " + accountBalance);

		accountBalance %= 1000;
		System.out.println("Remaining Amount : " + accountBalance);

	}
}