import java.util.Scanner;
class SineSeries{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of terms:  ");
        int n=sc.nextInt();
        System.out.print("Enter value of x: ");
        int angle=sc.nextInt();
        float x=3.141f/180*angle;
        float sum=0,term=x;
        for(int i=1;i<=n;i++)
        {
            term=term*(-x*x/2*i*(2*i-1));
            sum=sum+term;
        }
        System.out.print("Sine(x)= "+sum);
    }
}