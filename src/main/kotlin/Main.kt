
const val adult = 18

fun main() {
    val age= 18
    val is_legal = if (age>= adult)true else false

    println(is_legal)
    if (age >=adult){
        println("is an adult") // last value is always returned
    }else{
        println("is not an adult")
    }
if (age>0 && age <=11){
    println("is a child")
}else if (age>11 && age <=17){
    println("is a teenager")
}else if (age>=adult){ // inequalities do not consider value unless stated with =
    println("is an adult")
}else{
    println("entered invalid age")
}

    when(is_legal){
    true-> println("is an adult") // again last line is always returned
    false -> println("is not at adult")
    }

}



