package Operator

fun main() {
    var text: String? = null
    var textLength = text?.length ?: "Data Kosong"
    println(textLength)

    nonNullAssertion()

//    result will error because execute operator non null assertion

}


fun nonNullAssertion(){
    var text:String? = null
    var textLength = text!!.length
}