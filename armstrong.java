package JavaPractics;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int sum=0;
        int rem;
        while(temp!=0){
            rem=temp%10;
            temp/=10;
            sum += Math.pow(rem,3) ;
        }
        if(sum==n) {
            System.out.println("amstromg number");
        }
        else{
            System.out.println("not an amstrong number");
        }
    }
}