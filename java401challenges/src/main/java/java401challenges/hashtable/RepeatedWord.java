package java401challenges.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RepeatedWord {

    public String repeatedWord(String str) {
        HashSet<String> hash = new HashSet<String>();
        String[] strArray = str.split(" ");
        System.out.println(Arrays.toString(strArray));
        for(String i : strArray) {
            if(hash.contains(i)) {
                return i;
            } else {
                hash.add(i);
            }
        }
        return "No Repeated Word";
    }
}
