package TeamWork.Project_01;

import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {


    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    /*
  Girilen iki tamsayı arasinda random sayi elde eden code create ediniz.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("küçük sayiyi girinizz");
        int min = scanner.nextInt();
        System.out.println("büyük sayiyi giriniz");
        int max = scanner.nextInt();
        double randomNumber = Math.random() * (max - min) + min;
        System.out.println((int)randomNumber);










    }
}
