package PATTERN_PROGRAMS;

import java.util.*;
public class Class_Stack {
    int top=-1;
    int a[]=new int[5];
    int max=5;

    void push(int element){
        if(top==max-1)
            System.out.println("overflow!");
        a[++top]=element;
    }
    int pop(){
        if(top==-1)
            System.out.println("underflow!");
        return a[top--];
    }
    void display() {
        int i;
        if (top == -1) {
            System.out.println("empty!");
        } else {
            System.out.println("Elements are :");
            for (i = top; i >= 0; i--) {
                System.out.println(a[i] + "\t");
            }
        }
        System.out.println();
    }
    public static void main(String[]harsh){
        Class_Stack st=new Class_Stack();
        int ch=0;
        Scanner s=new Scanner(System.in);
        for(;;){
            System.out.println("enter your choice: \n 1.push \n 2.pop \n 3.display \n 4.exit");
            ch=s.nextInt();
            switch(ch){
                case 1:
                    System.out.println("enter the element to be inserted :");
                    int element=s.nextInt();
                    st.push(element);
                    break;
                case 2:
                    System.out.println("the element poped is: "+st.pop());
                    break;
                case 3:st.display();
                break;
                case 4: System.exit(0);
                break;
                default:
                    System.out.println("invalid choice!");
                    break;
            }
        }

    }
}

