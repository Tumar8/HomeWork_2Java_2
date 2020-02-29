package com.company;


public class Tor extends com.company.MarvelCinematicUniverse {


    private Object Tor;

    public Tor(String tor, String name, String power, int age) {
        super(name, power, age);
        this.Tor = new Tor();

    }

    public Tor() {
        super();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tor" + " " + getTor() + "\n" + "name " + "-" + getName() + "\n" + "power" + "-" + getPower() + "\n" + "age" + "-" + getAge());
    }

    private String getPower() {
        return null;
    }

    private String getTor() {
        return null;
    }
}