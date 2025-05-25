package ru.yourname.helloandroid.kotlin

import androidx.constraintlayout.widget.ConstraintSet.Transform
import java.lang.IllegalArgumentException
import kotlin.math.abs

fun main() {
    //welcomeBot("Albina")
    // orderPaint("red", 5)
    //println(sumOfTriples(5))
    //println(boost(10))
    //println(combine(-4, 5, sum))
    //println(secureText("hello", ::wrapInHashes))
    //println(newList.map { it.lowercase() })
    //println(computeFibonacci(n = 5))
//    println("Min power of $list1 is ${findMinCharge(list1)}")
//    println("Min power of $list2 is ${findMinCharge(list2)}")
//    println("Min power of $list3 is ${findMinCharge(list3)}")
//    println(sumValid(listVal))
//    println("Multiply: ${adjustSignals(orig)}")
//    println("Square: ${adjustSignals(orig, {it*it})}")
}


/**
 * Напишите функцию welcomeBot(id: String), которая выводит строку
 * Beep! Unit <id> online
 */
fun welcomeBot(id: String) {
    println("Beep! Unit $id online")
}


/**
 * Создайте функцию orderPaint(color: String = "silver", layers: Int = 1), печатающую
 * строку
 * Painting robot in <color> (layers: <layers>).
 * Если аргументы не переданы — используются значения по умолчанию.
 * Если layers ≤ 0, функция должна вывести сообщение об ошибке "Invalid number of
 * layers"
 */
fun orderPaint(color: String = "silver", layers: Int = 1) {
    if (layers <= 0) return println("Invalid numbers of layers")
    else println("Paint robot in $color (layers: $layers)")
}


/**
 * Объявите компактную функцию triple(x: Int): Int = x * 3.
 * Затем реализуйте функцию sumOfTriples(n: Int): Int, которая для каждого i из
 * диапазона 1..n вызывает triple(i) и выводит полученную сумму
 */
fun triple(x: Int): Int = x * 3
fun sumOfTriples(n: Int): Int = (1..n).sumOf { triple(it) }


/**
 * Объявите переменную boost: (Int) -> Int, которая для чётных аргументов
 * возвращает их куб, для нечётных — квадрат; если модуль результата превышает
 * 1_000_000, вместо числа выводится сообщение об ошибке "Out of range";
 * продемонстрируйте работу, вызвав boost(4) и выведя полученный результат
 */
val boost: (Int) -> Int = { num ->
    val result = if (num % 2 == 0) num * num * num else num * num
    if (Math.abs(result) > 1000000) throw IllegalArgumentException("Out of range") else result
}


/**
 * Реализуйте функцию combine(a: Int, b: Int, operation: (Int, Int) -> Int): Int, которая
 * применяет переданную в параметре operation функцию к значениям a и b, если оба
 * числа положительные, иначе возвращает результат применения функции operation
 * к их модулям, и выведите результат
 */
fun combine(a: Int, b: Int, operation: (Int, Int) -> Int): Int =
    if (a > 0 && b > 0) operation(a, b) else operation(Math.abs(a), Math.abs(b))
val sum: (Int, Int) -> Int = {a, b -> a + b}


/**
 * Создайте функцию wrapInHashes(text: String): String, добавляющую по одному
 * символу # в начало и конец строки. Передайте её как ссылку ::wrapInHashes вторым
 * аргументом в функцию secureText, которая должна вызвать полученную функцию и
 * вывести преобразованный текст
 */
fun wrapInHashes(text: String): String = "#$text#"
fun secureText(text: String, transform: (String) -> String): String = transform(text)


/**
 * В коде объявлен список drones, например listOf("AX23X", "BT77", "QX90X"),
 * отфильтруйте элементы, оставив только те, что оканчиваются символом 'X' и при
 * этом содержат не менее пяти символов, затем преобразуйте их в нижний регистр и
 * выведите получившийся список
 */
val drones = listOf("AX23X", "BT77", "QX90X")
val newList = drones.filter { it.last() == 'X' && it.length >= 5}


/**
 * Напишите функцию computeFibonacci(n: Int?): Int?, которая возвращает n-е число
 * Фибоначчи, если n не равен null и неотрицательно, при этом для значений n от 0 до
 * 1 возвращается n, а для остальных — рекурсивно вычисляется сумма двух
 * предыдущих чисел; если n меньше 0 или равно null, функция должна вернуть null,
 * выведите результаты для нескольких значений n, включая null и отрицательные
 * числа
 */
fun computeFibonacci(n: Int?): Int? {
    if (n == null || n < 0) return null

    return when(n) {
        0, 1 -> 1
        else ->{
            var fib1 = 1
            var fib2 = 1
            for (i in 2..n){
                val result = fib1 + fib2
                fib1 = fib2
                fib2 = result
            }
            fib2
        }
    }
}


/**
 * Создайте функцию findMinCharge(levels: List<Int>?): Int?, которая возвращает
 * минимальный уровень заряда батарей из переданного списка, при этом функция
 * должна игнорировать все отрицательные значения и возвращать null, если список
 * равен null, пустой или не содержит ни одного положительного значения; выведите
 * результат для примера с положительными, отрицательными и нулевыми
 * значениями
 */
fun findMinCharge(levels: List<Int>?): Int? {
    if (levels.isNullOrEmpty()) return null
    var min: Int? = null
    for (level in levels) {
        if (level > 0) {
            if (min == null || level < min) min = level
        }
    }
    return min
}
val list1 = listOf(7, 3, 5, 1, 2)
val list2 = listOf(-6, 7, 3, -7, -5)
val list3 = emptyList<Int>()


/**
 * Реализуйте функцию sumValid(values: List<Int?>): Int, которая суммирует все
 * элементы списка, игнорируя значения null и те, что меньше нуля, и выводит
 * итоговое значение суммы только положительных чисел
 */
fun sumValid(values: List<Int?>): Int {
    var sum = 0
    for (i in values){
        if (i != null && i >= 0) sum += i
    }
    return sum
}
val listVal = listOf(1, null, 8, 9, -5, -9)


/**
 * Напишите функцию adjustSignals(signals: List<Int>, adjust: (Int) -> Int = { it * 2 }):
 * List<Int>, которая применяет к каждому элементу списка signals функцию adjust (по
 * умолчанию — удвоение), исключая из обработки отрицательные значения, и
 * возвращает новый список преобразованных положительных чисел; проверьте
 * работу функции как с преобразованием по умолчанию, так и с передачей лямбды,
 * умножающей элемент на 10
 */
fun adjustSignals(signals: List<Int>, adjust: (Int) -> Int = { it * 2 }): List<Int> {
    val resultList = mutableListOf<Int>()
    for (n in signals){
        if (n >= 0) resultList.add(adjust(n))
    }
    return resultList
}
val orig = listOf(1, 2, 3, -4, -5, 6)