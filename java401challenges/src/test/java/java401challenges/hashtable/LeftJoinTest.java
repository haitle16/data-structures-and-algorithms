package java401challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    LeftJoin leftJoin;

    HashMap hm1 = new HashMap();
    HashMap hm2 = new HashMap();
    @Before
    public void Setup(){
        leftJoin = new LeftJoin();
        hm1.put("Hi", "Hello");
        hm1.put("Bye", "Adios");
        hm1.put("Mean", "Anger");
        hm1.put("Nice", "Peaceful");
        hm2.put("Hi", "Hai");
        hm2.put("Mean", "Rage");
        hm2.put("Bye", "PeaceOut");

    }

    @Test
    public void LeftJoinTest() {
        System.out.println(Arrays.toString(leftJoin.LeftJoin(hm1,hm2)));

    }

}