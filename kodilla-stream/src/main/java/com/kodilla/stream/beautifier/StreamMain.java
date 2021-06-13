package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("poem", poem -> "ABC... " + poem + " ...ABC");
        poemBeautifier.beautify("poem", poem -> poem.toUpperCase());
        poemBeautifier.beautify("poem", poem -> ":.:.: " + poem + " :.:.:ABC");
        poemBeautifier.beautify("poem", poem -> "*-*-* " + poem + " *-*-*");
    }
}