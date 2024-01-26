public class HaltConditions {
    public static void main(String[] args) {
        // Call the sum function with the arguments 5 and 10
        int result = sum(5, 10);

        // Print the result
        System.out.println(result);
    }

    // Recursive function to calculate the sum of numbers from 'start' to 'end'
    public static int sum(int start, int end) {
        // Check if 'end' is greater than 'start'
        if (end > start) {
            // Return the sum of 'end' and the result of calling sum with 'start' and 'end - 1'
            return end + sum(start, end - 1);
        } else {
            // Base case: if 'end' is not greater than 'start', return 'end'
            return end;
        }
    }
}
