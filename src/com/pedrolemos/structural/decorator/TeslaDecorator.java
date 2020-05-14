package com.pedrolemos.structural.decorator;

public class TeslaDecorator implements Tesla {
    private Tesla decoratedTesla;

    public TeslaDecorator (Tesla decoratedTesla) {
        this.decoratedTesla = decoratedTesla;
    }

    @Override
    public String getExtras() {
        return decoratedTesla.getExtras();
    }

    @Override
    public int getPrice() {
        return decoratedTesla.getPrice();
    }
    @Override
    public String toString() {
        return getExtras() + ". Price: " + getPrice() + "€";
    }
}
