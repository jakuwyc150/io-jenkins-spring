package pl.zajecia.jenkinsdodawanie;

import static org.junit.Assert.*;

public class Test {
    @org.junit.Test
    public void add() {
        JenkinsDodawanieApplication application = new JenkinsDodawanieApplication();
        assertEquals(10, application.add(5, 5));
    }
}