package java401challenges.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {

    public static ArrayList[] LeftJoin(HashMap<String,String> hm1, HashMap<String,String> hm2) {
        ArrayList[] matrix = new ArrayList[hm1.size()];
        for(int i = 0; i < hm1.size(); i++) {
            matrix[i] = new ArrayList();

            for(String name : hm1.keySet()) {
                matrix[i].add(name);
                matrix[i].add(hm1.get(name));
                break;
            }
        }


        return matrix;
    }
}
