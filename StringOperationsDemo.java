/* Develop a java program for performing various string operations with different string handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()

*/



package prg2a;


	import java.util.*;

	public class StringOperationsDemo {
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("\nEquals: " + str1.equals(str3));
	        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        String sentence = "Java Programming Language";
	        System.out.println("\nIndex of 'Program': " + sentence.indexOf("Program"));
	        System.out.println("Contains 'Java': " + sentence.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("\nSubstring (0 to 4): " + sentence.substring(0, 4));

	        // 6. String Modification
	        String modified = sentence.replace("Java", "Python");
	        System.out.println("\nAfter replace: " + modified);
	        System.out.println("Uppercase: " + sentence.toUpperCase());
	        System.out.println("Lowercase: " + sentence.toLowerCase());

	        // 7. Whitespace Handling
	        String spaced = "   Hello Java   ";
	        System.out.println("\nBefore trim: '" + spaced + "'");
	        System.out.println("After trim: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String concat = str1 + " " + str2;
	        System.out.println("\nConcatenation: " + concat);

	        // 9. String Splitting
	        String fruits = "Apple,Banana,Orange";
	        String[] arr = fruits.split(",");
	        System.out.println("\nSplit result:");
	        for (String f : arr) {
	            System.out.println(f);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(5, "Language ");
	        sb.replace(0, 4, "Advanced");
	        System.out.println("\nStringBuilder Result: " + sb);

	        // 11. String Formatting
	        String name = "Akshata";
	        int marks = 90;
	        String formatted = String.format("Name: %s, Marks: %d", name, marks);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "example@gmail.com";
	        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@")) {
	            System.out.println("\nValid Email: " + email);
	        } else {
	            System.out.println("\nInvalid Email: " + email);
	        }
	    }
	}

