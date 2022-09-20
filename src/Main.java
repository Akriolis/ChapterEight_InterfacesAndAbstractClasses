import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

import PoolPuzzle.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog doggo = new Dog();
        Cat kitty = new Cat();
        list.add(doggo);
        list.add(kitty);

        list.contains();

        ArrayList<Object> testList = new ArrayList<Object>();

        Dog aDog = new Dog();
        testList.add(aDog);

        Dog bDog = (Dog) testList.get(0);
        bDog.bark();

        Object cDog = testList.get(0);
        // cDog.bark(); wont compile

        if (cDog instanceof Dog){
            Dog d = (Dog) cDog;
            d.bark();
        }

        Cat myCat = new Cat();
        myCat.play();

        Nose [] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for (int x = 0; x < 3; x++){
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }


    }
}
