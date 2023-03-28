package com.bytelegend;

import java.util.Arrays;
import java.util.List;

public class World {
    public static List<Object> objects =
            Arrays.asList(
                    new Cat("Tom"),
                    new Car(),
                    new Bird(),
                    new Fish("Nemo"),
                    new Plane(),
                    new Butterfly());

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everyFlyableObjectFly() {
        for (Object obj : objects) {
            if (obj instanceof Butterfly) {
                ((Butterfly) obj).fly();
            } else if (obj instanceof Plane) {
                ((Plane) obj).fly();
            } else if (obj instanceof Bird) {
                ((Bird) obj).fly();
            }
        }
    }

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everySoundMakerMakeSound() {
        for (Object obj : objects) {
            if (obj instanceof Cat) {
                ((Cat) obj).makeSound();
            } else if (obj instanceof Car) {
                ((Car) obj).makeSound();
            } else if (obj instanceof Bird) {
                ((Bird) obj).makeSound();
            }
        }
    }

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everyAnimalBreath() {
        for (Object obj : objects) {
            if (obj instanceof Cat) {
                ((Cat) obj).breath();
            } else if (obj instanceof Bird) {
                ((Bird) obj).breath();
            } else if (obj instanceof Fish) {
                ((Fish) obj).breath();
            } else if (obj instanceof Butterfly) {
                ((Butterfly) obj).breath();
            }
        }
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

class Pet {}

class Car {
    public void makeSound() {
        System.out.println("BEEP BEEP");
    }
}

class Bird {
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

class Butterfly {
    public void breath() {
        System.out.println("Butterfly is breathing");
    }

    public void fly() {
        System.out.println("Butterfly is flying");
    }
}

class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public void breath() {
        System.out.println("Cat " + name + " is breathing");
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}

class Fish {
    private final String name;

    public Fish(String name) {
        this.name = name;
    }

    public void breath() {
        System.out.println("Fish " + name + " is breathing");
    }
}

class Plane {
    public void fly() {
        System.out.println("Plane is flying");
    }
}
