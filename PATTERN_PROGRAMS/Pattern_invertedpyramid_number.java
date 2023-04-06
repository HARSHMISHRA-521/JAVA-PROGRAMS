package PATTERN_PROGRAMS;

public class Pattern_invertedpyramid_number {
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
