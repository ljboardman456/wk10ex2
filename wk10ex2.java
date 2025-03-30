import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter assignment score (out of 100): ");
        double assignments = scanner.nextDouble();
        
        System.out.print("Enter midterm score (out of 100): ");
        double midterms = scanner.nextDouble();
        
        System.out.print("Enter final exam score (out of 100): ");
        double finals = scanner.nextDouble();
        
        double finalGrade = CalculateFinalGrade(assignments, midterms, finals);
        
        System.out.printf("Final Grade: %.2f%%\n", finalGrade);
        
        scanner.close();
    }
    
    public static double CalculateFinalGrade(double assignments, double midterms, double finals) {
        double assignmentWeight = 0.40;
        double midtermWeight = 0.30;
        double finalWeight = 0.30;
        
        return (assignments * assignmentWeight) + (midterms * midtermWeight) + (finals * finalWeight);
    }
}
