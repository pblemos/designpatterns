package com.pedrolemos.creational.builder;

public class CakeBuilder {
    private double flour = 0;
    private int eggs = 0;
    private double sugar = 0;

    public Cake build() {
        return new Cake(this);
    }

    public CakeBuilder addFlour(double flour){
        this.flour = flour;
        return this;
    }

    public CakeBuilder addEggs(int eggs){
        this.eggs = eggs;
        return this;
    }

    public double getFlour() {
        return flour;
    }

    public int getEggs() {
        return eggs;
    }

    public double getSugar() {
        return sugar;
    }

    public CakeBuilder addSugar(double sugar){
        this.sugar = sugar;
        return this;
    }
}
