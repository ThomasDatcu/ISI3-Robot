package robot;

/**
 * Created by thomas on 27/04/16.
 */

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Random;

public class LandSensorUnitTest {

    @Test
    public void testGetPointToPointEnergyCoefficient(){
        LandSensor landSensor = new LandSensor(new Random());
        Coordinates c1 = new Coordinates(4,6);
        Coordinates c2 = new Coordinates(1,2);
        double res = landSensor.getPointToPointEnergyCoefficient(c1,c2);
        double d = landSensor.distance(c1,c2);
        double resSup = 1 + d / (d *landSensor.getValRand());
        assertEquals(resSup,res,0);
    }

    @Test
    public void testDistance(){

        LandSensor landSensor = new LandSensor(new Random());
        Coordinates c1 = new Coordinates(4,6);
        Coordinates c2 = new Coordinates(1,2);
        assertEquals(5,landSensor.distance(c1,c2),0);

    }
}
