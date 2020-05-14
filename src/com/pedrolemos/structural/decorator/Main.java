package com.pedrolemos.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Tesla tesla = new LongRange(new AutoPilot(new ModelS()));
        System.out.println(tesla);

        Tesla tesla2 = new LongRange(new ModelS());
        System.out.println(tesla2);

        Tesla tesla3 = new AutoPilot(new ModelS());
        System.out.println(tesla3);

        Tesla tesla4 = new LongRange(new ModelX());
        System.out.println(tesla4);
    }
}
