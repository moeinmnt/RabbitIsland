fun main() {
    print("In what month do you want to know the number of rabbits? ")
    val nMonth = readln().toInt()

    val rabbits = rabbit(nMonth)
    println("$rabbits")

}

fun rabbit(n:Int):Int{
    return if(n == 1 || n == 2){
        1
    }else{
        (rabbit(n-1) + rabbit(n-2))
    }
}