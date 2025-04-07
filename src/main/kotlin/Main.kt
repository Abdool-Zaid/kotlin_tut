fun main(){
//    println(division(12,9))
    println(sum_all(1,2,3,4,5,6,7,8,9,10))
}

fun division (a: Int, b:Int):Int{ // return type is not required
    var res: Int = 0
    try {
        res= a/b
    }catch (e:Exception){
        println(e.message)
    }finally {
        return res
    }
}

fun sum_all (vararg numbers:Int):Int{
    var res = 0
//    println(numbers.size)
    if (numbers.size<= 1 ) {
        println("too little elements")
        return res
    }
    else if(numbers.size>=20000){
        println("too many elements ")
        return  res
    }
    else{
        try {
            for (i in numbers){
                res= res + i
//                println(res)
            }
        }catch (e: Exception){
            println(e)
        }finally {
            return  res
        }
    }

}
