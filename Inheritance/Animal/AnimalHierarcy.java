package Inheritance.Animal;

public class AnimalHierarcy {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        Animal[] animals = {dog, cat, bird};
        for (Animal a : animals) {
            a.makeSound();
        }

        dog.fetch();
        cat.scratch();
        bird.fly();
    }
}
