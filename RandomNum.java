package PROJECTS.MiniProjeler;

import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */


    /*

     Girilen sayı ile 0 arasında random bir sayi elde eden code create ediniz.

     */

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Lütfen bir sayı girin: ");
            int max = input.nextInt();

            double randomNumber = Math.random() * max;
            System.out.println("0 ile " + max + " arasında rastgele sayı: " + randomNumber);
        }
    }

