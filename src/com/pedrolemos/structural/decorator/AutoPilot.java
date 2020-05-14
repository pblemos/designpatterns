package com.pedrolemos.structural.decorator;

public class AutoPilot extends TeslaDecorator {
    public AutoPilot(Tesla decoratedTesla) {
        super(decoratedTesla);
    }

    @Override
    public String getExtras() {
        return super.getExtras() + ", AutoPilot 2.0 (+1500€)";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1500;
    }
}
