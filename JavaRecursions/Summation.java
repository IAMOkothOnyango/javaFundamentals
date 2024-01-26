public class Summation {
    public static void main(String[] args) {
      // Call the sum function with the argument 10
      int result = sum(10);
      
      // Print the result
      System.out.println(result);
    }
  
    // Recursive function to calculate the sum of numbers from 1 to k
    public static int sum(int k) {
      // Base case: if k is greater than 0
      if (k > 0) {
        // Return the sum of k and the result of calling sum with k - 1
        return k + sum(k - 1);
      } else {
        // Base case: if k is 0 or negative, return 0
        return 0;
      }
    }
   {
    
}
}
