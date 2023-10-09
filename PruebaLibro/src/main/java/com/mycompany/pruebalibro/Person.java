package com.mycompany.pruebalibro;

import java.util.Objects;

public class Person {

    private String namePerson;
    private int agePerson;

    public Person(String namePerson) {
        this.namePerson = namePerson;

    }

    private Person(String namePerson, int agePerson) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;

    }

    public Person(int agePerson) {
        this.agePerson = agePerson;

    }

    public String getNamePerson() {
        return namePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    @Override
    public String toString() {
        return "Nombre: " + namePerson + " Edad: " + agePerson;

    }

    public static Person infoPerson(String name, int age) {

        return new Person(name, age);

    }

    

    public static final class Builder {

        private String namePerson;
        private int agePerson;

        private Builder() {

        }
        
        public static Builder aPerson(){
            return new Builder();
        }

        public Builder withNamePerson(String namePerson) {
            this.namePerson = namePerson;
            return this;
        }
        
        public Builder withAgePerson(int agePerson){
            this.agePerson = agePerson;
            return this;
        }
        
        public Person build(){
            return new Person(namePerson, agePerson);
        }

    }

}
