package kata.exercises.trafficlight;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



/**
 * Unit tests.
 */
class TrafficLightTest
{
    @Test
    void verifyYellowFollowsGreen()
    {
        assertEquals( TrafficLight.YELLOW, TrafficLight.GREEN.next() );
    }

    @Test
    void verifyGreenFollowsRed()
    {
        assertEquals( TrafficLight.GREEN, TrafficLight.RED.next() );
    }

    @Test
    void verifyRedFollowsYellow()
    {
        assertEquals( TrafficLight.RED, TrafficLight.YELLOW.next() );
    }


    @Test
    void verifyRedDuration()
    {
        assertEquals( 8, TrafficLight.RED.getDuration() );
    }


    @Test
    void verifyGreenDuration()
    {
        assertEquals( 6, TrafficLight.GREEN.getDuration() );
    }

    @Test
    void verifyYellowDuration()
    {
        assertEquals( 2, TrafficLight.YELLOW.getDuration() );
    }
}
