package objectsExample;

public class LocalClassExample {
	static String regularExpression = "[^0-9]";
	
	public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
		System.out.println("Test phone numbers");
	}

	public static void main(String[] args) {
		validatePhoneNumber("0728 555 120","0725 1 2");

	}

}
