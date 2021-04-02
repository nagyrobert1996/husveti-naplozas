package pkg;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    private static final Marker KIJELENTES = MarkerManager.getMarker("KIJELENTES");
    private static final Marker KERELEM = MarkerManager.getMarker("KERELEM");

    public static void main(String[] args) throws Exception{

        int szam = Integer.parseInt(args[0]);
        for (int i = 1; i <= szam; i++){
            Thread.sleep(5000);
            ThreadContext.push(String.valueOf(i));
            logger.info("Zöld erdőben jártam");
            logger.trace(KIJELENTES, "Kék ibolyát láttam");
            logger.warn(KIJELENTES, "El akart hervadni");
            logger.debug(KERELEM, "Szabad-e locsolni?");
            ThreadContext.pop();
        }

    }
}
