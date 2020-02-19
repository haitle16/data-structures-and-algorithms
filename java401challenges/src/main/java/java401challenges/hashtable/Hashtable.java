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

        System.out.println(myhash.contains("Benn"));
        System.out.println(myhash.toString());
        System.out.println(myhash.get("Rosie"));


    }



    int size;
    LinkedList<String>[] map;

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
        return Math.abs(key.hashCode() % this.size);

    }

    public void add(String key, String value) {
        int hashKey = hash(key);
        LinkedList newNode = new LinkedList<>();
        // if its empty hashtable
        if(this.map[hashKey]  == null) {
            this.map[hashKey] = new LinkedList<>();
        } else {
            this.map[hashKey].add(value);
        }
    }

    public String get(String key) {
        int hashKey = hash(key);
        if(this.map[hashKey] == null) return null;
        LinkedList<String> list = this.map[hashKey];

        for (String storage : list) {
            if (key.equals(storage)) {
                System.out.println("it gets in here");
                return storage;
            }
        }
        System.out.println(list.toString());
        return "No value with that key found.";
    }

    public Boolean contains(String key) {
        int hashKey = hash(key);
        if(this.map[hashKey] == null) {
            return false;
        } else {
            return true;
        }
    }





    @Override
    public String toString() {
        return "Hashtable{" +
                "map=" + Arrays.toString(map) +
                '}';
    }
}
