public class Booleans {
    public static void main(String[] args) {

        // Booleans are true or false values

        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9  

        // Booleans are often used in conditional statements, which allow us to decide whether to perform an action or not.

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        // Booleans can be used in conditional statements to check if a condition is true or false

        // if statement with boolean condition
        
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
        } else {
         System.out.println("Not old enough to vote.");
        }

    }
}
