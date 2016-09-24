package com.TheIronYard;

/**
 * Created by Viscus on 9/24/16.
 */
public class Country {
    String abreviation;
    String name;

    @Override
    public String toString() {
        return "Country{" +
                "abreviation='" + abreviation + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Country() {
    }

    public Country(String abreviation, String name) {
        this.abreviation = abreviation;
        this.name = name;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
