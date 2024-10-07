        //    1
        //   2 2
        //  3 3 3
        // 4 4 4 4


import java.util.*;

public class Pattern4{

    public static void main (String[] args){

        int n = 4;

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                if(j <= (n-i)){
                    System.out.print(" ");
                }else{
                    System.out.print(i+" ");
                }
            }
            System.out.println("");
        }
    }
}