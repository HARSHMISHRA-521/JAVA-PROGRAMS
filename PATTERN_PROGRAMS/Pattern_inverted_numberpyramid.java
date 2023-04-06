package PATTERN_PROGRAMS;

/*Print Inverted Half Pyramid.
11111
222
33
4
*/
public class Pattern_inverted_numberpyramid {
    public static void main (String args[]){
        int n=5;int l=1;
        for(int i=5;i>=1;i--){
            if(i!=4){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(l+" ");
                }
                l++;
                System.out.println();
            }
        }
    }

}
