package cyclicbarrier.ferry;

import cyclicbarrier.transportation.TransportationTime;
import cyclicbarrier.car.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;


public class Ferry implements Runnable{
    private static Logger logger = LogManager.getLogger(Ferry.class.getName());
    private static final CyclicBarrier barrier = new CyclicBarrier(5,new TransportationTime());

    public  void run() {
        for (int i = 0; i < 10; i++) {
            new Thread(new Car(i,barrier)).start();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                logger.error(e);
            }
        }
    }
}
