package slideDeckChallenges;

public class ReverseAString {

	public static void main(String[] args) {

		String something = "John";
		String reversedRecursively = reverseRecursively(something);
		System.out.println("Reversed recursively: " + reversedRecursively);
		
		
	}

	public static String reverseRecursively(String str) {
		System.out.println("In with : " +str);
		
		// base case 
		
		if (str.length() <= 1) {
			System.out.println("Base case reached");
			return str;
		}
		System.out.println(str);
		return reverseRecursively(str.substring(1)) + str.charAt(0);
		
	}
	
}
