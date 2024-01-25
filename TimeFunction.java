import java.time.LocalTime;

public class TimeFunction {

  // Entry point of the program
  public static void main(String[] args) {
    // Call the function to print the greeting
    printGreeting();
  }

  // Function to determine and print the greeting based on the current time
  public static void printGreeting() {
    // Get the current time
    LocalTime time = LocalTime.now();
    
    // Get the hour of the day
    int hour = time.getHour();

    // Check the current hour and print the appropriate greeting
    if (hour >= 0 && hour < 12) {
      System.out.println("Good Morning"); // Print out "Good Morning" if the hour is between 0000HRS and 1159HRS
    } else if (hour >= 12 && hour < 16) {
      System.out.println("Good Afternoon"); // Print out "Good Afternoon" if the hour is between 1200HRS and 1559HRS
    } else if (hour >= 16 && hour < 24) {
      System.out.println("Good Evening"); // Print out "Good Evening" if the hour is between 1600HRS and 2359HRS
    }
  }
}
