package animaledible.cla;

import animaledible.abs.Animal;
import animaledible.inter.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String howToEat() {
        return "could be fried";
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
