/*Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))

*/

package prg1c3;


	import java.util.LinkedList;

	public class InsertAtEnd {
	    public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<String> colors = new LinkedList<>();

	        // Add initial elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");

	        // Display original list
	        System.out.println("Original List: " + colors);

	        // Insert element at the end using offerLast()
	        colors.offerLast("Pink");

	        // Display updated list
	        System.out.println("After adding 'Pink' at the end: " + colors);
	    }
	}

