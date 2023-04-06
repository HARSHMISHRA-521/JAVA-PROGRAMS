package PATTERN_PROGRAMS;

import java.util.Scanner;
public class cbse_percentage_calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("****CBSE % PER CALCULATOR****");
        System.out.println("ENETR THE MARKS OUT OF 100 :");
        System.out.println("ENTER THE MARKS 1:");
        float m1=sc.nextFloat();
        System.out.println("ENTER THE MARKS 2:");
        float m2=sc.nextFloat();
        System.out.println("ENTER THE MARKS 3:");
        float m3=sc.nextFloat();
        System.out.println("ENTER THE MARKS 4:");
        float m4=sc.nextFloat();
        System.out.println("ENTER THE MARKS 5:");
        float m5=sc.nextFloat();
        float perc=((m1+m2+m3+m4+m5)/5);
        System.out.println("THE PERCENTAGE IS:");
        System.out.println(perc);
        System.out.println("*************************");
    }
}
