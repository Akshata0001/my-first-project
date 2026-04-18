package prg1b;


	import java.util.ArrayList;

	public class ColorSearch {
	    public static void main(String[] args) {
	        
	        // Create an ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add elements (colors)
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Black");

	        // Display the list
	        System.out.println("Colors in the list: " + colors);

	        // Search for "Red"
	        if (colors.contains("Red")) {
	            System.out.println("Red color is available in the list.");
	        } else {
	            System.out.println("Red color is NOT available in the list.");
	        }
	    }
	}

