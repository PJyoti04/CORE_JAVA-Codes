//Diamond Pattern

import java.util.*;

public class Pattern6{

    public static void main (String[] args){

        int n = 5;

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=(n+i-1) ; j++){
                if(j <= (n-i)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=(n+i-1) ; j++){
                if(j <= (n-i)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}