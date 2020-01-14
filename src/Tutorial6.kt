// Today we will be learning how to overload a function so as to pass different combinators of parameters to it

/*
fun main() {
    greet(
        "How are you?",
        name = "Julliet",
        reps = 3
    )
}

fun greet(message: String, name: String = "User", reps: Int = 1) {
    for (i in 0 until reps) println("Hello, $name! $message")
}
 */

// create another function with the name getSum that takes btwn 2 and 4 values then returns sum of them

/*
fun main() {
    println(getSum(1,2,3,4,5))

}
fun  getSum( a:Int ,vararg numbers :Int ):Int {
//    numbers   //Array<Int>
    var sum = 0

    for (number :Int in numbers) sum += number

    return sum
}
 */

//writting a get function

const val STRING_CONSTANT = "am a constant"

fun main() {
    println(STRING_CONSTANT)
    println(getMax(9000,4000,9,3,4,6))
}

fun getMax(first :Int ,vararg  remaining: Int): Int {
    println(STRING_CONSTANT)
//    STRING_CONSTANT = "i have just changed"
    var max :Int =first

    for (i :Int in remaining){
        if (i > max) max = i
    }
    return max
}