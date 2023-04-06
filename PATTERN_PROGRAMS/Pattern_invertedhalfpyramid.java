package PATTERN_PROGRAMS;

public class Pattern_invertedhalfpyramid {
    public static void main(String[] args) {
        int n=5;                                      //or
        for (int i = 1; i <= n; i++) {                //for(int i=n;i>=1;i--){
            for (int j = (n-i)+1; j >= 1; j--) {      //  for(int j=1;j<=i;j++){
                System.out.print("* ");               //      System.out.println("* ");
            }                                         //}
            System.out.println();
        }
    }
}
