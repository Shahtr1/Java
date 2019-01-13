package com.shahrukh.java.lesson2;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING","PROCESSING","PROCESSED"}; //uppercase and underscores  are a best practice
    //for clean code provide a public method,we copy array
    private static final int SOMETHING = 40;
    private static final int PENDING = 41;
    private static final int PROCESSING = 42;

    private static final String PROCESSED = "PROCESSED"; //labels

    public String[] states(){
        return Arrays.copyOf(MY_STATE_VALUES,MY_STATE_VALUES.length);
    }


    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello World",marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus",person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        assertEquals(5,Person.numberOfPersons());
    }

    @Test
    public void loop(){
        Person person1;
        int i =0;
        while(i<4){
            person1 = new Person();
            i++;
        }
        assertEquals(4,Person.numberOfPersons());
    }

    @Test
    public void array(){
        Person[] persons = new Person[4];
        Person myPerson = new Person();
        persons[0] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        persons[3] = myPerson;
        myPerson = persons[2];

        persons[1] = null; //Put nothing here

       /*for(int i = 0;i<4;i++){
           persons[i] = new Person();
           //persons[i].helloWorld();
       }*/

       for(Person person : persons){
           person.helloWorld();
       }
       Person myPerson2 = null;
       Person[] persons2 ={};//there should be an array and the size is automatically calculated
       Person[] persons3 ={persons[0] , null , myPerson , myPerson2};//short form
       //persons3[0] will get persons[0]

        "ABC".equals(null); //will return false
        String myString = null;
        /*
        myString.equals("ABC"); // null == "ABC" will throw an error
        */
        /*LoggingLevel state = LoggingLevel.PENDING;
        state = LoggingLevel.PROCESSED;
        //or
        state = LoggingLevel.PROCESSING;
        //only these three
        */

        LoggingLevel state = LoggingLevel.PROCESSING;
/*
        if(state.isPending()){
            //which would be false
        }*/
        //Avoid ints in switch statement
        //someone would write anything myState = 300; and the case would go to default
        /*in JAVA7 we can use also strings, we can switch on strings
            switch (myString){
            case "....": blank string
            case "something":
            also we can use final static strings.. line 18.. labels
            case PROCESSED:
            break;
            default:
            }
        */
        /*
        Also there is a char datatype,use single quotes
        char myState = 'a'; only one character
         */
        int myState = PENDING; //for enums use state instead of myState
       switch (myState){ //not on the enum anymore
           case PENDING:
/*
falls through // which tells the reader ,  know whats happening
 */
           case PROCESSING:
               /*
falls through // which tells the reader ,  know whats happening
 */
           case PROCESSED:
               callMeMethod();
               break;
           default:
               //we would see this if someone extends the enum
               //there is a rule called fail ally to have a back. so be brave and throw exceptions.
               /*
               throw Error
                */
       }

       /*
        for(LoggingLevel state: LoggingLevel.values()){
            //values() will give us an array of all the allowed variables
            // we could say    state = "BLAAAA" we actually want the value final, but final only protects the variable, so we use enum.
            //"" only for strings not for enums
            //we use .equals to compare strings
            if(state == LoggingLevel.PENDING){

            }
            if (state == LoggingLevel.PROCESSING){

            }
            //PROCESSING and PENDING isn't the object its just a static value, and only objects can be compared, but java does the magic
        } */

    }

    @Test
    public void dynamicArray(Person[] persons){

        for(int i = 0;i<persons.length;i++){
            persons[i] = new Person();
            //persons[i].helloWorld();
        }

        for(Person person : persons){
            person.helloWorld();
        }
    }
}













