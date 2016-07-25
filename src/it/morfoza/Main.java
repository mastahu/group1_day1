package it.morfoza;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Name operation: +-/*");
        String operation = input.nextLine();

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = 0;
        if (operation.equals("+")) {
            result = number1 + number2;
        }
        if (operation.equals("-")) {
            result = number1 - number2;
        }
        if (operation.equals("*")) {
            result = number1 * number2;
        }
        if (operation.equals("/")) {
            result = number1 / number2;
        }

        System.out.println("Your result is : " + result );


    }
}
