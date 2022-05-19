package cyclicbarrier.transportation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class TransportationTime implements Runnable{
    private static Logger logger = LogManager.getLogger(TransportationTime.class.getName());
    @Override
    public void run() {
        logger.info("The Ferry is ferrying the cars to the other island");
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            logger.error(e);
        }
        logger.info("The ferry is arrived in island with vehicles!");
    }
}
