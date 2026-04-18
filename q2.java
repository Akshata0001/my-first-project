package prg3b1;

public class q2 {
	
		public static int countOccurrences(String mainStr, String subStr) {
		int count = 0;
		int index = 0;

		while((index = mainStr.indexOf(subStr, index)) != -1) {
		count++;
		index += subStr.length();
		}
		return count;
		}

		public static void main(String[] args) {
		String mainStr = "Java is easy. Java is powerful. Java is popular.";
		String subStr = "Java";

		System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
		}
		}

