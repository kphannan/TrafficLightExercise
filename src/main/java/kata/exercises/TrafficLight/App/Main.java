package kata.exercises.TrafficLight.App;

import kata.exercises.TrafficLight.TrafficLight;

import java.util.concurrent.TimeUnit;

import static kata.exercises.TrafficLight.TrafficLight.RED;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


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
