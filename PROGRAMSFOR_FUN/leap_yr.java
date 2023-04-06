package PROGRAMSFOR_FUN;
import java.util.*;
public class leap_yr {
    public static void main(String []args){
        System.out.println("******** leap year *********");
        System.out.println("Enter the year : ");
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();                         /*a year that is evenly divisible by 100 (for example, 1900)
                                                             is a leap year only if it is also evenly divisible by 400.
                                                                For this reason, the following years are not leap years:
                                                                     1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
                                                         This is because they are evenly divisible by 100 but not by 400.
                                                                    The following years are leap years: 1600, 2000, 2400
                                                        This is because they are evenly divisible by both 100 and 400.*/
                                                     /*To determine whether a year is a leap year, follow these steps:
                                          1.  If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
                                          2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
                                          3.  If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
                                          4. The year is a leap year (it has 366 days).
                                          5. The year is not a leap year (it has 365 days).*/
        if(year%100==0){
            if( year%400==0 ){
                    System.out.println("Year "+year+" is a leap year.");
            }
            else{
                System.out.println("Year "+year+" is not a leap year.");
            }
        }
        else if(year%4==0){
            System.out.println("Year "+year+" is  a leap year.");
        }
        else{
            System.out.println("Year " +year+ " is not a leap year.");
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
