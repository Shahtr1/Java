package com.shahrukh.java.logging;


import org.junit.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateLogging(){
        CarService carService = new CarService();
        carService.process("BMW");
    }

    @Test
    public void shouldDemonstrateInterfaces(){
        CarService carService = new CarService();
        Car car;
        if(true){
            car = new Porsche("marcus");
        }else{
         //   car = new BMW();
        }
        carService.drive(car);
    }
}

