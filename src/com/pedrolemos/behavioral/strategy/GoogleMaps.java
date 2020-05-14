package com.pedrolemos.behavioral.strategy;

public class GoogleMaps {
    public static void main(String[] args) {
        User pedro = new User();
        pedro.setTransport(new Foot());
        pedro.goToWork();
        pedro.setTransport(new Car());
        pedro.goToWork();
        pedro.goElsewhere(30);
    }
}
