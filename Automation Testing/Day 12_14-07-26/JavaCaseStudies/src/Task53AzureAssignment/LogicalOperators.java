package Task53AzureAssignment;


public class LogicalOperators {

	public static void main(String[] args) {

		boolean usernameCorrect = true;
		boolean passwordCorrect = true;
		boolean otpVerified = false;

		System.out.println("Username Correct : " + usernameCorrect);
		System.out.println("Password Correct : " + passwordCorrect);
		System.out.println("OTP Verified : " + otpVerified);

		System.out.println("Login Status : " + (usernameCorrect && passwordCorrect));

		System.out.println("OTP Login : " + (passwordCorrect && otpVerified));

		System.out.println("At Least One Correct : "
				+ (usernameCorrect || otpVerified));

		System.out.println("OTP Not Verified : " + (!otpVerified));

	}
}
