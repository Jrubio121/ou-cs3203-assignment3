import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Assignment3 {
	
	// Main method that calls addNumbers and multiplyNumbers
	public static void main(String[] args) {
		
		int addResult;
		int multiplyResult;
		int[] numbers = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; ++i) {
			System.out.println("Enter a number");
			numbers[i] = input.nextInt();
		}
		
		addResult = addNumbers(numbers);
		multiplyResult = multiplyNumbers(numbers);
		
		System.out.println("Addition Result: " + addResult);
		System.out.println("Multiplication Result: " + multiplyResult);
		
		input.close();
	}
	
	// Method that adds numbers in an array
	public static int addNumbers(int[] numbers) {
		
		int result = 0;
		for(int i = 0; i < numbers.length; ++i) {
			result = result + numbers[i];
		}
		
		return result;
	}
	
	// Method that multiplies numbers in an array
		public static int multiplyNumbers(int[] numbers) {
			
			int result = 1;
			for(int i = 0; i < numbers.length; ++i) {
				result = result * numbers[i];
			}
			
			return result;
		}
		
	// Method that reverses numbers in an array
		public static int[] reverseNumbers(int[] numbers) {
			
			int[] reversed = new int[numbers.length];
			int last = numbers.length;
			
			for(int i = 0; i < numbers.length; ++i) {
				reversed[last - 1] = numbers[i];
				last = last - 1;
			}
			return reversed;
			
		}
		
}
