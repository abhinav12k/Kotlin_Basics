package kotlin_Java_Interop.statics

class Automobile private constructor(
        val name: String,
        val wheels: Int,
        val seats: Int,
        val fuelTankCapacity: Float
) {

    override fun toString(): String {
        return "Automobile(name = $name ,wheels = $wheels, seats = $seats, fuelCapacity = $fuelTankCapacity)"
    }

    companion object {

        @JvmStatic
        fun createFor(passengers: Int, distance: Int): Automobile {
            return if (passengers < 4) {
                if (distance < 40) Automobile("Auto", 3, 3, 12.5f)
                else Automobile("Car", 4, 4, 45.5f)
            } else {
                if (distance < 500) Automobile("Tempo", 4, 20, 100.0f)
                else Automobile("Volvo", 8, 54, 600.0f)
            }
        }
    }
}