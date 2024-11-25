package kata.exercises.trafficlight.app;

import static kata.exercises.trafficlight.TrafficLight.RED;

import java.util.concurrent.TimeUnit;

import kata.exercises.trafficlight.TrafficLight;



/**
 * Traffic light application.
 */
public final class App
{
    // private static final Logger       log      = Logger.getLogger( App.class );

    private App()
    {
        // Nothing to initialize
    }

    public static boolean isRunning()
    {
        return true;
    }


    /**
     * Main entry point.
     *
     * @param args commandline arguments.
     */
    public static void main( String[] args )
    {
        try
        {
            TrafficLight currentSignal = RED;
            while ( isRunning() )
            {
                // log.info( currentSignal );
                TimeUnit.SECONDS.sleep( currentSignal.getDuration() );
                currentSignal = currentSignal.next();
            }
        }
        catch ( InterruptedException e )
        {
            e.printStackTrace();
        }
    }
}
