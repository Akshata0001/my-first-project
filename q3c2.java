/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
*/


package prg3c;

public class q3c2 {
	
		public static String truncate(String str, int length) {
		if(str.length() <= length)
		return str;
		else
		return str.substring(0, length) + "...";
		}

		public static void main(String[] args) {
		String s = "Java Programming Language";
		System.out.println("Truncated: " + truncate(s, 10));
		}
		}

