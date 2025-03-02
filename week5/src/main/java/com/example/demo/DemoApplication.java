package com.example.demo;

public class DemoApplication {
    public static void main(String[] args) {
        Person filip = new Person("Filip", 2001);
        Person elliot = new Person("Elliot", 2002);

        Dog tim = new Dog("Tim", "Border Collie", filip);
        Dog scoobyDoo = new Dog("Scooby Doo", "Great Dane", elliot);

        filip.dog = tim;
        elliot.dog = scoobyDoo;

        filip.setDog(tim);
        elliot.setDog(scoobyDoo);

        System.out.println(filip);
        System.out.println(elliot);
    }
}
