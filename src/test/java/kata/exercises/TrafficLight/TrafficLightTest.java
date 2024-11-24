package kata.exercises.trafficlight;

import org.junit.Assert;
import org.junit.Test;

public class TrafficLightTest
{
    @Test
    public void verifyYellowFollowsGreen()
    {
        Assert.assertEquals( TrafficLight.YELLOW, TrafficLight.GREEN.next() );
    }

    @Test
    public void verifyGreenFollowsRed()
    {
        Assert.assertEquals( TrafficLight.GREEN, TrafficLight.RED.next() );
    }

    @Test
    public void verifyRedFollowsYellow()
    {
        Assert.assertEquals( TrafficLight.RED, TrafficLight.YELLOW.next() );
    }


    @Test
    public void verifyRedDuration()
    {
        Assert.assertEquals( 8, TrafficLight.RED.getDuration() );
    }


    @Test
    public void verifyGreenDuration()
    {
        Assert.assertEquals( 6, TrafficLight.GREEN.getDuration() );
    }

    @Test
    public void verifyYellowDuration()
    {
        Assert.assertEquals( 2, TrafficLight.YELLOW.getDuration() );
    }
}
