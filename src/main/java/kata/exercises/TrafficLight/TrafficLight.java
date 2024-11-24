package kata.exercises.trafficlight;

public enum TrafficLight
{
    RED( 8 )
        {
            public TrafficLight next() { return GREEN; }
        }
    ,GREEN(6)
        {
            public TrafficLight next() { return YELLOW; }
        }
    ,YELLOW(2)
        {
        public TrafficLight next() { return RED; }
        };

    private TrafficLight( int onDuration )
    {
        onTime = onDuration;
    }

    public int      getDuration()             { return onTime; }
    public abstract TrafficLight next();

    private int onTime;
}
