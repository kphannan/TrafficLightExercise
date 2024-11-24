package kata.exercises.trafficlight;


import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.Assert;
// import org.junit.Test;
import org.junit.jupiter.api.Test;



/**
 * Unit tests.
 */
public class TrafficLightTest
{
    @Test
    public void verifyYellowFollowsGreen()
    {
        assertEquals( TrafficLight.YELLOW, TrafficLight.GREEN.next() );
    }

    @Test
    public void verifyGreenFollowsRed()
    {
        assertEquals( TrafficLight.GREEN, TrafficLight.RED.next() );
    }

    @Test
    public void verifyRedFollowsYellow()
    {
        assertEquals( TrafficLight.RED, TrafficLight.YELLOW.next() );
    }


    @Test
    public void verifyRedDuration()
    {
        assertEquals( 8, TrafficLight.RED.getDuration() );
    }


    @Test
    public void verifyGreenDuration()
    {
        assertEquals( 6, TrafficLight.GREEN.getDuration() );
    }

    @Test
    public void verifyYellowDuration()
    {
        assertEquals( 2, TrafficLight.YELLOW.getDuration() );
    }
}
