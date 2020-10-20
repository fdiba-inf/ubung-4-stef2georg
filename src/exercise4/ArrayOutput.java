package exercise4;

import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int spaceCount = 0;
        for (int number : numbers) {
            for (int space = 0; space < spaceCount; space++) {
                System.out.print(" ");
            }
            spaceCount++;

            System.out.println(number);
        }
    }

}
