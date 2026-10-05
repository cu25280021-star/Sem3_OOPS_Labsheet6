// 11. Reads Ten Numbers, Computes Average, Finds Above Average (Using 'this')
import java.util.Scanner;

class NumberAnalyzer {
    private double[] numbers;
    private double average;

    public NumberAnalyzer(double[] numbers) {
        // Explicitly using 'this' to assign input array
        this.numbers = numbers;
    }

    public void computeAverage() {
        double sum = 0;
        for (double num : this.numbers) {
            sum += num;
        }
        // Explicitly using 'this' keyword to store result
        this.average = sum / this.numbers.length;
    }

    public int countAboveAverage() {
        int count = 0;
        for (double num : this.numbers) {
            if (num > this.average) {
                count++;
            }
        }
        return count;
    }

    public void displayResults() {
        System.out.printf("Computed Average: %.2f\n", this.average);
        System.out.println("Number of elements above average: " + this.countAboveAverage());
    }
}

public class AverageCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] inputNumbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            inputNumbers[i] = scanner.nextDouble();
        }

        NumberAnalyzer analyzer = new NumberAnalyzer(inputNumbers);
        analyzer.computeAverage();
        System.out.println("=================================");
        analyzer.displayResults();

        scanner.close();
    }
}
