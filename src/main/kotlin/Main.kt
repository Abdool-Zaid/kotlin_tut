import java.lang.IllegalArgumentException
import javax.swing.text.Position

fun main(){
val Obj_1 = Object( "Object_1")
    Obj_1.Position= "s"
    Obj_1.abstract_method()

}

interface Interface_1{

    fun abstract_method()
    fun test_cal(){
        println("test method from Interface_1")
    }


}

class Object(
    private val Name : String,
   var _Position : String ="here"
) : Interface_1{


 var Position:String = _Position
        get() = field.uppercase()
        set(value) {
            if(value.length <=3){
               throw IllegalArgumentException("Position length must be greater than 3, ${value} is too short")
            }else{
                field= value.uppercase()
            }

        }
    override fun abstract_method() {
        println("${this.Name}, ${this.Position}")
    }

}
