package Lab_programs;
import java.io.*;
import java.util.*;
public class Dijikstra {
    public static void main(String args[]){
        System.out.println("********** DIJKSTARA ************");
        int cost[][]=new int [10][10];
        int path[]=new int [10];
        int dist[]=new int [10];
        int visited[]=new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no of nodes :");
        int n= sc.nextInt();
        System.out.println("Enetr the cost matrix : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                cost[i][j]=sc.nextInt();
            }
        }
        System.out.println("The entered matrix is : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(cost[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("Enter the starting vertex :");
        int sv = sc.nextInt();
        Dkt(cost,path,visited,dist,sv,n);
        Pdk(path,dist,visited,sv,n);
        System.out.println("**********************************");

    }

    static void Dkt(int cost[][],int path[],int visited[],int dist[],int sv,int n){
        int count=2;int v=0;int min;
        for(int i=1;i<=n;i++){
            visited[i]=0;
            dist[i]=cost[sv][i];
            if(cost[sv][i]==999){
                path[i]=0;
            }
            else{
                path[i]=sv;
            }
        }
        visited[sv]=1;
        while(count<=n){
            min=999;
            for(int w=1;w<=n;w++){
                if(dist[w]<min&&(visited[w]==0)){
                    min=dist[w];
                    v=w;
                }
            }
            visited[v]=1;
            count++;
            for(int w=1;w<=n;w++){
                if(dist[w]>dist[v]+cost[v][w]){
                    dist[w]=dist[v]+cost[v][w];
                    path[w]=v;
                }
            }
        }
    }
    static void Pdk(int path[],int dist[],int visited[],int sv,int n){
        for(int w=1;w<=n;w++){
            if((visited[w]==1)&&(w!=sv)){
                System.out.print("Sortest distance between : ");
                System.out.println(sv+" --> "+w+" is "+dist[w]);
                int t=path[w];
                System.out.print("The path is ");
                System.out.print("  "+w);
                while(t!=sv){
                    System.out.print(" <--> "+ t);
                    t=path[t];
                }
                System.out.println(" <--> "+sv);
            }
        }
    }
}
