package hu.bme.mit.train.sensor;

import com.google.common.collect.Table;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

public class Tachograph implements TrainSensor {
    
    DateAndTime currentTime;
    Integer joystickpos;
    Integer referenceSpeed;

    Table<DateAndTime, Integer, Integer> tachograph = HashBasedTable.create();

    public Tachograph() {
        //TODO
    } 

}
