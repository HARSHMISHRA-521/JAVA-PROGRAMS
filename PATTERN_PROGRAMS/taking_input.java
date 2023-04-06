package PATTERN_PROGRAMS;

import java.util.Scanner;
public class taking_input {
    public static void main(String[] args){
        System.out.println("TAKING INPUT FROM THE USER");
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER: ");
        //int a=sc.nextInt();
        float a=sc.nextFloat();
        System.out.println("ENTER THE SECOND NUMBER : ");
        //int b= sc.nextInt();
        float b=sc.nextFloat();
      //  int sum=a+b;
        float sum=a+b;
        System.out.println("THE SUM OF THE NUMBERS ARE :");
        System.out.println(sum);
        //for boolean testing
       // System.out.println("for int validation enter a number");
      //  boolean b1=sc.hasNextInt();
        //System.out.println(b1);
        System.out.println("enter the name ");
      //  String str=sc.next();
        String str=sc.nextLine();
        System.out.println(str);

    }
}
