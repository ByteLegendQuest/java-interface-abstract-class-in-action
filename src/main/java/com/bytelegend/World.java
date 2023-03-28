package com.bytelegend;

import java.util.Arrays;
import java.util.List;

public class World {
    public static List<Object> objects = Arrays.asList(
            new Cat("Tom"),
            new Car(),
            new Bird(),
            new Fish("Nemo"),
            new Plane(),
            new Butterfly());

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`,
     * and appreciate
     * the benefits of polymorphism.
     */
    public static void everyFlyableObjectFly() {
        objects.stream().filter(obj -> obj instanceof Flyable).forEach(obj -> ((Flyable) obj).fly());
    }

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`,
     * and appreciate
     * the benefits of polymorphism.
     */
    public static void everySoundMakerMakeSound() {
        objects.stream().filter(obj -> obj instanceof SoundMaker).forEach(obj -> ((Flyable) obj).fly());
    }

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`,
     * and appreciate
     * the benefits of polymorphism.
     */
    public static void everyAnimalBreath() {
        objects.stream().filter(obj -> obj instanceof Animal).forEach(obj -> ((Flyable) obj).fly());
    }
}

interface Flyable {
    void fly();
}

interface Animal {
    void breath();
}

interface SoundMaker {
    void makeSound();
}

abstract class Pet implements Animal {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car implements SoundMaker {
    public void makeSound() {
        System.out.println("BEEP BEEP");
    }
}

class Bird implements Animal, SoundMaker, Flyable {
    public void breath() {
        System.out.println("Bird is breathing");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

class Butterfly implements Animal, Flyable {
    public void breath() {
        System.out.println("Butterfly is breathing");
    }

    public void fly() {
        System.out.println("Butterfly is flying");
    }
}

class Cat extends Pet implements SoundMaker {
    public Cat(String name) {
        super(name);
    }

    public void breath() {
        System.out.println("Cat " + this.getName() + " is breathing");
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}

class Fish extends Pet {
    public Fish(String name) {
        super(name);
    }

    public void breath() {
        System.out.println("Fish " + this.getName() + " is breathing");
    }
}

class Plane implements Flyable {
    public void fly() {
        System.out.println("Plane is flying");
    }
}
