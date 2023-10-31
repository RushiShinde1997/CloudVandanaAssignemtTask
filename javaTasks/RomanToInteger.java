package cloudVandan.javaTasks;

import java.util.HashMap;

public class RomanToInteger {
	
	public static int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int previousValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = romanMap.get(currentSymbol);

            // Check if we need to subtract (e.g., IV = 4, IX = 9)
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }
	
	public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with the Roman numeral you want to convert
        int result = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
    }

}
