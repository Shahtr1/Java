package com.shahrukh.java.logging;

// A deep copy means that not only BMW is copied but also all the objects inside of it,
// A shallow copy will only copy the reference and the object for name and the object for name as well as object for color would be same for shallow copy
//if using clone, we have to make a deep copy, we also have to use clone on internal objects

public class BMW implements Car, Loggable, Asset, Property{
    public void drive() {
        System.out.println("BMW driving...");
    }

    public int value(){
        return 80000;
    }

    public String owner(){
        return "Marcus";
    }

    public String message(){
        return "I am the car of Marcus";
    }

    private Name ownersName;
    private Color color;

//2nd Alternative
    //Static factory method
    public static BMW newInstance(BMW bmw){
        return new BMW(Name.newInstance(bmw.ownersName), Color.newInstance(bmw.color));
    }

//Ist Alternative to Clone
    //Copy constructor
    /*
    taking the internals, and creating new objects on it, so in the end we have
    the new object that has the same value as original
     */
    public BMW(){
        this.ownersName = new Name(bmw.ownersName);
        this.color = new Color(bmw.color);
    }

    public BMW(Name ownersName, Color color){
        this.ownersName = ownersName;
        this.color = color;
    }

    public void paint(Color newColor){
        //this.color = newColor;
        this.color.alterColor(newColor.name());
    }

    public void sellTo(Name newOwner){
        //this.ownersName = newOwner;
        this.ownersName.alterTo(newOwner.firstName(),newOwner.lastName());
    }

    public String asString(){
        return "BMW of " + ownersName.name() + " has color: " + color.name();
    }

    public BMW clone(){
        try{
            BMW bmw = (BMW) super.clone();
            bmw.ownersName = ownersName.clone();
            bmw.color = color.clone();
            return bmw;
        }catch (CloneNotSupportedException e){
            throw new AssertionError(); /*can never happen*/
        }
    }





}
