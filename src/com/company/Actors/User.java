package com.company.Actors;

import com.company.Animal;
import com.company.Need;

import java.util.Random;

/**
 * Created by blackstee on 10.04.18.
 */
public class User {

    public int id;
    public String username;
    public String password;
    public int status;

    public User(String username) {
        this.username = username;
        this.password = "pass";
        this.id = new Random().nextInt(100);
        this.status = 0;

    }

    public String get_username(){
        return username;
    }

    public int get_id(){
        return id;
    }

    public String get_password(){
        return password;
    }

    public String authorize(){
        if (status == 0)
        {
            status = 1;
            return "\n User " + username + "is successfully authorized\n ";
        }
        else
            return "\n User " + username + "is already authorized\n";
    }

    public String unauthorize(){
        if (status == 1)
        {
            status = 0;
            return "\n User " + username + "is successfully unauthorized\n ";
        }
        else
            return "\n User " + username + "is already unauthorized\n";
    }


}
