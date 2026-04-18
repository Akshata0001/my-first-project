package prg3b1;

public class q1 {
	
		public static boolean isNullOrEmpty(String str) {
		return (str == null || str.trim().isEmpty());
		}

		public static void main(String[] args) {
		String s = "   ";
		if(isNullOrEmpty(s))
		System.out.println("String is null or empty");
		else
		System.out.println("String is not empty");
		}
		}

