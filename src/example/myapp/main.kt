package example.myapp

fun buildAquarium(){
//    val myAquarium = Aquarium();
//    myAquarium.printSize()
//    myAquarium.height = 50
//    myAquarium.printSize()
//    val myAquarium1 = Aquarium(height = 120)
//    myAquarium1.printSize()
//    val myAquarium2 = Aquarium(numberOfFishses = 12)
//    myAquarium2.printSize()
//    println(myAquarium2.volume)
//    myAquarium2.volume = 20
//    println(myAquarium2.volume)

    /*Implementing subclasses and inheritance*/
    val myAquarium = Aquarium1(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish(){
    val shark = shark()
    val pleco = Plecostomus()

    println("Shark color: ${shark.color}")
    shark.eat()
    println("Pleco color: ${pleco.color}")
    pleco.eat()
}

fun main() {
//    buildAquarium();

    makeFish()
}
