package PROJECTS.MiniProjeler;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */


        /*


        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini
        kaldırıp kelimeleri birleştiren code create ediniz

       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"


         */


        Scanner sc = new Scanner(System.in);
        System.out.println("birinci kelime giriniz");
        String s1 = sc.next();
        System.out.println("ikiinci kelime giriniz");
        String s2 = sc.next();

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            System.out.println(s1 + s2.substring(1));
        } else System.out.println(s1 + s2);


    }
}
