package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter symbol count: ");
        int symbolCount = input.nextInt();

        char[] symbols = new char[symbolCount];

        System.out.println("Enter symbol: ");
        for (int index = 0; index < symbols.length; index++) {
            symbols[index] = input.next().charAt(0);
        }

        char[] reversedSymbols = new char[symbols.length];
        int reversedIndex = 0;
        for (int index = symbols.length - 1; index >= 0; index--) {
            reversedSymbols[reversedIndex] = symbols[index];
            reversedIndex++;
        }

        String reversedSymbolsAsString = Arrays.toString(reversedSymbols);
        System.out.println("Reversed symbols: " + reversedSymbolsAsString);
    }

}
