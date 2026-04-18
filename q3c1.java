package prg3c;

public class q3c1 {
	

		public static String capitalizeWords(String str) {
		String words[] = str.split(" ");
		String result = "";

		for(int i = 0; i < words.length; i++) {
		if(words[i].length() > 0) {
		result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ";
		}
		}
		return result.trim();
		}

		public static void main(String[] args) {
		String input = "java programming language";
		String output = capitalizeWords(input);

		System.out.println("Original String: " + input);
		System.out.println("Capitalized String: " + output);
		}
		}

