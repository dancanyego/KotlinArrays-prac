fun main() {
    /*
    var a = 5
    val b = 3.6

    println("a = "+a + "b =" + b)

    println("a+b = ${a+b}")
    println("a+b = ${a-b}")
    println("a+b = ${a/b}")
    println("a+b = ${a*b}")

    println("2+2*4 = ${a +- 2}


  ")

    a += 2
    println("a += 2 :$a")

    println("a ++ :$a++")
    println("a ++ :$++a")
    println("--a :$--a")

    a += 2
    println("a -= 2 :$a")

    a += 2
    println("a %= 2 :$a")

    a += 2
    println("a *= 2 :$a")

    a += 2
    println("a /= 2 :$a")

     */

    // arrays

//    val numbers = arrayOf(arrayOf(1,2,3),
//        arrayOf(4,5,6) ,
//        arrayOf(7,8,9))
//    println(numbers[1][1])



    val names : Array<String> = arrayOf("jesu","jacobo" ,"yeees")

    names[0] = "jacobo"

    print(names[0][2])

    println("Number of elements : ${names.size}")

    println("First element : ${names[0]}")

}
