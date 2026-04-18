package prg3a;

	import java.util.*;

	public class StringOperations {
	public static void main(String[] args) {

	// 1. String Creation and Basic Operations
	String s1 = "Hello";
	String s2 = new String("World");
	System.out.println("String1: " + s1);
	System.out.println("String2: " + s2);

	// 2. Length and Character Access
	System.out.println("\nLength of s1: " + s1.length());
	System.out.println("Character at index 1: " + s1.charAt(1));

	// 3. String Comparison
	String s3 = "hello";
	System.out.println("\nEquals: " + s1.equals(s3));
	System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

	// 4. String Searching
	String text = "Java Programming";
	System.out.println("\nIndex of 'Pro': " + text.indexOf("Pro"));
	System.out.println("Contains 'Java': " + text.contains("Java"));

	// 5. Substring Operations
	System.out.println("\nSubstring (0-4): " + text.substring(0,4));

	// 6. String Modification
	System.out.println("\nReplace: " + text.replace("Java","Python"));
	System.out.println("Uppercase: " + text.toUpperCase());
	System.out.println("Lowercase: " + text.toLowerCase());

	// 7. Whitespace Handling
	String space = "   Hello Java   ";
	System.out.println("\nBefore Trim: '" + space + "'");
	System.out.println("After Trim: '" + space.trim() + "'");

	// 8. String Concatenation
	String concat = s1 + " " + s2;
	System.out.println("\nConcatenation: " + concat);

	// 9. String Splitting
	String data = "Apple,Banana,Orange";
	String arr[] = data.split(",");
	System.out.println("\nSplit Result:");
	for(String x : arr)
	System.out.println(x);

	// 10. StringBuilder Demo
	StringBuilder sb = new StringBuilder("Java");
	sb.append(" Programming");
	sb.insert(5,"Language ");
	sb.replace(0,4,"Advanced");
	System.out.println("\nStringBuilder: " + sb);

	// 11. String Formatting
	String name = "Akshata";
	int marks = 95;
	String result = String.format("Name: %s, Marks: %d", name, marks);
	System.out.println("\nFormatted String: " + result);

	// 12. Email Validation
	String email = "example@gmail.com";
	if(email.contains("@") && email.endsWith(".com") && !email.startsWith("@"))
	System.out.println("\nValid Email");
	else
	System.out.println("\nInvalid Email");

	}
	}	