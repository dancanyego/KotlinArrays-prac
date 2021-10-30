fun main() {
    // The average of five numbers that a user enters
    println("Enter Any 5 numbers")
    var average = 0
    for (i in 1..5){
        var input = readLine()?.toInt()
        if (input != null){
            average += input / 5
        }
    }
    println("The Average of the numbers are $average")
    // The sum of all arrays
   /** var myArray = arrayOf(1,2,3,4,5)
    var sum = 0
    for (items in myArray){
        sum += items
    }
    println("The Sum of the items is $sum")
   **/


   /** println("Enter 5 Number")
    val list = mutableListOf<Int>()
    for (i in 1..10){
        val x = readLine()?.toInt()
        if (x != null){
            list.add(x)
        }
    }


    println(list)
   **/
                              // Allow a user to enter a number and decrease it
   /** println("Enter your favorite number")
    var x = readLine()?.toInt()
    println("Lets count $x from down to zero")
    while (x != null && x >= 0){
        println(x)
        x--
    } **/
                          // Allowing users to enter two numbers
   /** println("Enter your first Number")
    var x = readLine()?.toInt()
    println("Enter your second Number")
    var y = readLine()?.toInt()

    var result = 1
    var i = 1
    while (x != null && y != null && i < y ){
        result  *= x
        i++
    }
    println("$x to the power of $y is $result")
   **/
    // FOR LOOP
 /** val myArray = arrayOf(1,2,3,4,5,6,7,8,9)
    var max = myArray[6]
    for (item in myArray){
        if (item < max){
            max= item
        }
    }
 println(max)
  **/

    // WHILE LOOP
  /**  val myArray = arrayOf("Hello","Hawayu","Chatur")
    val arraylength = myArray.size
    var i = 0
    while (i < arraylength){
        println(myArray[i])
        i++
    } **/

    // promt the user to enter the age
   /** println("Please Enter Your age")
    val age = readLine()?.toInt()

    if (age != null){
        if (age >= 0 && age <18 ){
            println("Whoa you are fucking young")
        }else if (age >= 18 && age < 50){
            println("Woow You are of age")
        }else {
            println("Hahaha You Old Madafucker")
        }
    } **/
//    var myString = "Racecar"
    // Arrays
  /**  val myArray = arrayOf(1,2,3,4)
    println(myArray)
    if (myString.reversed() == myString){
        println("The $myString is a palindrome")
    }else{
        println("The $myString not a palindrome")
    } **/

}

