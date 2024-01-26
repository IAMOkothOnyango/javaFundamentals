public class Stairs {

    // A recursive function to count the ways to climb n steps
    public static int countWays(int n) {
        // Base cases: If there are 0 or 1 steps, there's only one way (no steps or one step)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // The total ways to reach the current step is the sum of ways to the two previous steps
            return countWays(n - 1) + countWays(n - 2);
        }
    }

    public static void main(String[] args) {
        int totalWays = countWays(4); // Let's find out how many ways to climb 4 steps
        System.out.println("Total ways to climb 4 steps: " + totalWays);
    }
}
