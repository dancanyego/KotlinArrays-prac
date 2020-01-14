/*
  if else statements/ expressions that
  * changes the controll flow of our program
 */

fun  main() {
    // for loop

    for (i : Int in 1..10) {
       val prefix : String = if ( i == 1) {
           "*"
       }
        else if  (i !in  4 ..7 ) {
            "-"
        } else {
            print(("-"))
            ">"
        }
        println("$prefix $i")
    }

    // quiz create if else statement that prints good morning,time for lunch and evening

    val time = 13

//    if (time in 0 ..11){
//        println("Good morning!")
//    }else if (time == 12){
//        println("Dude Time for Lunch !!")
//    } else{
//        println("Good Evening and Goood Day!!")
//    }

   val greeting : Any = when (time) {
       in 0..5 -> "why up so early mf ...???"
       in 0 ..11 -> "Good morning!"
       12 -> "Dude Time for Lunch !!"
       13 ,15 -> {
           println(" Yawn ....")
             "Time for a nap !"
       }
       else -> "Good Evening and Goood Day!!"
   }

    println(greeting)
//    println("Good ${if (time < 12 ) "Morning !!" else " day" }!")

}