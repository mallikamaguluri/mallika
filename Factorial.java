package JavaPractics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n==0){
            System.out.println(1);
        }
        else{
            int fact=1;
            for(int i=2;i<=n;i++)
            {
                fact*=i;
            }
            System.out.println(fact);
        }

        }
    }

