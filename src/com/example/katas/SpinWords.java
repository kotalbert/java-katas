package com.example.katas;

public class SpinWords {

    public String spinWords(String sentence) {
        //TODO: Code stuff here
        var words = sentence.split(" ");

        for (int i=0;i<words.length;i++) {
           if (words[i].length() > 5) {
               words[i] = reverse(words[i]);
           }
        }

        return collect(words);
    }

    private String collect(String[] words) {
        return null;
    }

    private String reverse(String word) {
        return null;
    }
}
