package Lab_programs;
import java.io.*;
import java.util.*;
public class SumSubset {
    public static void main (String [] args) throws Exception{
        System.out.println("Subset");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemnts in increasing order");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int sum=0;
        System.out.print("THE set is:"+"{");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
             sum=sum+arr[j];
        }
        System.out.print("}");
        System.out.println();
        System.out.println("The sum of elemnts is:"+sum);
        SumSubset(arr,0,"",0,target);
    }
    public static void SumSubset(int[] arr,int idx,String sub,int sos,int target){
        if(idx==arr.length){
            if(sos==target){
                System.out.print("The solution is : ");
                System.out.println(" {"+sub+"}");
            }
            return;
        }
        SumSubset(arr,idx+1,sub+arr[idx]+",",sos+arr[idx],target);
        SumSubset(arr,idx+1,sub,sos,target);

    }
}
