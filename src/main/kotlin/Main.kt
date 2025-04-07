fun main(){
val Obj_1 = Object( "Object_1")
    Obj_1.abstract_method()
}

interface Interface_1{

    fun abstract_method()
    fun test_cal(){
        println("test method from Interface_1")
    }


}

class Object(
    private val Name : String
) : Interface_1{

    override fun abstract_method() {
        println(this.Name)
    }

}
