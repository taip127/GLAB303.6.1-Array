import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        accessArrayElements();
        usingForLoop();
        enhancedForLoop();
        computeSumAndAverage();
        calculateMeanAndStdDev();
        insertElementAtEnd();
    }

    // Example 1: Access Array Elements
    public static void accessArrayElements() {
        System.out.println("Example 1: Access Array Elements");
        int[] age = {12, 4, 5, 2, 5};
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
        System.out.println();
    }

    // Example 2: Using for Loop
    public static void usingForLoop() {
        System.out.println("Example 2: Using for Loop");
        int[] age = {12, 4, 5};
        System.out.println("Using for Loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        System.out.println();
    }

    // Example 3: Enhanced For Loop
    public static void enhancedForLoop() {
        System.out.println("Example 3: Enhanced For Loop");
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    // Example 4: Compute the Sum and Average of Array Elements
    public static void computeSumAndAverage() {
        System.out.println("Example 4: Compute the Sum and Average");
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        double average;
        for (int number : numbers) {
            sum += number;
        }
        int arrayLength = numbers.length;
        average = (double) sum / arrayLength;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println();
    }

    // Example 5: Mean and Standard Deviation
    public static void calculateMeanAndStdDev() {
        System.out.println("Example 5: Mean and Standard Deviation");
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0, sumSq = 0;
        double mean, stdDev;

        for (int mark : marks) {
            sum += mark;
            sumSq += mark * mark;
        }

        mean = (double) sum / marks.length;
        stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
        System.out.println();
    }

    // Example 6: Insert an Element at the End of an Array
    public static void insertElementAtEnd() {
        System.out.println("Example 6: Insert Element at End");
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[11];

        System.out.print("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter an Element to Insert: ");
        int element = scan.nextInt();
        arr[10] = element;

        System.out.println("Now the new array is:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        scan.close();
    }
}
