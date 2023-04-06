package Lab_programs;
import java.io.*;
import java.util.Scanner;

public class Prims {
        public static void main(String[]args) {
            System.out.println("---------- PRISMS ------------- ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of elements:");
            int n = sc.nextInt();
            int cost[][] = new int[10][10];
            int mincost=0;
            int i, j;
            System.out.println("Enter the cost matrix");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    cost[i][j] = sc.nextInt();
                }
            }
            System.out.println("The entered cost matrix is :");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    System.out.print(cost[i][j]+"   ");
                }
                System.out.println();
            }
            System.out.println("The MST cost and edge is:");
            mincost=Prisms(cost,n,mincost);
            System.out.println("The min cost is :"+mincost);
            System.out.println("----------------------------------");
        }
        static int Prisms(int cost[][],int n,int mincost){
            int nearV[]=new int[10];
            int t[][]=new int [10][3];
            int u=0,i,j,k;
            for(i=2;i<=n;i++){
                nearV[i]=1;
            }
            nearV[1]=0;
            for(i=1;i<n;i++){
                int min=999;
                for(j=1;j<=n;j++){
                    if(nearV[j]!=0&&cost[j][nearV[j]]<min){
                        min=cost[j][nearV[j]];
                        u=j;
                    }
                }
                t[i][1]=u;
                t[i][2]=nearV[u];
                mincost+=min;
                nearV[u]=0;

                for( k=1;k<=n;k++){
                    if(nearV[k]!=0&&cost[k][nearV[k]]>cost[k][u]){
                        nearV[k]=u;
                    }
                }
                System.out.print(i+") "+" min edge is {"+t[i][1]);
                System.out.println("," +t[i][2]+" } and min cost is "+min);
            }
            return mincost;

        }
}
