package com.shahrukh.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input){
        /*log.debug("processing car: " + input);
        it can be put outside like above, but concatination may take time, if there are objects
        within objects.
        so we would only like to prepare string for logging if this would actually be logged
        because if we say log.info, logging frameworks finds that this doesnt have to belogged,
        it would throw away all the string that were concatinated, then we would have done this without any need
        we can also do isInfoEnabled. now with log4j and sl4j enabled there is a smarter way
        we can do log.debug("processing car: {}", input);
        in which the framework decides the user wants to log on debug, first of all
        check, is debug enabled for this class, if it is, then only tale the input and
        concatinate it.
        */
        /*if (log.isDebugEnabled()){
            log.debug("processing car: " + input);
        }*/
        // log.debug("processing car: {}", input);
        // we can also log on different levels like error, but debug includes error too
        //like log.error or log.warn, or log.info
        log.warn("processing car: {}", input);
        //an INFO we use, when the users starts or the program starts so the users find that everything is working fine

    }

    //////////////////INTERFACES//////////////////////
    /*
    an interface is also like an abstract type, in our case what is this type doing
     */
    public void drive(Car car) {
        BMW bmw = new BMW();
        Porsche porsche = new Porsche("marcus");
        Mercedes mercedes = new Mercedes();

        bmw.drive();
        porsche.drive();
        mercedes.drive();
    }
}
