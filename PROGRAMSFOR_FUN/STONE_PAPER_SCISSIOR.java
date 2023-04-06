package PROGRAMSFOR_FUN;
import java.util.*;
import java.util.Random;
public class STONE_PAPER_SCISSIOR {
    public static void main(String[]args){
        System.out.println( );
        System.out.println("\t \t<<<<<<<<<<<<<<<<<<< STONE 💣 PAPER 🖼 AND SCISSIOR ✂ >>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        int comp;

//        Random r= new Random();
//        int comp=(int)r.nextInt(3);
        int n =0;
        do {
            comp =(1+(int)(Math.random()*(3)));
            System.out.println("PLEASE CHOOSE AN OPTION ACCORDING TO YOUR CHOICE 😎:-> ");
            System.out.println("\t \t 1.START THE GAME \n \t\t 2.KNOW ABOUT THE GAME \n\t\t 3.EXIT");
            Scanner sc = new Scanner(System.in);
             n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("\t \t---------- WELCOME TO GAME 💪🏻💪🏻💪🏻 -------");
                    System.out.println("ENTER YOUR CHOICE :  \n 1. STONE \n 2. PAPER \n 3.SCISSIOR  ");
                    int c = sc.nextInt();
                {
                    if (comp == 1) {
                        System.out.println("COMPUTER'S CHOICE IS STONE\n");
                    } else if (comp == 3) {
                        System.out.println("COMPUTER'S CHOICE IS SCISSIOR\n");
                    } else if (comp == 2) {
                        System.out.println("COMPUTER'S CHOICE IS PAPER\n");
                    }
                    if (c == 1) {
                        System.out.println("YOUR  CHOICE IS STONE\n");
                    } else if (c == 2) {
                        System.out.println("YOUR CHOICE IS PAPER\n");
                    } else if (c == 3) {
                        System.out.println("YOUR CHOICE IS SCISSIOR\n");
                    }
                    if (c == 1 && comp == 1 || c == 2 && comp == 2 || c == 3 && comp == 3) {
                        System.out.println("THERE IS A TIE 🤝🏻🤝🏻🤝🏻 *********************");
                    }
                    //while (c > 0 && c <= 3) {
                        if (comp == 1 && c == 2 || comp == 2 && c == 3 || comp == 3 && c == 1) {
                            System.out.println(" $$$$$ YOU WON 🤴🏻🤴🏻🤴🏻 $$$$$$");
                        } else if (comp == 1 && c == 3 || comp == 2 && c == 1 || comp == 3 && c == 2) {
                            System.out.println(" !!!!!! YOU LOST 😕😕😕 !!!!!!");
                        }
                    //}
                }
                break;

                case 2:
                    System.out.println("Rock paper scissors A classic two-person game. " +
                            "  \n" + "Players start each round by saying, “rock, paper, scissors, shoot!” On “shoot,” " + "\n"+
                            "each player holds out their fist for rock, flat hand for paper, or their index" + "\n" +
                            "and middle finger for scissors. Rock crushes scissors, scissors cut paper, and" + "\n" +
                            "paper covers rock. See who wins each round! This is a good way to decide who goes first in other games.");

                    System.out.println();
                    System.out.println();
                    break;


                case 3:
                    System.out.println("^^^^^^^^^^^^^^^^ THANKS FOR PLAYING 🤘🏻🤘🏻🤘🏻🤘🏻 ^^^^^^^^^^^^^^^^^^^^^");
                    System.exit(0);
                default:
                    System.out.println("!!!!!!!!!!!!!! wrong choice 👊🏻👊🏻👊🏻 !!!!!!!!!!!!!!!!!");

            }
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        }while(n!=3);
    }
}
