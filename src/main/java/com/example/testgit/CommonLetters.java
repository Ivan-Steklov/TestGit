package com.example.testgit;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonLetters {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};


        List<List<Character>> charLists = Arrays.stream(words)
                .map(word -> word.chars().mapToObj(c -> (char) c).collect(Collectors.toList()))
                .collect(Collectors.toList());


        List<Character> commonLetters = charLists.get(0);
        for (int i = 1; i < charLists.size(); i++) {
            commonLetters = commonLetters.stream()
                    .filter(charLists.get(i)::contains)
                    .collect(Collectors.toList());
        }


        System.out.println("Common letters: " + commonLetters);
    }
}