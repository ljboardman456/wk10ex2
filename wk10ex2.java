import java.util.Scanner;

// this program calculates the final grade based on user input scores
public class GradeCalculator {
    public static void main(String[] args) {
        // this creates a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // this prompts the user to enter the assignment score
        System.out.print("Enter assignment score (out of 100): ");
        double assignments = scanner.nextDouble();
        
        // this prompts the user to enter the midterm score
        System.out.print("Enter midterm score (out of 100): ");
        double midterms = scanner.nextDouble();
        
        // this prompts the user to enter the final exam score
        System.out.print("Enter final exam score (out of 100): ");
        double finals = scanner.nextDouble();
        
        // this calculates the final grade using the method below
        double finalGrade = CalculateFinalGrade(assignments, midterms, finals);
        
        // this prints the final grade formatted to two decimal places
        System.out.printf("Final Grade: %.2f%%\n", finalGrade);
        
        // this closes the scanner to prevent resource leaks
        scanner.close();
    }
    
    // this method calculates the weighted final grade
    public static double CalculateFinalGrade(double assignments, double midterms, double finals) {
        // these variables define the weight of each component
        double assignmentWeight = 0.40;
        double midtermWeight = 0.30;
        double finalWeight = 0.30;
        
        // this calculates and returns the weighted sum of the scores
        return (assignments * assignmentWeight) + (midterms * midtermWeight) + (finals * finalWeight);
    }
}
