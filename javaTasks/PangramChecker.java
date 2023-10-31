package cloudVandan.javaTasks;

public class PangramChecker {
	
	 public static boolean isPangram(String input) {
	        // Remove spaces and convert to lowercase to make it case-insensitive
	        input = input.replaceAll(" ", "").toLowerCase();

	        // Create a boolean array to track the presence of each letter
	        boolean[] letterPresent = new boolean[26];

	        // Iterate through the input and mark letters as present
	        for (char c : input.toCharArray()) {
	            if (Character.isLetter(c)) {
	                int index = c - 'a';
	                letterPresent[index] = true;
	            }
	        }
	        
	        for (boolean isPresent : letterPresent) {
	            if (!isPresent) {
	                return false;
	            }
	        }

	        return true;
	    }
	 
	 public static void main(String[] args) {
	        String input = "Abcdefghijklmnopqrstuvwxyz";
	        boolean isPangram = isPangram(input);
	        
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
}
