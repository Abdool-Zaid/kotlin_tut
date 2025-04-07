fun main(){
 val obj_1 = Object("obj_1", 12)
    val obj1_clone= obj_1.copy()

    print("$obj_1, $obj1_clone")
}


data class Object(val Name :String, val Number : Int){// must have at least 1 property, also cannot be extended in any way

}
