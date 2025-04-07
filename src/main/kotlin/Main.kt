fun main(){
println("test_string_1".call())
}
fun String.call():String{

    return "called by String: ${this}"
}