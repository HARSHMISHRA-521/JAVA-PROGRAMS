package Lab_programs;
import java.util.*;
import java.lang.*;
class Staff{
    private int ID;
    private String NAME;
    private String PHONE;
    private long SALARY;
    Staff(int id,String name,String phone ,long salary){
        ID=id;
        NAME=name;
        PHONE=phone;
        SALARY=salary;
    }
    public void Display(){
        System.out.print(ID+"\t"+NAME+"\t"+PHONE+"\t"+SALARY);
    }
}
class Teaching extends Staff{
    private String Domain;
    private int Publications;
    Teaching(int id,String name,String phone ,long salary,String domain,int publications){
        super(id,name,phone,salary);
        Domain=domain;
        Publications=publications;
    }
    public void Display(){
        super.Display();
        System.out.println("\t"+Domain+"\t"+Publications+"\t"+"\t"+"------"+"\t"+"--------");

    }

}
class Technical extends Staff
{
    private String Skills;
    public Technical(int id,String name,String phone,long salary,String skills)
    {
        super(id,name,phone,salary);
        Skills=skills;
    }
    public void Display()
    {
        super.Display();
        System.out.println("\t"+"---"+"\t"+"---"+"\t"+"\t"+Skills+"\t"+"---");
    }
}
class Contract extends Staff
{
    private int Period;
    public Contract(int id,String name,String phone,long salary,int period)
    {
        super(id,name,phone,salary);
        Period=period;
    }
    public void Display()
    {
        super.Display();
        System.out.println("\t"+"---"+"\t"+"---"+"\t"+"\t"+"---"+"\t"+Period);
    }
}

public class Inheritance {
    public static   void main(String args[]){
        Staff staff[]=new Staff[3];
        staff[0]=new Teaching(1098,"ken","123456",9000,"ntwk",5);
        staff[1]=new Technical(2675,"matt","234567",2000,"admin");
        staff[2]=new Contract(3456,"ben","456789",9000,3);
        System.out.println("ID\tName\tPhone\tSalary\tDomain\tPublications\tSkills\tPeriod");
        for(int i=0;i<3;i++)
        {
            staff[i].Display();
            System.out.println();
        }
    }




}
