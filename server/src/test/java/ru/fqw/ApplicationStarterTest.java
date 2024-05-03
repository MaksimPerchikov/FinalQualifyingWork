package ru.fqw;

import org.junit.Before;
import org.junit.Test;
import ru.fqw.service.TimerService;

public class ApplicationStarterTest {

    private TimerService timerService;

    @Before
    public void setUp(){
        this.timerService = new TimerService();
    }

    @Test
    public void test1(){
        double start = timerService.timerStartStop();
        String result = "";
        for (int i = 0; i < 10; i++) {
            result = result.concat(String.valueOf(i));
        }
        System.out.println(result.length());
        double endTime = timerService.timerStartStop();;
        timerService.result(start, endTime);
    }

    @Test
    public void test2(){
        double start = timerService.timerStartStop();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            result.append(i);
        }
        System.out.println(result.length());

        double endTime = timerService.timerStartStop();;
        timerService.result(start, endTime);
    }
}
