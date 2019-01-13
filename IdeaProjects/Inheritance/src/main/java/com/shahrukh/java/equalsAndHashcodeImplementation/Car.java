package com.shahrukh.java.equalsAndHashcodeImplementation;

public class Car {
    private Vin vehicleIdentificationNumber;
    private Manufacturer manufacturer;
    private Engine engine;
    private Color color;
    private int numberOfWheels;

    @Override
    public boolean equals(Object obj){
        //See the order for performance optimization
        if(this == obj){
            return true;
        }
        if(obj == null){ //important otherwise object.getClass() will throw a nullPointerException
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Car other = (Car) obj; // as we are sure they both are of Car class we can caste an object to a car

        if(!manufacturer.equals(other.manufacturer)){
            return false;
        }
        if(!engine.equals(other.engine)){
            return false;
        }
        if(!color.equals(other.color)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        int result = 1;
        /*
        31 is a prime number, is multiplied with result and it takes the hashcode of the field
        The below is the optimization to have less collisions,
         */
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + engine.hashCode();
        return 31 * result + color.hashCode();
    }

}
