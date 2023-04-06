package PATTERN_PROGRAMS;

public class Pattern_01pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
//                if (i % 2 == 0) {
//                    if (j%2== 0) {
//                        k =1;
//                    } else {
//                        k = 0;
//                    }
//                }
//                else{
//                    if (j%2== 0) {
//                        k =0;
//                    } else {
//                        k = 1;
//                    }
//
//                }
//`                   (or)
                int sum=i+j;
                if(sum%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
}