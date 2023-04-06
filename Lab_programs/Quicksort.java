package Lab_programs;
import java.util.*;
public class Quicksort {
    public static void main(String args[]){
        System.out.println("*********** QUICKSORT *************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("THE ARRAY INSERTED TO BE SORTED ARE ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        long start =System.nanoTime();
        QST(arr,0,n-1);
        long end=System.nanoTime();
        System.out.println("THE sorted array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("THE TIME TAKEN IS "+(start - end)+"ns");
        System.out.println("-----------------------------------");
    }
    static void QST(int arr[],int low,int high){
        if(low<high){
            int piv=partition(arr,low,high);
            QST(arr,low,piv-1);
            QST(arr,piv+1,high);
        }
    }

    static int partition(int arr[],int low,int high){
        int p = arr[high];
        int i=low-1;
        for(int j=low;j<high-1;j++){
            if(arr[j]<p){
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=p;
        arr[high]=temp;
        return i;
    }

}
