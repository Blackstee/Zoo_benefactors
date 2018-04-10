package com.company.Actors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blackstee on 10.04.18.
 */
public class Users_db {

    public static List<User> users = new ArrayList<>();

    public static User getNeed_by_id(int id ) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).get_id() == id) {
                return users.get(i);
            }
        }
        return null;
    }

    public static void add_need (User user){
        users.add(user);
    }

    public static void delete_animal (User user){
        users.remove(user);
    }

}
