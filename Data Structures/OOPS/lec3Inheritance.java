package OOPS;
//Inheritance = if a property of a class is used by another class 
// class Shape{
//     String color;
// }
// class Triangle extends Shape{  // extends keyword is used

import java.net.Socket;

// }
// public class lec3Inheritance {
//     public static void main(String args[]){
//         Triangle s1 = new Triangle();
//         s1.color="yellow";

//     }
// }
//TYPES
//1-SILNGLE LEVEL INHERITANCE - one base class one derived class from that base class
// class Shape{
//     String color; //BASE CLASS
//     int size;
// }
// class Triangle extends Shape{
//     public void area(int b,int h){
//         System.out.println((float)1/2*b*h);
//     }
//     public void printInfo(String color,int size){   //DERIVED CLASS
//         System.out.println(color+" "+size);
//     }
// }
// class lec3Inheritance{
//     public static void main(String args[]){
//         Triangle t1 = new Triangle();
//         t1.color = "Black";
//         t1.size = 3;   
//         t1.printInfo("yellow", 2);
//         t1.area(3, 2);
//     }  
// }

//2-MULTILEVEL INHERITANCE -  one base class and one derived class from that base class and another derived class from first derived class
// class Shape{
//     String color; //BASE CLASS
//     int size;
// }
// class Triangle extends Shape{
//     public void area(int b,int h){
//         System.out.println((float)1/2*b*h);
//     }
//     public void printInfo(String color,int size){   //DERIVED CLASS
//         System.out.println(color+" "+size);
//     }
// }
// class Square extends Triangle{
//     public void area(int b,int h){
//         System.out.println(b*h);
//     }
// }
// class lec3Inheritance{
//     public static void main(String args[]){
//         Triangle t1 = new Triangle();  
//         t1.printInfo("yellow", 2);
//         t1.area(3, 2);
//         Square s1 = new Square();   
//         s1.printInfo("pink",4);
//         s1.area(33, 23);
//     }  
// }

//3.HIERARCHIAL INHERITANCE - multiple derived classes from same base class
// class Shape{
//     String color; //BASE CLASS
//     int size;
//     public void printInfo(String color,int size){   //DERIVED CLASS
//         System.out.println(color+" "+size);
//     }
// }
// class Triangle extends Shape{
//     public void area(int b,int h){
//         System.out.println((float)1/2*b*h);
//     }
// }
// class Square extends Shape{
//     public void area(int b,int h){
//         System.out.println(b*h);
//     }
// }
// class lec3Inheritance{
//     public static void main(String args[]){
//         Triangle t1 = new Triangle();  
//         t1.printInfo("yellow", 2);
//         t1.area(3, 2);
//         Square s1 = new Square();   
//         s1.printInfo("pink",4);
//         s1.area(33, 23);
//     }  
// }

//4.HYBRID INHERITANCE- all inheritance happening(single level,multilevel,hierarchial)
class Shape{
    String color; //BASE CLASS
    int size;
    public void printInfo(String color,int size){   //DERIVED CLASS
        System.out.println(color+" "+size);
    }
}
class Rectangle extends Shape{
    public void area(int l,int b){
        System.out.println(l*b);
    }
}
class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println((float)1/2*b*h);
    }
}
class Square extends Triangle{
    public void area(int b,int h){
        System.out.println(b*h);
    }
}
class lec3Inheritance{
    public static void main(String args[]){
        Triangle t1 = new Triangle();  
        t1.printInfo("yellow", 2);
        t1.area(3, 2);
        Square s1 = new Square();   
        s1.printInfo("pink",4);
        s1.area(4, 3);
        Rectangle r1 = new Rectangle();   
        r1.printInfo("black",5);
        r1.area(5, 6);
    }  
}
