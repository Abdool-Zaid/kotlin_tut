fun main() {
    val range_val =1 .. 17
    for (i in range_val){
        println(i)
    }
    for (i in 1..20){
        if (i%2!=0)continue 
        println(i)
    }
    for (i in 1..20 step 2) println(i)

    for (i in 1000 downTo 1  step 7) println(i) //for the weebs
    for( i in 'z' downTo 'a') println(i)

}



