package PROJECTS.MiniProjeler;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayinin min number print eden code create ediniz.

     */




    public static void main(String[] args) {
        int A[][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        System.out.println(sonc(A));


    }

    private static int sonc(int[][] a) {
        int bos=0;
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                if (a[i][j]<bos){
                    a[i][j] = bos;
                }
            }
        }
        return bos;


    }




}


