package TypeData

fun main() {

//    Check max length Integer
    val MAX_INT = Int.MAX_VALUE;
    val MIN_INT = Int.MIN_VALUE;
    println("Max Length Integer = $MAX_INT")
    println("Min Length Integer = $MIN_INT")

    println(pembagian(29, 10))
    println(perkalian(1, 10))
    println(penjumlahan(1, 10))


//    Convert Data Type
    val byteNumber: Byte = 10;
    val byteToInt: Int = byteNumber.toInt()
    println(byteToInt)


    val tenMillion = 10_000_000
    println(tenMillion)


}


fun pembagian(num1: Int, num2: Int): Int {
    return num1 / num2
}

fun perkalian(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun penjumlahan(num1: Int, num2: Int): Int {
    return num1 + num2
}