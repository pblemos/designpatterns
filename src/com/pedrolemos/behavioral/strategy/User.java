package com.pedrolemos.behavioral.strategy;

public class User {
    private Transport transport;

    public void goToWork() {
        transport.goTo(10);
    }

    public void goHome() {
        transport.goTo(15);
    }

    public void goElsewhere(int km) {
        transport.goTo(km);
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
