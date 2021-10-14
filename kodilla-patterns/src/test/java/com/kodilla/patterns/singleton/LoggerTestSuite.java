package com.kodilla.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

/*   pierwsza czêœæ zadania
    @Test
    void testGetLastLog() {
        //Given
        Logger logger = new Logger();

        //When
        logger.log("ExampleLogName");
        String logName = logger.getLastLog();

        //Then
        assertEquals("ExampleLogName", logName);
    }
 */

    // druga czêœæ zadania, u¿ycie Singletona
    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.LOG;

        //When
        String logName = logger.getLastLog();

        //Then
        assertEquals("Wednesday", logName);
    }
}
