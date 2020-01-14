// for  more refference look for primitives.kt in intellij
/*
  i assume you know about datatypes and variables declaration
 */
fun main() {
    println("2>1 is ${2>1}")
    println("2<1 is ${2<1}")
    println("1 >= 1 is ${2>1}")

    println("1 == 1 is ${1 == 1}")
    println("1 == 1 is ${1 == 2}")
    println("1 != 1 is ${1 != 2}")

    println("!(2 > 1) is ${!(2 > 1)}")

    println("true && false = ${true && false}")
    println("true || false = ${true || false}")

    val  condition : Boolean = ((2<1) || (3<2)) && (3> 2)
    println(condition)

}
