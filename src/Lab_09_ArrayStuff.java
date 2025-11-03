import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {

    // ----- Task 9
    public static double getAverage(int[] values) {
        double sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // ----- Task 1
        int[] dataPoints = new int[100];

        // ----- Task 2
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // ----- Task 3
        for (int i = 0; i < dataPoints.length; i++) {
            if (i > 0) {
                System.out.print(" | ");
            }
            System.out.print(dataPoints[i]);
        }
        System.out.println(); // end the line

        // ----- Task 4
        int sum = 0;
        for (int v : dataPoints) {
            sum += v;
        }
        double avg = (double) sum / dataPoints.length;
        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + avg);

        // ----- Task 5
        int target = SafeInput.getRangedInt(in, "Enter a value to count (1-100)", 1, 100);

        // ----- Task 6
        int count = 0;
        for (int v : dataPoints) {
            if (v == target) {
                count++;
            }
        }
        System.out.println("The value " + target + " occurs " + count + " time(s) in dataPoints.");

        // ----- Task 7
        int findVal = SafeInput.getRangedInt(in, "Enter a value to find first position (1-100)", 1, 100);
        int foundIndex = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == findVal) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex >= 0) {
            System.out.println("The value " + findVal + " was found at array index " + foundIndex + ".");
        } else {
            System.out.println("The value " + findVal + " was not found in dataPoints.");
        }

        // ----- Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in dataPoints: " + min);
        System.out.println("Maximum value in dataPoints: " + max);

        // ----- Task 9
        System.out.println("Average of dataPoints: " + getAverage(dataPoints));
    }
}
