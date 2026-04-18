package prg3c;

public class q3c3 {
	
		public static boolean isNumeric(String str) {
		if(str == null || str.isEmpty())
		return false;

		for(int i = 0; i < str.length(); i++) {
		if(!Character.isDigit(str.charAt(i)))
		return false;
		}
		return true;
		}

		public static void main(String[] args) {
		String s = "12345";
		System.out.println("Is Numeric: " + isNumeric(s));
		}
		}

