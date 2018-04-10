package com.company.Documents;

import com.company.Actors.Admin;
import com.company.Actors.Benefactor;
import com.company.Animal;
import com.company.Need;
import com.company.rel_an_need;
import com.company.Actors.User;


import java.util.Random;
import java.util.Date;

/**
 * Created by blackstee on 10.04.18.
 */
public class Document {

    private int id;
    public int type_doc;
    public int status;
    public rel_an_need link;
    public Benefactor benefactor;
    public Admin admin;
    public Date date;
    public int amount_money;
    public String details;

    public Document(int type_doc, rel_an_need link, Benefactor benefactor, Admin admin, int amount_money, String details) {
        this.type_doc = type_doc;
        this.link = link;
        this.benefactor = benefactor;
        this.admin = admin;
        this.amount_money = amount_money;
        this.details = details;
        this.status = 0;
        this.id = new Random().nextInt(100);

    }

    public int get_id(){
        return id;
    }

    public String get_status(){
        String status = null;
        switch (this.status){
            case 0 :
                status = "Document created, but not released, in process";
                break;
            case 1 :
                status = "Document released";
                break;
            case -1 :
                status = "Document was declined";
                break;
        }
        return status;
    }

    public String get_type_doc(){
        String type_doc = null;
        switch (this.type_doc){
            case 1 :
                type_doc = "This document is the report";
                break;
            case 2 :
                type_doc = "This document is the request";
                break;
            case 3 :
                type_doc = "This document is the delivery note";
                break;
        }
        return type_doc;
    }

    public Benefactor get_benefactor(){
        return benefactor;
    }

    public Admin get_admin(){
        return admin;
    }

    public int get_amount_money(){
        return amount_money;
    }

    public String get_details(){
        return details;
    }


    public String get_all_info(){
        return
                "\n\t Document:\n\t\t Type: " + get_type_doc() +
                        "\n\t\t Status: " + get_status() +
                        "\n\t\t Benefactor: " + benefactor +
                        "\n\t\t Admin: " + admin +
                        "\n\t\t Amount: " + amount_money +
                        "\n\t\t Details: " + details +
                        "\n";
    }


    public String set_status(int status){
        if (this.status == status){
            return "\n Already having this status\n Current: " + get_status() + "\n";
        }
        else
        {
            this.status = status;
            return "\n Status was successfully changed! \n Current: " + get_status() + "\n";
        }

    }



    public void set_details(String details){
        this.details = details;
    }

    public void set_amount_money(int amount_money){
        this.amount_money =amount_money;
    }

}
