/*
    while loop,Do while loop,and how to skip loop operations
    *with break and continue keywords
    *how to use labels to control which loops these jump expressions target
*/
fun main () {

    var i = 0

   outer@ do {
        println(1)
        i++
//        continue

        var j = 0

        while (j < 5){
            println("---$j")
            j++
            break@outer
            println("i am not printed")
        }
        println("huhu i am printed")
    }while (i < 5)
 // exercise question
    var number = 100
    var counter = 0
    while (number > 1) {
        number /=2
        counter ++
    }
    println( counter)



}