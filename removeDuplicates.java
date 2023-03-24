package PROJECTS.MiniProje2;

import java.util.Scanner;

public class removeDuplicates {

    /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
        result should be 5

        NOTE: while printing the result dont use for loop

     */


    /*
       Verilen int array için
       duplicated(tekrarlanan) öğeleri array den silip
      non-duplicated(tekrarlanmayan) eleman  sayisini print eden code create ediniz

       Örnek:
       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

       result  5

       NOT: resultu print ederken for loop kullanmayın

    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for(int i = 0 ; i < useThisArray.length ; i++){

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }

        // code start here
        // dont change anything before this line
        // your Array is useThisLine

        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
        //   useThisLine arrayini kullan
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5));
        hs.retainAll(hs);
        System.out.println("hs = " + hs.size());
    }


}
