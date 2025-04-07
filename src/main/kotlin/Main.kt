fun main(){
    val object_1 = obj(name = "object_1", location = "there")
    val object_2 = shape(vertices = 5, colour = "gold", name= "shape_1")
    println(object_2.get_name())
}

open class obj(
    private val name: String = "default object",
    private var location:String= "here"
) {
    init {//  this method is called when new instance is created
        println("new object: $name was created at location: $location")

    }
    fun get_name(): String {
        return this.name
    }
    fun get_locations(): String{
        return  this.location
    }

    fun set_location(place: String){
        this.location= place
    }


}

class shape(
    private val vertices: Int= 3,
    private var colour : String= "green",
    private val name:String
):obj(name = name, location = "default shape location"){
init {
    println("additionally $name is a shape")
}

}