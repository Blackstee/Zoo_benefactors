package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blackstee on 10.04.18.
 */
public class Rel_an_needs_db {

    public static List<rel_an_need> links = new ArrayList<>();

    public static rel_an_need getlink_by_id(int id ) {
        for (int i = 0; i < links.size(); i++) {
            if (links.get(i).get_id() == id) {
                return links.get(i);
            }
        }
        return null;
    }
}
