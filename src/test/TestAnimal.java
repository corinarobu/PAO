package test;

import animal.Animal;
import animal.Ape;
import animal.Bird;
import animal.Duck;



public class TestAnimal {

        public static void main(String[] args) {
            Animal animal = new Animal("dog", 4);
            animal.move();

            Ape ape = new Ape(2, "gorilla", "big");
            ape.move();
        }
    }

