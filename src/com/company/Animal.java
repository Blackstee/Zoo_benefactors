package com.company;

/**
 * Created by blackstee on 10.04.18.
 */
public class Animal {

    public String name;
    public String type;
    public int age;
    public int account;
    public int aver_needed_acc;

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.account = 0;
        this.aver_needed_acc = 2000;

    }

    public String get_name(){
        return name;
    }

    public String get_type(){
        return type;
    }

    public int get_age(){
        return age;
    }

    public int get_account(){
        return account;
    }


    public String get_all_info(){
        return
                "\n\t Animal:\n\t\t Name: " + name + "\n\t\t Type: " + type + "\n\t\t Age: " + age + "\n\t\t Account: " + account + "\n";
    }

    public String add_to_account(int value){
        account += value;
        if (account >= aver_needed_acc)
            return "\n Money added to account of " + name + "'s account.\n It's going well with this animal!!\n Current: " + account +"\n";
        else
            return "\n Money added to account of " + name + "'s account.\n Animal need more money..\n Current: " + account +"\n";
    }

    public String debit_from_account(int value){
        if (account - value < 0){
            return "\n Not enough money on account...\n Current: " + account + "\n";
        }
        else
        {
            account -= value;
            return "\n Money were successfully taken! \n Current: " + account + "\n";
        }

    }


    public void set_aver_needed_acc(int new_aver){
        this.aver_needed_acc = new_aver;
    }


}