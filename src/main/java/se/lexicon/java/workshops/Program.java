package se.lexicon.java.workshops;

import java.util.Scanner;

public class Program
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        /*
        System.out.println( "Hello World!" );

        String userName = askForUserString("What is your name?");

        System.out.println("Hi there " + userName + "!");

        //String userAgeInText = askForUserString(userName + " how old are you?");
        //int userAge = Integer.parseInt(userAgeInText);  //Converts String text into a number of int type

        double userAge = askForDouble(userName + " how old are you?");

        if (userAge >= 18) {
            System.out.println("You can have a beer");
        }
        else {
            System.out.println("You can only get a soda");
        }
        */

        countDown();
        /*
        double totalWas = totalAmountOfTenNumber();

        System.out.println("total was: " + totalWas);
         */
    }

    public static String askForUserString(String askFor) {
        System.out.println(askFor);
        System.out.print("User response: ");
        String userInput = scanner.nextLine();

        return userInput;
    }

    public static double askForDouble(String askFor) {
        String text = askForUserString(askFor);
        double number = Double.parseDouble(text);

        return number;
    }

    public static void countDown() {
        /*
        for (double number = 5; number > 0; number--) {
            System.out.println(number);
        }
        */
        /*
        double number = 5;
        while (number > 0) {
            System.out.println(number);
            number--;
        }
        */

        int number = 50;
        while (number > 0) {

            number--;
            if(number % 7 == 0) {
                continue;
            }
            System.out.println(number);
        }
    }

    public static double totalAmountOfTenNumber() {
        double total = 0;

        for (int times = 10; times > 0; times--) {
            total = total + askForDouble("number to add");
        }

        return total;
    }
}
