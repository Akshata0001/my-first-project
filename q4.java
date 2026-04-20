/* 
Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():
*/

package prg3b1;

public class q4 {
	
		public static boolean isPalindrome(String str) {
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String rev = "";

		for(int i = str.length() - 1; i >= 0; i--) {
		rev += str.charAt(i);
		}

		return str.equals(rev);
		}

		public static void main(String[] args) {
		String s = "Madam, I'm Adam";

		if(isPalindrome(s))
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");
		}
		}

