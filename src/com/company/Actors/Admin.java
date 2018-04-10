package com.company.Actors;

import java.util.Random;

/**
 * Created by blackstee on 10.04.18.
 */
public class Admin extends User {

    public int type;

    public Admin(String username) {
        super(username);
        this.type = 20;
    }

}
