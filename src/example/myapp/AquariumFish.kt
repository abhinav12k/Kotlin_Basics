package example.myapp

/*Interface and abstract classes are used to implement common features*/
abstract class AquariumFish{
    abstract val color : String
}

interface FishAction{
    fun eat()
}

interface FishColor{
    val color:String
}

object GoldColor : FishColor{
    override val color: String = "Gold"

}

class shark : FishAction, FishColor{
    override val color: String = "grey"
    override fun eat() {
        println("Hunt and eat fish")
    }
}
//impelmenting delegations
class Plecostomus: FishAction, FishColor by GoldColor{
    override fun eat() {
        println("Eat algae")
    }
}

class Plecostomus1(fishColor: FishColor = GoldColor): FishAction, FishColor by fishColor{
    override fun eat() {
        print("Eats algae and small plants")
    }
}
