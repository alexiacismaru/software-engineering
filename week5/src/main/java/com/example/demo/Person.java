package com.example.demo;

import java.util.Objects;

public class Person {
    private String name;
    private int birthYear;
    Dog dog;

    public Person(String name, int birthYear, Dog dog) {
        this.name = name;
        this.birthYear = birthYear;
        this.dog = dog;
    }

    public Person(String name, int birthDate) {
        this.name = name;
        this.birthYear = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", dog=" + dog +
                '}';
    }

    public void setDog(Dog newDog){
        if(newDog.equals(dog)){return;}
        dog.setPerson(null);
        newDog.setPerson(this);
        dog = newDog;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && Objects.equals(name, person.name) && Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear, dog);
    }
}
