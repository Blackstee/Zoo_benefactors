package com.company;

import java.util.Random;
/**
 * Created by blackstee on 10.04.18.
 */
public class Need {
    private int id;
    public String name;
    public String type;
    public int amount;
    public int price;


    public Need(String name, String type, int amount, int price) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.id = new Random().nextInt(100);

    }

    public String get_name(){
        return name;
    }

    public int get_id(){
        return id;
    }

    public String get_type(){
        return type;
    }

    public int get_amount(){
        return amount;
    }

    public int get_price(){
        return price;
    }


    public String get_all_info(){
        return
                "\n\t Need:\n\t\t Name: " + name + "\n\t\t Type: " + type + "\n\t\t Amount: " + amount + "\n\t\t Price: " + price + "\n";
    }

    public void add_amount(int value){
        amount += value;
        }

    public String reduce_amount(int value){
        if (amount - value < 0){
            return "\n Not enough value of need...\n Current: " + amount + "\n";
        }
        else
        {
            amount -= value;
            return "\n Amount was successfully reduced! \n Current: " + amount + "\n";
        }

    }
}
