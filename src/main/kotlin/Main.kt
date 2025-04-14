@OptIn(ExperimentalStdlibApi::class)
fun main(){
    val direction =Direction.East
    println(direction.description())

    for(dir in Direction.values()){
        println(dir)
    }

}


enum class Direction(private  val degrees : Int){// used for a fixed set of constants 


    North(360),
    East(90),
    South(180),
    West(270);

    fun  description() : String{

    return  "the direction is $name and the degrees is  $degrees"
    }
}
