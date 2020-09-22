package kotlin_Java_Interop.statics;

public class Vehicle {
    String name;
    int seats;
    int wheels;
    float fuelTankCapactiy;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                ", wheels=" + wheels +
                ", fuelTankCapactiy=" + fuelTankCapactiy +
                '}';
    }

    private Vehicle(String name,int wheels,int seats,float fuelTankCapactiy){
        this.name = name;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTankCapactiy = fuelTankCapactiy;
    }

    public static Vehicle createFor(int passengers,int distance){

        if(passengers < 4){
            if(distance<40){
                return new Vehicle("Auto",3,3,12.5F);
            }else{
                return new Vehicle("Car",4,4,45.5F);
            }
        }else{
            if(distance<500){
                return new Vehicle("Tempo",4,20,100.0F);
            }else{
                return new Vehicle("Volvo",8,54,600.0F);
            }
        }

    }

}
