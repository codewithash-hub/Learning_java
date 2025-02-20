public class Main {
    public static void main(String[] args) {
        // dataType[] arrayName;
        // arrayName = new dataType[10] -- Address of the 10 elements of type datatype

        // or
        // dataType[] arrayName = new dataType[10];

        int[] nums = new int[20];

        // When an array is created. its elements are assigned the following default values:
        // - 0 for the numeric primitive data type
        // - \u0000 for char types
        // - false for boolean types
        // - null for reference types

        // ACCESSING ARRAY ELEMENTS - use brackets and indices

        int[] numbers = new int[5]; // {0, 0, 0, 0, 0}

        numbers[0] = 5; // {5, 0, 0, 0, 0}
        numbers[2] = 8; // {5, 0, 8, 0, 0}
        numbers[4] = 10; // {5, 0, 8, 0, 10}

        for (int number : numbers) {
            System.out.println(number);
        }

        // ARRAY INITIALIZERS
        double[] numberDoubles = {1.9, 2.9, 3.4, 3.5};
        // is the same statement as:
        double[] numbersDoubles = new double[4];
        numbersDoubles[0] = 1.9;
        numbersDoubles[1] = 2.9;
        numbersDoubles[2] = 3.4;
        numbersDoubles[3] = 3.5;

        // PRINTING ARRAYS
        System.out.println(numbersDoubles); // will print the address os an arrays

        for (double i : numbersDoubles) {
            System.out.println(i);
        }
    }
}