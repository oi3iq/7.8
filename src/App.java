import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] doubleArray = new double[10];

        System.out.println("Enter ten double values:");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        double avg = average(doubleArray);
        System.out.println("The average value is: " + avg);
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double d : array) {
            sum += d;
        }
        return sum / array.length;
    }
}
