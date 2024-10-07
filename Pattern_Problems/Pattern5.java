// Pallindromic Pattern


import java.util.*;

public class Pattern5{

    public static void main(String[] args){

        int n = 5;
        for(int i=1 ; i<=n ; i++){
            int k = i;
            for(int j=1 ; j<=(n+i-1) ; j++){

                if(j <= (n-i)){
                    System.out.print("  ");
                }else{
                    if(j>=5){
                        // k++;
                        System.out.print(k+" ");
                        k++;
                    }else{
                        System.out.print(k+" ");
                        k--;
                    }

                }
            }
            System.out.println("");
        }
    }
}