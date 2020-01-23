package java401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalShelterTest {
    AnimalShelter humaneSociety = new AnimalShelter();
    @Before
    public void setUp() {
        AnimalShelter.Dog d1 = new AnimalShelter.Dog();
        AnimalShelter.Dog d2 = new AnimalShelter.Dog();
        AnimalShelter.Cat c1 = new AnimalShelter.Cat();

        humaneSociety.enQueue(d1);
        humaneSociety.enQueue(c1);
        humaneSociety.enQueue(d2);
    }

    @Test
    public void enQueueTest() {
        assertEquals("should have only 1 cat", 1,humaneSociety.cats.size());
        assertEquals("should have 2 dogs", 2,humaneSociety.dogs.size());
    }

    @Test
    public void deQueueTest() {
        AnimalShelter.Cat c2 = new AnimalShelter.Cat();
        AnimalShelter.Cat c3 = new AnimalShelter.Cat();
        humaneSociety.enQueue(c2);
        humaneSociety.enQueue(c3);
        assertTrue(c2 == humaneSociety.dequeue(AnimalShelter.Cat.class));
    }

}
