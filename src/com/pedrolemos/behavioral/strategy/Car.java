package com.pedrolemos.behavioral.strategy;

public class Car implements Transport {
    private final int avgCarSpeed = 1; //1 minutes per km = 60km/h

    @Override
    public void goTo(int km) {
        System.out.println("You will take " + (avgCarSpeed * km) + " minutes by car. (" + km + " km)");
    }
}
