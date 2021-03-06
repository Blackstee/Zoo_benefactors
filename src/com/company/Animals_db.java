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

    public static void add_animal (Animal animal){
        animals.add(animal);
    }

    public static void delete_animal (Animal animal){
        animals.remove(animal);
    }

    public void print_all_animals (){
        int i = 0;
        do
            {
                System.out.println(animals.get(i).get_all_info());
                i++;
        } while (i < animals.size());
    }



}

