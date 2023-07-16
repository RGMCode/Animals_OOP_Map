package RGMCode;

import java.util.HashMap;
import java.util.Map;

public class AnimalService {

    Dog dog = new Dog();

    public Map<Integer, Dog> listDogs(){
        Map<Integer, Dog> dogs = new HashMap<>();
        dogs.put(1,new Dog(1,"Sunny", 35.5, "Cracker"));
        dogs.put(2,new Dog(2,"Sky", 16.5, "Cheese"));
        return dogs;
    }

    Cat cat = new Cat();

    public Map<Integer, Cat> listCats(){
        Map<Integer, Cat> cats = new HashMap<>();
        cats.put(1,new Cat(1, "Mimi", 25.3, "Mäuse"));
        cats.put(2,new Cat(2, "Garfield", 21.9, "Whiskas"));
        return cats;
    }

    public Map<Integer, Mouse> listMouse(){
        Map<Integer, Mouse> mouse = new HashMap<>();
        mouse.put(1, new Mouse(1,"Speedy", 2.3, "Cheddar-Cheese"));
        mouse.put(2, new Mouse(2,"Micky", 5.2, "Beeren"));
        return mouse;
    }


}
