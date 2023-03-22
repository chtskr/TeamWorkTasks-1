package PROJECTS.MiniProjeler;

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi yazin");
        int sayi = input.nextInt();
        boolean flag = false;
        for (int i = 1; i < sayi; i++) {
            if (sayi != i * i) {
                continue;
            } else flag = true;

        }
        System.out.println(flag);
    }
    }

    /*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        */








