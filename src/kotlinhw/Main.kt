package kotlinhw

fun main() {
    printSum() //Task1
    checkNumbers() //Task2
    printNumbersFromOneToN() //Task3
    printSumFromOneToN() //Task4
    printNumbersFromKeyboardUntilNegativeIsEntered()//Task5

    val rectangle = createRectangle() //Task6
    println("The perimeter is ${calculteRectanglePerimeter(rectangle)}")
    println("The square is ${calculteRectangleSquare(rectangle)}")

    evaluateStudent() //Task7
    printMultiplicationTable() //Task8
}

//Task1: Напишите программу, которая принимает два целых числа с клавиатуры и выводит их сумму.
fun printSum() {
    println("Enter two numbers")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    println("The sum of these numbers is ${number1 + number2}")
}

//Task2: Напишите программу, которая проверяет, является ли введенное пользователем число четным или нечетным.
fun checkNumbers() {
    println("Enter numbers to check whether the number is even or odd")
    val number = readln().toInt()
    if (number % 2 == 0) {
        println("The number $number is even")
    } else {
        println("The number $number is odd")
    }

}

//Task3: Напишите программу, которая выводит все числа от 1 до N, где N вводится с клавиатуры.
fun printNumbersFromOneToN() {
    println("Enter number to print all the numbers from 1 to the entered one")
    val number = readln().toInt()
    for (i in 1..number) {
        print("$i ")
    }
    println()
}

//Task4: Напишите программу, которая вычисляет сумму всех чисел от 1 до N с использованием цикла while. N вводится с клавиатуры.
fun printSumFromOneToN() {
    println("Enter number to print the sum from 1 to the entered one")
    val n = readln().toInt()
    var sum = 1
    var i = 1
    while (i < n) {
        sum += i + 1
        i++
    }
    println(sum)
}

/* Task5: Напишите программу, которая будет читать числа с клавиатуры и выводить их на экран, пока не будет введено отрицательное число.
    Используйте цикл do-while для этого.*/
fun printNumbersFromKeyboardUntilNegativeIsEntered() {
    var number: Int
    println("Enter numbers to print them")
    println("Enter any negative numbers to finish entering numbers")
    do {
        number = readln().toInt()
        if (number >= 0) {
            println(number)
        }
    } while (number >= 0)
}

/*Task6: Напишите программу, которая вычисляет периметр и площадь прямоугольника.
    Длина и ширина прямоугольника вводятся с клавиатуры.
     */
fun calculteRectangleSquare(rectangle: Rectangle): Int {
    return rectangle.getWidth() * rectangle.getHeight()
}

fun calculteRectanglePerimeter(rectangle: Rectangle): Int {
    return (rectangle.getWidth() + rectangle.getHeight()) * 2
}

fun createRectangle(): Rectangle {
    println("Enter the width of the rectangle:")
    val width = readln().toInt()
    println("Enter the height of the rectangle:")
    val height = readln().toInt()
    return Rectangle(width, height)
}

/*Task7: Напишите программу, которая принимает на вход баллы студента и выводит оценку по шкале:
    Оценка A: от 90 до 100 баллов.
    Оценка B: от 75 до 89 баллов.
    Оценка C: от 50 до 74 баллов.
    Оценка D: от 30 до 49 баллов.
    Оценка F: от 0 до 29 баллов.*/

fun evaluateStudent() {
    println("Enter the student points between 0 and 100")
    val points = readln().toInt()
    var mark = 'G'
    when (points) {
        in 0..29 -> mark = 'F'
        in 30..49 -> mark = 'D'
        in 50..74 -> mark = 'C'
        in 75..89 -> mark = 'B'
        in 90..100 -> mark = 'A'
        else -> println("Points are incorrect")
    }

    if (points in 0..100) {
        println("The mark is $mark")
    }
}

/*Task8: Напишите программу, которая выводит таблицу умножения для числа N, где N вводится с клавиатуры.
      Например, если N = 3, программа должна вывести:
      3 * 1 = 3
      3 * 2 = 6
      3 * 3 = 9
      3 * 4 = 12*/

fun printMultiplicationTable() {
    println("Enter the number")
    val number = readln().toInt()

    for (i in 1..4) {
        println("$number * $i = ${number * i}")
    }
}
