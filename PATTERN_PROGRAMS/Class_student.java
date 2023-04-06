package PATTERN_PROGRAMS;

import java.util.*;
public class Class_student {
    String USN,NAME,BRANCH,PHONE;

    String getUSN(){
        return USN;
    }
    String getNAME(){
        return NAME;
    }
    String getBRANCH(){
        return BRANCH;
    }
    String getPHONE(){
        return PHONE;
    }
    Class_student(String usn,String name,String branch,String phone){
        USN=usn;
        NAME=name;
        BRANCH=branch;
        PHONE=phone;
    }
    public static void main(String args[]){
        int i,j;
        String usn,name,branch,phone;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of students:");
        int n=s.nextInt();
        Class_student[] student=new Class_student[n];
        for(i=0;i<n;i++){
            System.out.println("Enter student "+(i+1)+" details");
            System.out.println("Enter usn");
            usn=s.next();
            System.out.println("Enter name");
            name=s.next();
            System.out.println("Enter branch");
            branch=s.next();
            System.out.println("Enter phone");
            phone=s.next();
            student[i]=new Class_student(usn,name,branch,phone);

        }
        System.out.println("DATABASE :");
        for(j=0;j<n;j++){
         System.out.println("NAME ="+student[j].getNAME()+"\t"+"USN ="+student[j].getUSN()+"\t"+"BRANCH="+student[j].getBRANCH()+"\t"+"PHONE ="+student[j].getPHONE());
        }
    }
}
