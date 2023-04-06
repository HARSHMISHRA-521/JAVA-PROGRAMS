package Lab_programs;
import java.util.*;
public class Divideby_zero {
    public static void main(String []args)throws Exception
    {
        int a;int b;
        float q ;
        Scanner s =new Scanner(System.in);
        System.out.println("Enetr the first and second element");
        a=s.nextInt();
        b=s.nextInt();
        try{
            if(b!=0){
                q=(float)a/b;
                System.out.println("The result is :"+q);
            }
            else{
                throw new ArithmeticException();
            }

        }
        catch(ArithmeticException e){
            System.out.println("DIVIDE BY ZERO ERROR");
            System.out.println(e);

    }
    }

}
