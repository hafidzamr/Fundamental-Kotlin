package Functions

fun main() {
    val user = setUser("Hafidz", 23)
    println(user)

}


fun setUser(name: String, age: Int): String {
    return "My Name is $name, and im $age old"
}