import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a measurement in meters
        System.out.print("Enter a measurement in meters: ");
        
        // Check if the input is valid
        if (input.hasNextDouble()) {
            double meters = input.nextDouble();
            if (meters <= 0) {
                System.out.println("Invalid input: the measurement must be positive.");
            } else {
                // Convert the measurement to miles, feet, and inches
                double miles = meters / 1609.344;
                double feet = meters * 3.28084;
                double inches = meters * 39.3701;
                
                // Output the results
                System.out.printf("%.2f meters is equal to:\n", meters);
                System.out.printf("%.2f miles\n", miles);
                System.out.printf("%.2f feet\n", feet);
                System.out.printf("%.2f inches\n", inches);
            }
        } else {
            System.out.println("Invalid input: please enter a number.");
            input.next(); // Consume the invalid input
        }
        
        input.close(); // Close the scanner
    }
}
