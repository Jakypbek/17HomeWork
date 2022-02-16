package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Animal[] animal = {new Eagle(), new Shark(), new Turtle()};

        for (Animal item : animal) {
            if (item instanceof Shark) {
                ((Shark) item).attack();
            } else if (item instanceof Eagle) {
                ((Eagle) item).fly();
            } else if (item instanceof Turtle) {
                ((Turtle) item).swim();
            }

        }

        for (Animal value : animal) {
            if (value.getClass().equals(Shark.class)) {
                ((Shark) value).attack();
            } else if (value.getClass().equals(Eagle.class)) {
                ((Eagle) value).fly();
            } else if (value.getClass().equals(Turtle.class)) {
                ((Turtle) value).swim();
            }

        }

        Shark[] sharks = new Shark[1];
        Eagle[] eagles = new Eagle[1];
        Turtle[] turtles = new Turtle[1];

        for (Animal value : animal) {
            if (value.getClass().equals(Shark.class)) {
                sharks[0] = ((Shark) value);
            } else if (value.getClass().equals(Eagle.class)) {
                eagles[0] = ((Eagle) value);
            } else if (value.getClass().equals(Turtle.class)) {
                turtles[0] = ((Turtle) value);
            }
        }


    }
}
