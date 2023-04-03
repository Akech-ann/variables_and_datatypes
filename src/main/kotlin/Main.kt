fun main() {
    inter()
    floaty()
    bool()
    hello("Ann")
    swap()
    increment()
    flooat()
    bull()
    concat()

}

//Write a Kotlin program to declare an integer variable and assign a value of 10 to it.
fun inter(){
    var num = 10
    println(num)
}

//Write a Kotlin program to declare a float variable and assign a value of 3.14 to it.
fun floaty(){
    var num = 3.14
    println(num)
}
//Write a Kotlin program to declare a boolean variable and assign a value of true to it.
fun bool(){
    var num = true
    println(num)
}
//Write a Kotlin program to declare a string variable and assign a value of "Hello, World!" to it.
fun hello(name:String){
    println("Hello $name")

}
//Write a Kotlin program to declare two integer variables and swap their values.
fun swap(){
    var a = 10
    var b = 15
    var temp = a
     a = b
    b = temp
    println("a = $a")
    println("b = $b")

}
fun increment(){
    var num = 10
    num ++
    println("The new number is $num")

}
//Write a Kotlin program to declare a float variable and decrement its value by 0.1.
fun flooat(){
    var decret = 122.2

    println(decret-0.1)


}
//Write a Kotlin program to declare a boolean variable and print its value.
fun bull(){
    var truue = true
    println(truue)
}
//Write a Kotlin program to declare a string variable and concatenate it with another string.
fun concat(){
    var sentence1= "I love coding "
    var sentence2 = "My favourite language is kotlin"
    var all = sentence1+sentence2
    println(all)

}
//Write a Kotlin program to declare a variable without assigning
// a value to it and print its default value.

