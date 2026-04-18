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

