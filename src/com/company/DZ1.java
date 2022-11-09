package com.company;

public class DZ1 {

    public static void main(String[] args) {
	    var dog = 8.0;
	    var cat = 3.6;
	    var paper = 763789;
        System.out.println("dog: " + dog + "\n" +
                "cat: " + cat + "\n" +
                "paper: " + paper);
        dog += 4.0;
        cat += 4;
        paper += 4;
        System.out.println("\nupd1 dog: " + dog + "\n" +
                "upd1 cat: " + cat + "\n" +
                "upd1 paper: " + paper);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("\nupd2 dog: " + dog + "\n" +
                "upd2 cat: " + cat + "\n" +
                "upd2 paper: " + paper);
    }
}
