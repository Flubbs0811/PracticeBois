import java.util.*;
public class Calculator {
    public static void main (String []args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        double choice, number1, number2, answer, condition, remainder, counter;
        System.out.println("Hi, welcome to the Java 18 Function Calculator!");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("-1 - End Program");
        System.out.println("0 - Display Function Options");
        System.out.println("1 - Addition with Two Numbers");
        System.out.println("2 - Addition with X Numbers");
        System.out.println("3 - Subtraction with Two Numbers");
        System.out.println("4 - Multiplication with Two Numbers");
        System.out.println("5 - Multiplication with X Numbers");
        System.out.println("6 - Division with Two Numbers (As a Decimal)");
        System.out.println("7 - Division with Two Numbers (with Remainder)");
        System.out.println("8 - Mod");
        System.out.println("9 - X to the Y Power");
        System.out.println("10 - X Squared");
        System.out.println("11 - X Cubed");
        System.out.println("12 - X to the Y Root");
        System.out.println("13 - X Square Rooted");
        System.out.println("14 - X Cube Rooted");
        System.out.println("15 - Log Base X");
        System.out.println("16 - Log Base 10");
        System.out.println("17 - Log Base e");
        System.out.println("18 - Find the Factors");
        while (true) {
            System.out.println("");
            System.out.print("What function would you like to do (type in the number)? ");
            choice = input.nextDouble();
            System.out.println("");
            if (choice == -1){
                System.out.println("Thank you for using the Java 18 Function Calculator!");
                System.exit(0);
            } else if (choice == 0) {
                System.out.println("Display Function Options");
                System.out.println("-1 - End Program");
                System.out.println("0 - Display Function Options");
                System.out.println("1 - Addition with Two Numbers");
                System.out.println("2 - Addition with X Numbers");
                System.out.println("3 - Subtraction with Two Numbers");
                System.out.println("4 - Multiplication with Two Numbers");
                System.out.println("5 - Multiplication with X Numbers");
                System.out.println("6 - Division with Two Numbers (As a Decimal)");
                System.out.println("7 - Division with Two Numbers (with Remainder)");
                System.out.println("8 - Mod");
                System.out.println("9 - X to the Y Power");
                System.out.println("10 - X Squared");
                System.out.println("11 - X Cubed");
                System.out.println("12 - X to the Y Root");
                System.out.println("13 - X Square Rooted");
                System.out.println("14 - X Cube Rooted");
                System.out.println("15 - Log Base X");
                System.out.println("16 - Log Base 10");
                System.out.println("17 - Log Base e");
                System.out.println("18 - Find the Factors");
            } else if (choice == 1) {
                System.out.println("Addition with Two Numbers");
                System.out.print("What number you would like to add? ");
                number1 = input.nextDouble();
                System.out.print("What number would you like to add to it? ");
                number2 = input.nextDouble();
                answer = number1 + number2;
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 2) {
                System.out.println("Addition with X Numbers");
                System.out.print("How many numbers would you like to add together? ");
                counter = 0;
                number1 = 0;
                condition = input.nextDouble();
                while (counter != condition) {
                    System.out.print("What number would you like to add? ");
                    number2 = input.nextDouble();
                    number1 = number1 + number2;
                    counter++;
                }
                System.out.println("The answer is " + number1 + ".");
            } else if (choice == 3) {
                System.out.println("Subtraction with Two Numbers");
                System.out.print("What number you would like to be subtracted from? ");
                number1 = input.nextDouble();
                System.out.print("What number you would like to subtract it by? ");
                number2 = input.nextDouble();
                answer = number1 - number2;
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 4) {
                System.out.println("Multiplication with Two Numbers");
                System.out.print("What number you would like to be multiplied? ");
                number1 = input.nextDouble();
                System.out.print("What number you would like to multiply it by? ");
                number2 = input.nextDouble();
                answer = number1 * number2;
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 5) {
                System.out.println("Multiplication with X Numbers");
                System.out.print("How many numbers would you like to multiply together? ");
                counter = 0;
                number1 = 0;
                condition = input.nextDouble();
                while (counter != condition) {
                    System.out.print("What number would you like to multiply? ");
                    number2 = input.nextDouble();
                    number1 = number1 * number2;
                    counter++;
                }
                System.out.println("The answer is " + number1 + ".");
            } else if (choice == 6) {
                System.out.println("Division with Two Numbers (As a Decimal)");
                System.out.print("What is the dividend? ");
                number1 = input.nextDouble();
                System.out.print("What is the divisor? ");
                number2 = input.nextDouble();
                if ((number1 == 0) && (number2 == 0)) {
                    System.out.println("Imagine that you have zero cookies and you split them evenly among zero friends. How many cookies does each person get? See? It doesn't make sense. And Cookie Monster is sad that there are no cookies, and you are sad that you have no friends.");
                } else {
                    answer = number1 / number2;
                    System.out.println("The answer is " + answer + ".");
                }
            } else if (choice == 7) {
                System.out.println("Division with Two Numbers (with Remainder)");
                System.out.print("What is the dividend? ");
                number1 = input.nextDouble();
                System.out.print("What is the divisor? ");
                number2 = input.nextDouble();
                if ((number1 == 0) && (number2 == 0)) {
                    System.out.println("Imagine that you have zero cookies and you split them evenly among zero friends. How many cookies does each person get? See? It doesn't make sense. And Cookie Monster is sad that there are no cookies, and you are sad that you have no friends.");
                } else {
                    answer = number1 / number2;
                    answer = java.lang.Math.floor(answer);
                    remainder = number1 % number2;
                    System.out.println("The answer is " + answer + " Remainder " + remainder + ".");
                }
            } else if (choice == 8) {
                System.out.println("Mod");
                System.out.print("What is the number that you want to find the mod of? ");
                number1 = input.nextDouble();
                System.out.print("What are you modding it by? ");
                number2 = input.nextDouble();
                answer = number1 % number2;
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 9) {
                System.out.println("X to the Y Power");
                System.out.print("What is the base? ");
                number1 = input.nextDouble();
                System.out.print("What is the power? ");
                number2 = input.nextDouble();
                answer = java.lang.Math.pow(number1, number2);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 10) {
                System.out.println("X Squared");
                System.out.print("What number would you like to be squared? ");
                number1 = input.nextDouble();
                answer = java.lang.Math.pow(number1, 2);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 11) {
                System.out.println("X Cubed");
                System.out.print("What number would you like to be cubed? ");
                number1 = input.nextDouble();
                answer = java.lang.Math.pow(number1, 3);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 12) {
                System.out.println("X to the Y Root");
                System.out.print("What is the degree(number inside the radical)? ");
                number1 = input.nextDouble();
                System.out.print("What is the radicand(number outside the radical)? ");
                number2 = input.nextDouble();
                answer = java.lang.Math.pow(number1, 1 / number2);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 13) {
                System.out.println("X Square Rooted");
                System.out.print("What number would you like to be square rooted? ");
                number1 = input.nextDouble();
                answer = java.lang.Math.sqrt(number1);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 14) {
                System.out.println("X Cube Rooted");
                System.out.print("What number would you like to be cube rooted? ");
                number1 = input.nextDouble();
                answer = java.lang.Math.cbrt(number1);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 15) {
                System.out.println("Log Base X");
                System.out.print("What is the base of the log? ");
                number1 = input.nextDouble();
                System.out.print("What is the number that is going to be logged? ");
                number2 = input.nextDouble();
                answer = java.lang.Math.log(number2) / java.lang.Math.log(number1);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 16) {
                System.out.println("Log Base 10");
                System.out.print("What is the number that is going to be logged? ");
                number1 = input.nextDouble();
                answer = java.lang.Math.log10(number1);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 17) {
                System.out.println("Log Base e");
                System.out.print("What is the number that is going to be logged? ");
                number1 = input.nextDouble();
                answer = java.lang.Math.log(number1);
                System.out.println("The answer is " + answer + ".");
            } else if (choice == 18) {
                System.out.println("Find the Factors");
                System.out.print("What is the number that you want to find the factors of? ");
                number1 = input.nextDouble();
                condition = 1;
                System.out.print("The answer is:");
                while (condition != (number1 + 1)) {
                    if ((number1 / condition) % 1 == 0) {
                        System.out.print(" " + condition);
                    }
                    condition += 1;
                }
                System.out.println("");
            } else {
                System.out.println("Sorry, that is not an option. Please try again. THIS IS AN EDIT!@#$%^&*()_)(*&^%$#@#$%^&*(");
            }
            Thread.sleep(2000);
        }
    }
}