package com.TheIronYard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Country> allCountries = new ArrayList<>();


        File f = new File("countries.txt");
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            String abreviation = columns[0];
            String name = columns[1];
            Country c = new Country(abreviation, name);
            allCountries.add(c);
        }


        HashMap<String, ArrayList<Country>> countryMap = new HashMap<>();

        for (Country country : allCountries) {
            String firstLetter = String.valueOf(country.name.charAt(0));
            ArrayList<Country> co = countryMap.get(firstLetter);
            if (co == null) {
                co = new ArrayList<>();
            }
            co.add(country);
            countryMap.put(firstLetter, co);

        }



        System.out.println("Please type the first letter of the countries you want listed.");
        Scanner inputScanner = new Scanner(System.in);
        String letter = inputScanner.nextLine();
         ArrayList<Country> countriesForOneLetter = countryMap.get(letter);

        File cl = new File(letter +"_countries.txt");
        FileWriter clw = new FileWriter(cl);
        clw.write(String.valueOf(countriesForOneLetter));
        clw.close();



    }
}
