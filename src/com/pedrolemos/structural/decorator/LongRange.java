package com.pedrolemos.structural.decorator;

public class LongRange extends TeslaDecorator {
    public LongRange(Tesla decoratedTesla) {
        super(decoratedTesla);
    }

    @Override
    public String getExtras() {
        return super.getExtras() + ", Long Range (+500€)";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }
}