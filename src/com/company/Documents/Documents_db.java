package com.company.Documents;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by blackstee on 10.04.18.
 */
public class Documents_db {

    public static List<Document> documents = new ArrayList<>();

    public static Document getDocument_by_id(int id ) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).get_id() == id) {
                return documents.get(i);
            }
        }
        return null;
    }

    public static void add_need (Document document){
        documents.add(document);
    }

    public static void delete_animal (Document document){
        documents.remove(document);
    }
}
