package com.shahrukh.java.logging;

import org.junit.Test;

public class CarSelectorTest {

    /*
    this sis based on framework JUNIT
    junit has a main method, we just write test methods, the test methods just plug into the
    whole junit code, so we dont have to write main method
    thats why it is handy, as it avoids us to use our own main method
    we can actually even execute a main method as it is a regukar main method as shown below
     */
    @Test
    public void shouldCallMain(){
        String[] arguments = {"BMW","Porsche"};
        CarSelector.main(arguments);
    }
}
