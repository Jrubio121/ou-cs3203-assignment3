
public class Assignment3 {
	
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
			
			int result = 0;
			for(int i = 0; i < numbers.length; ++i) {
				result = result * numbers[i];
			}
			
			return result;
		}
		
}
