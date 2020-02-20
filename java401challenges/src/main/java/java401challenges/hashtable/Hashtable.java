package java401challenges.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

public class Hashtable {

    public static void main(String[] args) {

        Hashtable myhash = new Hashtable(14);
        myhash.add("John","Boss");
        myhash.add("Cathy","The Real Boss");
        myhash.add("Zach","Kid 1");
        myhash.add("Allie","Kid 2");
        myhash.add("Rosie","Dog");
        myhash.add("Cat","TA");
        myhash.add("Justin","Student");
        myhash.add("Jason","Student");
        myhash.add("Ben","Student");
        myhash.add("Timea","Student");
        myhash.add("Jen","Student");
        myhash.add("Khalil","Student");
        myhash.add("Michael","Student");
        myhash.add("Ovi","Student");

        System.out.println(myhash.toString());


    }

    int size;
    LinkedList[] map;

    public Hashtable(int size) {
        this.size = size;
        this.map = new LinkedList[size];
    }

    private int hash(String key) {
//        int hashValue = 0;
//        for(int i = 0; i < key.length(); i++) {
////            hashValue += (int) key.charAt(i);
////        }
////        hashValue = (hashValue * 599) % this.size;
////
////        return hashValue;
        int hashCode = key.hashCode();
        int hashValue = Math.abs(hashCode % this.size);
        return hashValue;

    }

    public void add(String key, String value) {
        int hashKey = hash(key);
        // if its empty hashtable
        if(this.map[hashKey]  == null) {
            this.map[hashKey] = new LinkedList<>();
        } else {
            this.map[hashKey].add(value);
        }
    }

    @Override
    public String toString() {
        return "Hashtable{" +
                "map=" + Arrays.toString(map) +
                '}';
    }
}
