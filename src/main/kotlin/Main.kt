fun main() {
  var woman = Human("Maureen",23,52)
    woman.eat(6)
   woman.speak("I am in Hopper class")
    woman.age
    println(woman.age)
    woman.birthday(1)
 println( woman.age)

    var information = User("Maureen","Akinyi","ougomaureen051@gmail.com","0743515249","2647673gydgygdv")
   println(information.firstName)
    println(information.phoneNumber)



}

class Human(var name: String, var age:Int, var weight: Int){
    fun eat(foodWeight: Int){
      println("i am eating $foodWeight kg of food")
        weight +=foodWeight
        println("Food and my weight is $weight in kg")
    }
    fun speak(speech: String){
        println(speech)
    }
     fun birthday(increament: Int): Int{
         age += increament
         return age

     }
}



data class User( var firstName: String,var Lastname: String,var email: String, var phoneNumber: String,  var password : String){


}