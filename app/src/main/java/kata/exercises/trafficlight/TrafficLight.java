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

    private final int onTime;


    /**
     * Create a traffic light Enumeratoin.
     *
     * @param onDuration how long a state should remain 'on'.
     */
    TrafficLight( final int onDuration )
    {
        onTime = onDuration;
    }

    /**
     * Get the time this light state is to remain active.
     *
     * @return time in ms the light state is to remain 'on'.
     */
    public int      getDuration()
    {
        return onTime;
    }

    /**
     * Advance to the next state in the light sequence.
     *
     * @return the next light state in the sequence.
     */
    public abstract TrafficLight next();
}
