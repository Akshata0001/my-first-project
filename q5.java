package prg3b1;

public class q5 {
	
		public static String removeWhitespace(String str) {
		return str.replaceAll("\\s", "");
		}

		public static void main(String[] args) {
		String s = "  Java   Programming   ";
		System.out.println("After removing spaces: " + removeWhitespace(s));
		}
		}

