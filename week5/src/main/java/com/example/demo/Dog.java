package com.example.demo;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;
    private Person person;

    public Dog(String name, String breed, Person person) {
        this.name = name;
        this.breed = breed;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", person=" + person .getName()+
                '}';
    }

    protected void setPerson(Person newPerson){
        /*if(!newPerson.equals(person)){return;}
            person.setDog(null);
            newPerson.setDog(this);*/
            person = newPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed) && Objects.equals(person, dog.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, person);
    }
}
