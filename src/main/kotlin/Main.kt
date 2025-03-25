fun main() {
    var inp_1 = 34
    val inp_2 = "string of characters"
    println("test")// prints to a new line
    println(inp_1) // prints but does not move to new line

    val late_ex_1 = lateinit_1()
        late_ex_1.get_arg_1()

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