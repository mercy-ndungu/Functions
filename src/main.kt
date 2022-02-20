fun main() {
    Hello()
    rem(9,2)
    num(3,4,6,5)
    fact()

}
fun Hello(){
    val name = "Kirigo"
    println("Hello "+name)

}
fun rem(a:Int,b:Int){
    var remainder = a%b
    println(remainder)
}
fun num(c:Int,d:Int,e:Int,f:Int){
    var sum =c+d+e+f
    println(sum)

}
fun fact(){
    println("I am a good cook.")
}