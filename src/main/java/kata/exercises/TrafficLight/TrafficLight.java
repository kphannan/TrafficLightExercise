package kata.exercises.trafficlight;


/**
 * Possible states of a traffic light.
 */
public enum TrafficLight
{
    RED( 8 )
    {
        @Override
        public TrafficLight next()
        {
            return GREEN;
        }
    }
    , GREEN( 6 )
    {
        @Override
        public TrafficLight next()
        {
            return YELLOW;
        }
    }
    , YELLOW( 2 )
    {
        @Override
        public TrafficLight next()
        {
            return RED;
        }
    };

    TrafficLight( int onDuration )
    {
        onTime = onDuration;
    }

    public int      getDuration()
    {
        return onTime;
    }

    public abstract TrafficLight next();

    private int onTime;
}
