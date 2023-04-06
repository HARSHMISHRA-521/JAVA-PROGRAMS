package Lab_programs;
import java.io.*;
import java.util.*;
public class Kruskal {
    public static void main(String args[]){
         int mincost=0;
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("^^^^^^^^^^^ KRUSKAL ^^^^^^^^^^^^^");
        System.out.println("Enetr the no of nodes");
        int n= sc.nextInt();
        int[][] cost =new int[10][10];
        System.out.println("Enetr the cost adjacency matrix :");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                cost[i][j]=sc.nextInt();
            }
        }
        System.out.println("The entered cost matrix is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(cost[i][j]+ "    ");
            }
            System.out.println();
        }
        System.out.println("The MST cost and Edge are:");
        mincost=Krk(cost,n,mincost);
        System.out.println("The min cost is :"+mincost);
        System.out.println("****************************");
    }
    static int Krk(int cost[][],int n,int mincost){
        int e=1,min;
        int a=0, b= 0,v=0, u =0;
        int parent[]=new int[10];
        while(e<n){
            min=999;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(cost[i][j]<min){
                        min=cost[i][j];
                        a=u=i;
                        b=v=j;
                    }
                }
            }
            u=find(u,parent);
            v=find(v,parent);
            if(union(u,v,parent)!=0){
                System.out.print((e++)+") min egde is");
                System.out.println("{ "+a+" , "+b+" } and min cost is : " +min);
                mincost+=min;
                parent[v]=u;
            }
            cost[a][b]=cost[b][a]=999;
        }
        return mincost;
    }
    static int find(int i,int parent[]){
        while(parent[i]!=0){
            i=parent[i];
        }
        return i;
    }
    static int union(int i,int j,int parent[]){
            if(i!=j){
                parent[j]=i;
                return 1;
            }
            else{
                return 0;
            }

    }
}
