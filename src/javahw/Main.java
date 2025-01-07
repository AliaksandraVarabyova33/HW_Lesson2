package javahw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printSum(); //Task1
        checkNumbers(); //Task2
        printNumbersFromOneToN(); //Task3
        printSumFromOneToN(); //Task4
        printNumbersFromKeyboardUntilNegativeIsEntered(); //Task5

        Rectangle rectangle = createRectangle(); //Task6
        System.out.println("The perimeter is " + calculteRectanglePerimeter(rectangle));
        System.out.println("The square is " + calculteRectangleSquare(rectangle));

        evaluateStudent(); //Task7
        printMultiplicationTable(); //Task8
        System.out.println(calculateFibonacciNumber(getFibonacciInputN(), 0, 1)); //Task9
    }

    //Task1: Напишите программу, которая принимает два целых числа с клавиатуры и выводит их сумму.
    public static void printSum() {
        System.out.println("Enter two numbers");
        List<Integer> numbers = getNumberFromKeyboard();
        int number1 = numbers.get(0);
        int number2 = numbers.get(1);
        System.out.println("The sum of these numbers is " + (number1 + number2));
    }

    //Task2: Напишите программу, которая проверяет, является ли введенное пользователем число четным или нечетным.
    public static void checkNumbers() {
        System.out.println("Enter numbers to check whether the number is even or odd");
        List<Integer> numbers = getNumberFromKeyboard();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even");
            } else {
                System.out.println("The number " + number + " is odd");
            }
        }
    }

    //Task3: Напишите программу, которая выводит все числа от 1 до N, где N вводится с клавиатуры.
    public static void printNumbersFromOneToN() {
        System.out.println("Enter number(s) to print all the numbers from 1 to the entered one(s)");
        List<Integer> numbers = getNumberFromKeyboard();
        for (Integer n : numbers) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //Task4: Напишите программу, которая вычисляет сумму всех чисел от 1 до N с использованием цикла while. N вводится с клавиатуры.
    public static void printSumFromOneToN() {
        System.out.println("Enter number(s) to print the sum from 1 to the entered one(s)");
        List<Integer> numbers = getNumberFromKeyboard();
        for (Integer n : numbers) {
            int sum = 1;
            int i = 1;
            while (i < n) {
                sum += i + 1;
                i++;
            }
            System.out.println(sum);
        }
    }

    /* Task5: Напишите программу, которая будет читать числа с клавиатуры и выводить их на экран, пока не будет введено отрицательное число.
    Используйте цикл do-while для этого.*/

    public static void printNumbersFromKeyboardUntilNegativeIsEntered() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter numbers to print them");
        System.out.println("Enter any negative numbers to finish entering numbers");
        do {
            number = sc.nextInt();
            if (number >= 0) {
                System.out.println(number);
            }
        } while (number >= 0);
    }

    //additional method for the first 4 tasks
    public static List<Integer> getNumberFromKeyboard() {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any letter to finish entering numbers");
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        sc.close();
        return numbers;
    }

    /*Task6: Напишите программу, которая вычисляет периметр и площадь прямоугольника.
    Длина и ширина прямоугольника вводятся с клавиатуры.
     */
    public static int calculteRectangleSquare(Rectangle rectangle) {
        return rectangle.getSide1() * rectangle.getSide2();
    }

    public static int calculteRectanglePerimeter(Rectangle rectangle) {
        return (rectangle.getSide1() + rectangle.getSide2()) * 2;
    }

    public static Rectangle createRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two sides of rectangle");
        sc.close();
        return new Rectangle(sc.nextInt(), sc.nextInt());
    }

    /*Task7: Напишите программу, которая принимает на вход баллы студента и выводит оценку по шкале:
    Оценка A: от 90 до 100 баллов.
    Оценка B: от 75 до 89 баллов.
    Оценка C: от 50 до 74 баллов.
    Оценка D: от 30 до 49 баллов.
    Оценка F: от 0 до 29 баллов.*/

    public static void evaluateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student points between 0 and 100");
        int points = sc.nextInt();
        sc.close();
        char mark = 'G';
        if (points >= 0 && points <= 29)
            mark = 'F';
        else if (points >= 30 && points <= 49)
            mark = 'D';
        else if (points >= 50 && points <= 74)
            mark = 'C';
        else if (points >= 75 && points <= 89)
            mark = 'B';
        else if (points >= 90 && points <= 100)
            mark = 'A';
        else System.out.println("Points are incorrect");

        if (points >= 0 && points <= 100) {
            System.out.println("The mark is " + mark);
        }
    }

    /*Task8: Напишите программу, которая выводит таблицу умножения для числа N, где N вводится с клавиатуры.
      Например, если N = 3, программа должна вывести:
      3 * 1 = 3
      3 * 2 = 6
      3 * 3 = 9
      3 * 4 = 12*/

    public static void printMultiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 4; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
    /*Task9: Напишите программу, которая вычисляет n-е число в последовательности Фибоначчи.
    Числа Фибоначчи — это последовательность, в которой каждое следующее число является суммой двух предыдущих.
    Первые два числа равны 0 и 1. N вводится с клавиатуры.

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...*/

    public static int calculateFibonacciNumber(int n, int number, int number2) {
        if (n == 0) return 0;
        if (n == 1) return number2;
        int sum = number + number2;
        return calculateFibonacciNumber(n - 1, number2, sum);
    }

    public static int getFibonacciInputN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N for fibonacci numbers: count starts from 0");
        int result = sc.nextInt();
        sc.close();
        return result;
    }

}
