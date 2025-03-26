

fun main() {
    val  string_val : String = "string goes here" // immutable
    val  multiline_string : String ="""
        string
        goes 
        here
    """.trimMargin()

    println("string val = $string_val") // string template
    println(" length = ${string_val.length}") // need braces for expressions
    println(multiline_string)
    println(string_val.substring(0,4)) // runs till before arg2



//string builders and string buffers are mutable

    val string_build =StringBuilder() //not thread safe
    val string_buffer = StringBuffer("buffered")  // thread safe
}


