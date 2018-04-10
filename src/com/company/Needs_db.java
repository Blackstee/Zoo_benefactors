package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blackstee on 10.04.18.
 */
public class Needs_db {

    public static List<Need> needs = new ArrayList<>();

    public static Need getNeed_by_id(int id ) {
        for (int i = 0; i < needs.size(); i++) {
            if (needs.get(i).get_id() == id) {
                return needs.get(i);
            }
        }
        return null;
    }

}
