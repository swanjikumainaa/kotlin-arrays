fun main() {

    one()
    two()
    three()
    var a = four("Susan","Maina","Blaire")
    println(a)
}

fun one(){
    var names =arrayOf("Joan","Risper","Mercy","Suzzie","Blaire")
    println(names.contentToString())
}

fun two() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (x in cities)
        println(x.capitalize())



}
fun three(){
    var numbers =arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)

    var sumNumbers = numbers.get(2)+(numbers.get(5))
    println(sumNumbers)

    var index = numbers.indexOf(158)
    println(index)
    var sortedArray =  numbers.sortedArray()
    println(sortedArray.contentToString())
}

fun four(x:String,y:String,z:String):String{
    var output = arrayOf(x,y,z)
    return output.contentToString()

}


