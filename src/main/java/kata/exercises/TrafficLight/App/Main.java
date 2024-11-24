package kata.exercises.trafficlight.app;

import static kata.exercises.trafficlight.TrafficLight.RED;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;


public class Main
{
    public static boolean isRunning()
    {
        return true;
    }

    public static void main( String[] args )
    {
        try
        {
            TrafficLight currentSignal = RED;
            while ( isRunning() )
            {
                log.info( currentSignal );
                TimeUnit.SECONDS.sleep( currentSignal.getDuration() );
                currentSignal = currentSignal.next();
            }
        }
        catch ( InterruptedException e )
        {
            e.printStackTrace();
        }
    }

    private static Logger             log      = LogManager.getLogger();

}
