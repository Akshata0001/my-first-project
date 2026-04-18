package prg3b1;

public class q3 {
	

		public static String reverseString(String str) {
		String rev = "";
		for(int i = str.length() - 1; i >= 0; i--) {
		rev = rev + str.charAt(i);
		}
		return rev;
		}

		public static void main(String[] args) {
		String input = "Java Programming";

		String result = reverseString(input);

		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + result);
		}
		}

