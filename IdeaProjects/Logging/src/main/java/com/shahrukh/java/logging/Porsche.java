package com.shahrukh.java.logging;

public class Porsche implements Car, Cloneable{

    private String ownersName;

    public Porsche(String ownersName) {
        this.ownersName = ownersName;
    }

    public void sellTo(String ownersName){
        this.ownersName=ownersName;
    }

    public String asString(){
        return "Porsche of " + ownersName;
    }

    public void drive() {
        System.out.println("Porsche driving...");
    }

    @Override
    public Porsche clone(){
        try {
            return (Porsche) super.clone();
            /*
            in order to properly use clone we have to override the clone method, so that it is public,
            use not Object here, use the type of Class you are in
            throw a new Assertion error, which will show you incase you forgot to implement Cloneable
            however, it achieves a shallow clone, which means if there are objects that arent immutable,
            and you then operate on those object, this can break other objects, as you are not totally independent
            for example in line 5 if there would be private Name ownersName; it would only copy the reference,
            if we want to achieve private String ownersName;
            you have to implement on more complex clone method,call clone on internal objects,
            and then assign the new cloned value to internal attributes, which would only work if they arent final
            so it is a limitation to clone.
            as we already show alternatives, in BMW.java

            //Ist Alternative to Clone
            //Copy constructor

            //2nd Alternative
            //Static factory method //Recursive method //prefer this, it is shorter
             */
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
