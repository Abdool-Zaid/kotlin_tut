import kotlin.reflect.typeOf

fun main(){

    try {
    val res = "2423sdf"
        val final = res.toInt()
    }catch (e: NumberFormatException){
        print(e.message)
    }catch (e:Exception){
    print(e)
    }finally {
        print("always executed, with or without error")
    }

}
