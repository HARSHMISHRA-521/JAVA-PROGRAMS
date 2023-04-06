package Lab_programs;

import java.util.Scanner;

public class Mergesort {
        public static void main(String args[]){
            System.out.println("*********** MERGESORT *************");
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
            Divide(arr,0,n-1);
            long end=System.nanoTime();
            System.out.println("THE sorted array is :");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
            System.out.println("THE TIME TAKEN IS "+(start - end)+"ns");
            System.out.println("-----------------------------------");
        }
        static void Divide(int arr[],int si,int ei){
            if(si>=ei){
                return;
            }
            int mid=(si+ei)/2;
            Divide(arr,si,mid);
            Divide(arr,mid+1,ei);
            Conquer(arr,si,mid,ei);
        }

        static void Conquer(int arr[],int si,int mid,int ei){
            int merge[]=new int[ei-si+1];
            int id1=si;
            int id2=mid+1;
            int x=0;
            while(id1<=mid&&id2<=ei){
                if(arr[id1]<=arr[id2]){
                    merge[x++]=arr[id1++];
                }
                else{
                    merge[x++]=arr[id2++];
                }
            }
            while(id1<=mid){
                merge[x++]=arr[id1++];
            }
            while(id2<=ei){
                merge[x++]=arr[id2++];
            }
            for(int i=0, j=si;i<merge.length;i++,j++){
                arr[j]=merge[i];

            }
        }
}
