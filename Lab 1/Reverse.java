import java.util.Scanner;
class Reverse{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int n=num;
        int sum=0,rem;
        while(n!=0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.print("After reversing: "+sum);
    }
}