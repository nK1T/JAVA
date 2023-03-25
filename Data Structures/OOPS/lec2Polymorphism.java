package OOPS;
import java.util.*;
class Student{
    String name;
    int age;
    //Compile time polymorphism - function overloading
    public void print(String name){
        System.out.println(name);
    }
    public void print(int age){
        System.out.println(age);
    }
    public void print(String name,int age){
        System.out.println(name+" "+age);
    }
}
//polymorphism - functions having same name in a single class but having at least one differntiater (return type or int string etc)
public class lec2Polymorphism {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //STEP5-CREATE OBJECT IN MAIN CLASS
        Student std1 = new Student();
        System.out.println("Enter  your name: ");
        std1.name = sc.next();
        System.out.println("Enter  your gender: ");
        std1.age = sc.nextInt();
        //STEP5-CALL METHOD
        std1.print(std1.name,std1.age);
    }    
}
