package PATTERN_PROGRAMS;

public class Pattern_hollow_rhombus {
    public static void main (String args[]){
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //for inner space loop
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for inner star loop
            for(int j=1;j<=n;j++){
                if(i==2||i==3||i==4){
                    if(j==1||j==5) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
