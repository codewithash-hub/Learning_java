import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ANONYMOUS ARRAYS
        // An array without a variable referencing it

        //new Scanner(System.in).nextDouble();
        // new int[] {1, 2, 3, 4}
        // we can create anonymous array if we want to pass it to a function that takes an array as a parameter.
        // printArray(new int[] {1, 2, 3, 4});

        // EXCEEDING ARRAY BOUNDS
        // The indices must be between 0 and length -1

        // e.g
        //har[] chars = {'a', 'b', 'c', 'd'};

        // Index -1 out of bounds for length 4
        //System.out.println(chars[-1]);

        // Index 4 out of bounds for length 4
        //System.out.println(chars[4]);

        //System.out.println(chars); // abcd

        // PASSING ARRAYS TO METHODS

        int[] numbers = {0, 1};
        change(numbers);
        printArray(numbers);

        printStarts();
    }

    public static void change(int[] numbers) {
        numbers[0] = 1;
        numbers[1] = 0;
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    // END PASSING ARRAYS TO METHODS

    public static void printStarts() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
