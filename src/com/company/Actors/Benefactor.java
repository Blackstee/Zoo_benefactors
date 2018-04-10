package com.company.Actors;

/**
 * Created by blackstee on 10.04.18.
 */
public class Benefactor extends User{

    public int type;

    public Benefactor(String username) {
        super(username);
        this.type = -20;
    }
}
