package Task53AzureAssignment;

public class RelationalOperators {

	public static void main(String[] args) {

		int personAge = 20;
		int minimumAge = 18;

		System.out.println("Age = " + personAge);

		System.out.println("Equal : " + (personAge == minimumAge));
		System.out.println("Not Equal : " + (personAge != minimumAge));
		System.out.println("Greater Than : " + (personAge > minimumAge));
		System.out.println("Less Than : " + (personAge < minimumAge));
		System.out.println("Greater Than Equal : " + (personAge >= minimumAge));
		System.out.println("Less Than Equal : " + (personAge <= minimumAge));

	}
}