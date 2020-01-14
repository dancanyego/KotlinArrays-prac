//we will create the first Kotlin class with properties

fun main() {
    val user1 =User("collo" , 21)      //INSTANTIATION

//    println("user name : ${user1.name}")
//    println("user age : ${user1.age}")

    val user2 =User("collo" , 21)      //INSTANTIATION

//    println("user name : ${user2.name}")
//    println("user age : ${user2.age}")

    val user3 =User(age = 21)      //INSTANTIATION

//    println("user name : ${user3.name}")
//    println("user age : ${user3.age}")

    val  user4 =User( " " , 20)
}

class User(name: String = "No name", var age: Int) {
    init {
        print(" New user is created . Age : $age ,")

    }
    val name : String

    init {
        if (name.isBlank()){
            this.name = "No name"
        }else {
            this.name = name.trim()
        }
        println(" Name : ${this.name}")
    }
}

//changing the constructor where name is automatically set to no name then create a user 3 and print it

