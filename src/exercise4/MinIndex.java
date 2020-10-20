package exercise4;

import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        double[] numbers = new double[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }

        int minIndex = 0;
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[minIndex] > numbers[index]) {
                minIndex = index;
            }
        }

        System.out.println("Min index: " + minIndex);
    }

}
