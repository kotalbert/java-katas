package com.example.katas.xo;

public class XO {
    public static boolean getXO(String str) {
        var xs = 0;
        var os = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'x') xs++;
            if (c == 'o') os++;
        }
        return xs == os;

    }
}
