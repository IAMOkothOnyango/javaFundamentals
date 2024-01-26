public class Countdown {

    // A recursive function to count down from a given number
    public static void countdown(int n) {
        // Base case: if n is less than or equal to 0, stop
        if (n <= 0) {
            System.out.println("Blastoff!");
        } else {
            // Print the current number
            System.out.println(n);
            // Call the same function with a smaller number (n-1)
            countdown(n - 1);
        }
    }

    public static void main(String[] args) {
        // Start the countdown from 5
        countdown(5);
    }
}
