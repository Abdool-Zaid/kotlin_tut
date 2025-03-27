// logic opperators && || !
fun main() {
    val arr= Array(10){Math.random()*10}
for ((index, i) in arr.withIndex()){ // have to call withIndex() if you want the index
    if (index % 2 == 0) continue // skips even numbers
    println("$index = $i")
}
    var i=1
 while (i <= 10){
     println(i)
     i++
 }
    var  ind= 1
    while (true){

        println(ind)
       if(ind++  == 10) break
    }
}



