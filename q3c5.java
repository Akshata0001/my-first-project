/*Write a Java Program for Counting the number of words in a string using user defined function countWords()
*/


package prg3c;

public class q3c5 {
	
		public static int countWords(String str) {
		if(str == null || str.trim().isEmpty())
		return 0;

		String words[] = str.trim().split("\\s+");
		return words.length;
		}

		public static void main(String[] args) {
		String s = "Java is a powerful programming language";
		System.out.println("Word Count: " + countWords(s));
		}
		}
