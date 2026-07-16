package Task53AzureAssignment;



public class TernaryOperator {

	public static void main(String[] args) {

		int customerAge = 17;

		String ticketType = (customerAge >= 18)
				? "Adult Ticket"
				: "Child Ticket";

		double ticketPrice = (customerAge >= 18)
				? 300
				: 150;

		System.out.println("Customer Age : " + customerAge);
		System.out.println("Ticket Type : " + ticketType);
		System.out.println("Ticket Price : " + ticketPrice);

	}
}