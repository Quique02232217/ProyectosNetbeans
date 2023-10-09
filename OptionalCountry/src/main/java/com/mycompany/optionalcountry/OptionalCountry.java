package com.mycompany.optionalcountry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalCountry {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Argentina");
        countries.add("United States");
        countries.add("Colombia");
        countries.add("Italy");
        countries.add("Ecuador");
        countries.add("Switzerland");
        countries.add("Sweden");

        Optional<String> searchCountry = countries.stream().filter(c -> c.startsWith("S")).findFirst();

        if (searchCountry.isPresent()) {
            System.out.println(searchCountry.get());
        }

    }
}
