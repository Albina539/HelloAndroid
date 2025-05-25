package ru.yourname.helloandroid.kotlin

fun main(){
//    task1()
//    task2()
//    task3()
//    task4()
//    task5()
//    task6()
//    task7()
//    task8()
//    task9()
//    task10()
//    task11()
}


/**
 * Температурный советник
 *
 * Вывести в консоль:
 * Freezing, если celsius <=0
 * Cool, если 1<= celsius <=15
 * Warm, если 16<= celsius <=25
 * Hot, если celsius > 25
 *
 */
fun task1(){

    val celsius = 20
    val result = when{
        celsius <= 0 -> "Freezing"
        celsius in 1..15 -> "Cool"
        celsius in 16..25 -> "Warm"
        else -> "Hot"
    }

    println("Temperature is $result")
}


/**
 * Касса в автобусе
 *
 * Пассажир сообщает свой возраст
 * Определить стоимость билета по тарифам и вывести найденную стоимость:
 * до 7 лет (включительно) — 0 ₽
 * 8–17 лет — 15 ₽,
 * 18–60 лет — 30 ₽,
 * старше 60 лет — 20 ₽
 *
 */
fun task2(){

    val age = 17

    val price = when{
        age <= 7 -> 0
        age in 8..17 -> 15
        age in 18..60 -> 30
        else -> 20
    }

    println("Your ticket costs $price rub")
}


/**
 * Угадай сезон
 *
 * В переменной month дан номер месяца (1–12).
 * Напечатайте название времени года на английском: «Winter», «Spring», «Summer»
 * или «Autumn»
 *
 */
fun task3(){

    val month = 6

    when(month){
        1, 2, 12 -> println("Winter")
        3, 4, 5 -> println("Spring")
        6, 7, 8 -> println("Summer")
        9, 10, 11 -> println("Autumn")
    }
}


/**
 * Следующая буква
 *
 * В переменной ch хранится одна заглавная латинская буква (A – Z). Выведите строку
 * «YES», если эта буква относится к гласным (A, E, I, O, U, Y), и «NO» в противном
 * случае
 *
 */
fun task4(){

    val ch = "H"
    val vowels = arrayOf("A", "E", "I", "O", "U", "Y")

    if (ch in vowels){
        println("YES")
    }
    else{
        println("NO")
    }
}


/**
 * Ряд умножения
 *
 * Пользователь вводит число n (1–9).
 * Выведите в одной строке через пробел значения n × 1, n × 2, …, n × 10.
 *
 */
fun task5(){
    val n = 7

    for (i in 1..10){
        print("${n.times(i)} ")
    }
}


/**
 * Города наоборот
 *
 * В коде объявлен массив cities из пяти названий городов.
 * Выведите их по одному на строке в обратном порядке (последний → первый)
 *
 */
fun task6(){

    val cities = arrayOf("Moscow", "Orel", "Tobolsk", "Saratov", "Tver")

    for (i in cities.reversed())
        println(i)
}


/**
 * Сколько гласных?
 * Вводится произвольная строка text.
 * Посчитайте и выведите количество русских гласных букв
 * («аоиеёэыуюя», регистр неважен)
 *
 */
fun task7(){

    val text = "АыпраЫОлдху"
    val vowels = arrayOf("а", "о", "и", "е", "ё", "э", "ы", "у", "ю", "я",
                        "А", "О", "И", "Е", "Ё", "Э", "Ы", "У", "Ю", "Я")
    var count = 0

    for (i in text) {
        if (i.toString() in vowels){
            count +=1
        }
    }
    println("Number of vowels: $count")
}


/**
 * Минимум до нуля
 *
 * Есть изменяемый список целых чисел numbers: MutableList<Int>.
 * Последний элемент списка равен 0. Определите наименьшее значение среди всех элементов,стоящих до этого нуля,
 * и запишите результат в переменную minValue: Int.
 *
 */
fun task8(){

    var numbers = mutableListOf(5, 2, 1, 4, 8, 0)
    numbers.removeAt(numbers.lastIndex)

    val minValue = numbers.min()

    println(minValue)
}


/**
 * Сумма не меньше тысячи
 * Дан список целых чисел data: List<Int>.
 * Просматривайте элементы по порядку, накапливая их сумму в переменной total:
 * Int, до тех пор, пока total не станет больше 1000. По завершении работы
 * программы в total должно находиться получившееся итоговое значение
 *
 */
fun task9() {

    val data = listOf(1, 2, 3, 4, 5, 600, 45, 67, 700, 344)
    var total = 0

    for (i in data) {
        total += i
        if (total > 1000) {
            break
        }
    }

    println(total)
}


/**
 * Ближайшая степень двойки
 *
 * Задано натуральное число k: Int. Найдите наименьшую степень двойки 2^m,
 * которая не меньше k, и сохраните это значение в переменной closestPower: Int.
 * Число m выводить или сохранять не требуется.
 *
 */
fun task10(){
    fun stepen(k: Int): Int{
        var m = 1
        while (m < k){
            m *= 2
        }
        return m
    }

    val k = 69
    val closestPower = stepen(k)
    println(closestPower)
}


/**
 * Безопасная длина отчества
 *
 * В коде уже объявлена переменная middleName: String? = null.
 * Напечатайте строку вида «Количество символов = X»,
 * где X — длина middleName, если значение не null,
 * или 0, если переменная равна null
 *
 */
fun task11(){

    var middleName: String? = null

    middleName = (middleName?.length ?: 0).toString()

    println("Number of simbols = $middleName")

}
