package com.company;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by blackstee on 10.04.18.
 */
public class Animals_db {

    public static List<Animal> animals = new ArrayList<>();

    public static Animal getAnimal_by_id(int id) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).get_id() == id) {
                return animals.get(i);
            }
        }
        return null;
    }



}

