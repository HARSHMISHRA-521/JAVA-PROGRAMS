package PATTERN_PROGRAMS;

public class Pattern_arrow {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=((i*2)-1);j++){
                //spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
           // System.out.print("  ");
            for(int j=1;j<=((i*2)-1);j++){
                //spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
