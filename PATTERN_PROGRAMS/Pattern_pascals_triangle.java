package PATTERN_PROGRAMS;/*Print Pascal’s Triangle.
    1
   1 1         by using nCr values for each column in each row
  1 2 1             r is column no and n is the row no.
 1 3 3 1
1 4 6 4 1
*/

import java.util.*;
public class Pattern_pascals_triangle {
    public static void main(String args[]) {
        Pattern_pascals_triangle t = new Pattern_pascals_triangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no . of lines");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {  //loop for rows
            for (int k = 0; k < n - i; k++)//loop for space
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { //loop for printing elements
                //as row no is equal to the no of elements
                System.out.print(t.coeff(i, j) + " ");
            }
            System.out.println(" ");
        }
    }

    int coeff(int n, int r)//function to calculate binomial coefficients
    {
        int c = fact(n) / (fact(r) * fact(n - r));
        return c;
    }

    int fact(int n)//function fpr factorial
    {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}