
package TypeData


fun main() {
    //Int32 Array
    var intArray = intArrayOf(1, 2, 3, 4)
    println(intArray.contentToString())

    // Long / Int64 Array
    var longArray = longArrayOf(1234123, 213214213, 2132131, 321313)
    println(longArray.contentToString())

    // Short / Int16 Array
    var shortArray = shortArrayOf(30000, 3400, 32000, 32500)
   println(shortArray.contentToString())

    //Byte / Int8 Array
    var byteArray = byteArrayOf(125, 122, 127)
    println(byteArray.contentToString())


    //Char Array
    var charArray = charArrayOf('A', 'B', 'C')
    println(charArray.contentToString())

    //Boolean Array
    var BooleanArray = booleanArrayOf(true, false, true);
    println(BooleanArray.contentToString())

    var sizeArray = Array(4) { i -> i * i }
    println(sizeArray.contentToString())


}