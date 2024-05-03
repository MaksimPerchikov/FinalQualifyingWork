package ru.fqw.service;

import org.springframework.stereotype.Component;

@Component
public class TimerService {

    public double timerStartStop() {
        return System.currentTimeMillis();
    }

    public void result(double start, double stop) {
        double elapsedTime = stop - start;
        System.out.println("Затраченное время на исполнение метода: " + elapsedTime + " миллисекунд");
    }
}
