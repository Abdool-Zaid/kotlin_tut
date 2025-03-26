fun main() {
    val byt_val :Byte= 127 // max = (2^7) -1 8 bits
    val short_val : Short= 32767 // max (2^15)-1 16 bits
    val int_val : Int =  2147483647  // max (2^31) -1 32 bits
    val long_val : Long = 9223372036854775807 // max(2^63) -1 64 bits
    val float_val : Float= 67.12f // must end with f  mantissa 6-7 32 bits
    val double_val : Double = 67.67867823768 // mantissa 15-16 64 bits
    val char_val : Char ='s' // must be single quote
    val bool_val : Boolean = true


    println(bool_val)

//    var inp_1 = 34
//    val inp_2 = "string of characters"
//    println("test")// prints to a new line
//    println(inp_1) // prints but does not move to new line
//
//    val late_ex_1 = lateinit_1()
//        late_ex_1.get_arg_1()

}


class lateinit_1 {
    lateinit var arg_1: String  //lateinit allows for valueless declarations

    fun set_arg_1 (set_var: String){
            arg_1= set_var
    }

    fun get_arg_1(){
         if (::arg_1.isInitialized){
             println(arg_1)
         }else{
             println("arg_1 is not initialized")
         }

    }



}