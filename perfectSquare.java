package PROJECTS.MiniProjeler;

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi yazin");
        int sayi = input.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i * i == sayi)
                System.out.println("mükemmel sayı");

        }

    }

    /*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        */








