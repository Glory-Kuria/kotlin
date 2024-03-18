fun main(){
    println(sum(30,40))
   greet("Yar")
    println(calculateArea(5.0,3.14))
   println(calcArea(20, 10))
   println(isAdult(20))
}
fun sum( a:Int,b:Int):Int{
   val sum=a+b
   return sum
   }
fun greet(name:String){
      var sentence="Hi my name is $name"
     println(sentence)
  }
fun calculateArea(radius:Double,pi:Double): Double{
   return pi*radius*radius
}

fun calcArea(l:Int,w:Int):Int{
    return l*w
}
fun isAdult(age:Byte):Boolean{
 var adult= age >= 18
   return adult
}
