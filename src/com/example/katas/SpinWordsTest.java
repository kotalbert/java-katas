package com.example.katas;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpinWordsTest {
    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("This is a test", new SpinWords().spinWords("This is a test"));
        assertEquals("This is rehtona test", new SpinWords().spinWords("This is another test"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

}