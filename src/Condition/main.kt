package Condition

fun main() {
    val openHour: Int = 7;
    val closeHour: Int = 6;
    val timeNow: Int = 20;

    val isOpen = timeNow >= openHour && timeNow >= closeHour


// open office
    if (isOpen) {
        println("office already open")
    } else {
        println("office already close")
    }

// close office
    if (!isOpen) {
        println("office already open")
    } else {
        println("office already close")

    }
}