import java.time.LocalTime;

public class GreetingProgram {

    // Entry point of the program
    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Determine the appropriate greeting based on the current time
        String greeting;
        if (currentTime.isAfter(LocalTime.MIDNIGHT) && currentTime.isBefore(LocalTime.NOON)) {
            greeting = "Good Morning"; // Set greeting to "Good Morning" if the time is between midnight and noon
        } else if (currentTime.isAfter(LocalTime.NOON) && currentTime.isBefore(LocalTime.of(16, 0))) {
            greeting = "Good Afternoon"; // Set greeting to "Good Afternoon" if the time is between noon and 4:00 PM
        } else {
            greeting = "Good Evening"; // Set greeting to "Good Evening" for any other time
        }

        // Print the determined greeting
        System.out.println(greeting);
    }
}
