package Task53AzureAssignment;


public class IncrementDecrementOperators {

	public static void main(String[] args) {

		int totalVisitors = 250;

		System.out.println("Morning Visitors : " + totalVisitors);

		totalVisitors++;

		System.out.println("After One New Visitor : " + totalVisitors);

		totalVisitors++;

		System.out.println("Another Visitor Entered : " + totalVisitors);

		totalVisitors--;

		System.out.println("One Visitor Left : " + totalVisitors);

	}
}