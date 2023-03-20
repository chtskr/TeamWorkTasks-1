package PROJECTS.MiniProjeler;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


    /*
    verilen String variable'da sayı değerlerinin toplamını print eden code create ediniz


        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65;

       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir





   */
    public static void main(String[] args) {

        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";


        int n1 = Integer.parseInt(num1.replace("$", ""));
        int n2 = Integer.parseInt(num2.replace("$", ""));
        int n3 = Integer.parseInt(num3.replace("$", ""));
        int sum = n1 + n2 + n3;
        System.out.println(sum);


    }

}





