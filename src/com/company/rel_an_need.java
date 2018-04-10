package com.company;


import java.util.Random;

/**
 * Created by blackstee on 10.04.18.
 */
public class rel_an_need {

    private int id;
    public Animal animal;
    public Need need;

    public rel_an_need (int id_animal, int id_need){

        this.animal = Animals_db.getAnimal_by_id(id_animal);
        this.need = Needs_db.getNeed_by_id(id_need);
        this.id = new Random().nextInt(100);

    }

    public int get_id(){
        return id;
    }

}
