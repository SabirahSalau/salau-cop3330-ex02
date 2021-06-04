/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sabirah Salau
 */

package org.example;

import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        System.out.println("What is the input string?");

        Scanner input = new Scanner(System.in);

        String word = input.next();

        int wordLength = word.length();

        System.out.println(word + " has " + wordLength + " characters.");



    }
}
