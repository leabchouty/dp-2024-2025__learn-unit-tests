package fr.anthonyquere.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static List<String> startFizzBuzz(int count) {
        List<String> resultat = new ArrayList<>();
        
        if (count == 0) {
            return resultat;
        }
        for (int i = 1; i <= count; i++) {
            String value = "";
            if (i % 3 == 0) {
                value += "Fizz";
            }
            if (i % 5 == 0) {
                value += "Buzz";
            }
            if (value.isEmpty()) {
                value = String.valueOf(i);
            }
            resultat.add(value);
        }
        return resultat;
    }
}
