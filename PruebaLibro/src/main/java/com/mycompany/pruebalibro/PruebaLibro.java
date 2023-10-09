package com.mycompany.pruebalibro;

import static com.mycompany.pruebalibro.Person.Builder.aPerson;



public class PruebaLibro {

    public static void main(String[] args) {
      Person p = aPerson().withAgePerson(18).withNamePerson("Ramiro").build();
      
      System.out.println(p.toString());

    }
}
