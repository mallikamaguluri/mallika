package com;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

/public class calculator {
    public static void main(String[] args) {
        double a=13;
        double b=11;

        Scanner Sc=new Scanner(System.in);
        char ch = Sc.next().charAt(0);

        switch (ch)
        {
            case '+':
                System.out.println("addition:"+(a+b));
                break;
            case '-':
                System.out.println("subraction:"+(a-b));
                break;
            case '*':
                System.out.println("multiplication:"+(a*b));
                break;
            case '/':
                System.out.println("division:"+(a/b));
                break;
                case '%':
                System.out.println("modulus:"+(a%b))
               break;
            case 's':
                System.out.println("Sine is :"+(Math.toRadians(Math.sin(a)));
                break;
            case 'c':
                    System.out.println("Math.cos:"+Math.toRadians(Math.cos(a)));
                    break;
            case 't':
                System.out.println("Math.tan:"+Math.toRadians(Math.tan(a)));
                break;
            case 'C':
                System.out.println("Math.cos:"+Math.toRadians(Math.cos(a))/(Math.sin(a));
                break;
        }
    }

