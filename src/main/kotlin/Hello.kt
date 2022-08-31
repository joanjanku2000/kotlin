fun main() {
    println("hello wol")

    val alien = Alien("elene", 22)

    println("Name is :  ${alien.name()} ")
    println("Age is :  ${alien.age()} ")

    val num1 = 5;
    val num2 = 6;
    val multiplication = num1 * num2;
    val addition = num1 + num2;

    println("Result is ${num1 + num2}")
    println("The multiplication of $num1 and $num2 is $multiplication")


    /*
        If...else in Kotlin are expresions, meaning it returns a value
     */

    if (multiplication > 20) {
        println("Multiplication Greater than 10")
    } else {
        println("Less than 10")
    }

    val greaterThan10 = if (addition > 10) {
        addition
    } else {
        0
    }
    println("If else result = $greaterThan10")

    val str1: String = "Navin"
    var str2: String = "Navin"

    println("Equals")

    if (str1.equals(str2) ) {
        println("Same")
    } else {
        println("Not same")
    }
    // Equals with param true, means ignore case

    str2 = "navin"
    println("Case insesitive Equals")
    if (str1.equals(str2,true) ) {
        println("Same")
    } else {
        println("Not same")
    }

    println("Compare to")
    if (str1.compareTo(str2) == 0) {
        println("Same")
    } else {
        println("Not same")
    }

    //Compare to also has ignoreCase boolean param

}