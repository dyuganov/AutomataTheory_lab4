package ru.nsu.dyuganov.automatathory4;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private static HashSet<Character> N = new HashSet<Character>();
    private static HashSet<Character> T = new HashSet<Character>();
    private static Multimap<Character, char[]> P = ArrayListMultimap.create();
    private static Character S;

    public static void main (String[] args) {
        System.out.println("Enter Context Free Grammar:");

        Parser parser = new Parser();
        N = parser.parseN();
        T = parser.parseT(N);
        P = parser.parseP(N, T);
        S = parser.parseS(N);

    }
}
