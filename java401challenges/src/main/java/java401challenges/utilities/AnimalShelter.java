package java401challenges.utilities;

import java.util.LinkedList;

public class AnimalShelter {

    public static class Dog {}
    public static class Cat {}

    public LinkedList<Dog> dogs;
    public LinkedList<Cat> cats;


    public AnimalShelter() {
        this.dogs = new LinkedList<>();
        this.cats = new LinkedList<>();
    }


    public void enQueue(Dog dog) {
        this.dogs.add(dog);
    }

    public void enQueue(Cat cat) {
        this.cats.add(cat);
    }

    //Referenced type-parameterized from Michelle
    public <T> T dequeue(Class<T> type) {
        if(type == Dog.class) {
            return (T)this.dogs.poll();
        } else if (type == Cat.class) {
            return (T)this.cats.poll();
        } else {
            throw new IllegalArgumentException("This shelter only supports cats and dogs.");
        }
    }

}
