fun main(){
    val object_1 = obj(name = "object_1", location = "there")
    val  object_2 = obj(object_1)
}

class obj(
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