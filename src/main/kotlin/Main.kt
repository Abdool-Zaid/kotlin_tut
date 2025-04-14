fun main(){
    var obj = Object("val_1", 2)

//    let
    obj?.let {// ref = <it>
        println(it)
        // last line is always returned
    }

//    run
    val sb= StringBuilder()
        sb.append("string_1")
        sb.append("string_2")
    sb.toString()
    val sb_2 = sb.run{// ref = <this>
        append("string_3")
        append("string_4")
        toString()
    }
    val sb_3 = with(obj){
        "name : $name, \nage : $age "
    }

    println(sb_3)
}

//scope functions
//1. let
//2. run
//3. with
//4. apply
//5. also




class Object (
    var name: String,
    var age: Int
)