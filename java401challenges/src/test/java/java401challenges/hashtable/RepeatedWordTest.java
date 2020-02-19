package java401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    RepeatedWord repeatedWord = new RepeatedWord();

    @Test
    public void repeatedWord() {
        String str = "This is a randon string, and a is the word!";
        assertEquals("a", repeatedWord.repeatedWord(str));
    }
}