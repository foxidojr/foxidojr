

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Dog bimbo = new Dog("Bimbo", Breed.TERRIER);

        System.out.println(bimbo.toString());

        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog("Spike",Breed.BULLDOG));
        dogs.add(new Dog("Alice",Breed.TAKSA));
        dogs.add(new Dog("Bobby",Breed.TERRIER));
        dogs.add(new Dog("Sam", Breed.NOBREED));

        for (Dog dog:dogs) {
            System.out.println(dog.toString());
        }

        // initialization of object date
        Date date = new Date();

        System.out.println("+++++++" + bimbo.getName() + " start walk" + "+++++++");
        //initiate an hour walk
        //speed it up to 60 milliseconds
        while (System.currentTimeMillis() - date.getTime() < 60) {
            for (Dog dog:dogs) {
                bimbo.talk();
                dog.talk();
                bimbo.sniff(dog);
                dog.sniff(bimbo);
            }
        }

        System.out.println("+++++++" +bimbo.getName() + " finished walk" + "+++++++");
    }
}

