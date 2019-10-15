package animaledible.main;

import animaledible.abs.Animal;
import animaledible.abs.Fruit;
import animaledible.cla.Apple;
import animaledible.cla.Chicken;
import animaledible.cla.Orange;
import animaledible.cla.Tiger;
import animaledible.inter.Edible;

public class test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edi = (Chicken) animal;
                System.out.println(edi.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
