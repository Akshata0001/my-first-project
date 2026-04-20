/*Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )
*/


package prg1c4;

	import java.util.LinkedList;

	public class DisplayPositions {
	    public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display elements with their positions
	        System.out.println("Elements and their positions:");
	        for (int p = 0; p < colors.size(); p++) {
	            System.out.println("Position " + p + " : " + colors.get(p));
	        }
	    }
	}

