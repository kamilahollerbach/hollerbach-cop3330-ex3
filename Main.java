/*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution
         *  Copyright 2021 Kamila Hollerbach
         */

package com.company;
import java.util.Scanner;

import java.util.*;

        public class Main {


            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print(" What is the quote?");
                String quote = sc.nextLine();

                System.out.print(" Who said it? ");
                String author = sc.nextLine();

                System.out.println(author + "says:" + " \" " + quote +" \" ");
            }
        }


