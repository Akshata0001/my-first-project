/*Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()

*/

package prg1b4;


	import java.util.ArrayList;
	import java.util.List;

	public class ExtractColors {
	    public static void main(String[] args) {

	        // Create ArrayList
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display original list
	        System.out.println("Original List: " + colors);

	        // Extract 1st and 2nd elements (index 0 to 2, 2 is exclusive)
	        List<String> subListColors = colors.subList(0, 2);

	        // Display extracted elements
	        System.out.println("Extracted (1st and 2nd elements): " + subListColors);
	    }
	}

