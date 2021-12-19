package taskfour;

import java.util.HashSet;

public class Pet {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Simba");
        Cat cat2 = new Cat("Leo");
        Cat cat3 = new Cat("Luna");

        Dog dog1 = new Dog("Lola");
        Dog dog2 = new Dog("Rocky");
        Dog dog3 = new Dog("Jack");

        HashSet<String> pet = new HashSet<>();
        pet.add(String.valueOf(cat1));
        pet.add(String.valueOf(cat2));
        pet.add(String.valueOf(cat3));
        pet.add(String.valueOf(dog1));
        pet.add(String.valueOf(dog2));
        pet.add(String.valueOf(dog3));

        pet.forEach(System.out::println);
    }


}

