import java.util.Scanner;
class Pallindrome{
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
        if(sum==num)
        {
        System.out.println("Pallindrome !!!");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
    }
}