package cloudVandan.javaTasks;


public class ArrayShuffle {
	
	public static void shuffleArray(int[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));  // Use Math.random() to generate a random index
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        shuffleArray(originalArray);

        // Print the shuffled array
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");

	}
 }
	
	

}

