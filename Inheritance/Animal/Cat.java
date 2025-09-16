package Inheritance.Animal;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (Cat): Meow! Meow!");
    }

    public void scratch() {
        System.out.println(name + " is scratching the furniture!");
    }
}
