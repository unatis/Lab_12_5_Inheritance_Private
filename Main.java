
package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        //animal.AnimalName = "Blackbirds";
        animal.AnimalDetails = "";
        animal.SomeFunc();

        Animal Bird = new Birds();
        //Bird.AnimalName = "Chickadees";
        Bird.AnimalDetails = "Chickadees";
        Bird.SomeFunc();

        Birds Bird2 = new Birds();
        //Bird2.AnimalName = "Crows";
        Bird2.AnimalDetails = "dfgdfg";
        Bird2.BirdName = "American Crow";
        Bird2.SomeFunc();


    }

}
