package com.pedrolemos.behavioral.strategy;

public class Foot implements Transport{
    private final int walkingSpeed = 10; //10 minutes per km = 6km/h

    @Override
    public void goTo(int km) {
        System.out.println("You'll take " + (walkingSpeed * km) + " minutes by foot. (" + km + " km)");
    }
}
