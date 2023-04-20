 open class animal (val name : String , val age : Int ,) {
           open fun sleep() = println(" is sleeping")
}
 class cat (name: String,age: Int , color : String ) : animal(name, age){
     public var color = color
     fun scratch()= println("$name is scratching")
 }

 class dog (name: String,age: Int , breed : String ) : animal(name, age){
     public var breed = breed
     fun bark()= println("$name is barking")
 }
 fun iterateoveranimal(list2: MutableList< out animal>) {
     for (Animal in list2){
         if(Animal is dog){
             print("${Animal.name} , ${Animal.breed}")
     }
         else if (Animal is cat){
         print("${Animal.name} , ${Animal.color}")
         }
         Animal.sleep()
 }}
 fun AreYouOld(list2: MutableList< out animal>){
     for (item in list2){
         if (item.age > 20){
             println("${item.name} is oldddd!")
         }}}
fun main(){
    var list1 :MutableList< out animal> = mutableListOf(cat ("pishi",22 ,"red") ,dog("hapoo",12,"unknown") )
    val doggi = dog("happo",21,"golden")
    doggi.bark()
    iterateoveranimal(list1)
    AreYouOld(list1)}