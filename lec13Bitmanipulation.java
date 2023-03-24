import java.util.*;
import java.util.function.BinaryOperator;

public class lec13Bitmanipulation {
    public static void main(String args[]){
        //1.get operation
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos; //step1-create a bitMask (1<<pos)

        // if((bitMask & n)==0){ //step2- perform bitwise and operator(&)
        //     System.out.println("Bit was 0");
        // }else{
        //     System.out.println("Bit was 1");
        // }

        //2.set operation (change given pos bit to 1)
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos; //step1-create a bitMask (1<<pos)

        // int newNumber = bitMask | n;  //step2-perform bitwise or operator(|)
        // System.out.println(newNumber);

        //3.clear operation (change given pos bit to 0)
        // int n =5;
        // int pos = 2;
        // int bitMask = 1<<pos;  //step2-create bitMask (1<<pos)

        // int newNumber = ~(bitMask) & n; //step2-perform not on bitmask and then and to n (~(bitMask) & n) 
        // System.out.println(newNumber);

        //4.update operation or toggle (change 1 to 0 and 0 to 1)
        // Scanner sc = new Scanner(System.in);  
        // int n = 5 ;
        // int pos = 1;
        // int oper = sc.nextInt();
        
        // int bitMask = 1<<pos;
        // if(oper==1){
        //     //set operation
        //     int newNumber = bitMask | n;
        //     System.out.println(newNumber);
        // }else{
        //     //clear operation
        //     int newNumber = ~(bitMask) & n;
        //     System.out.println(newNumber);
        // }


        //Q1.Write a program to toggle a bit a position = “pos” in a number “n”.
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int pos = sc.nextInt();
        // int bitMask = 1<<pos;
        // int newn = bitMask ^ n;
        // System.out.println(newn);

        //Q2.Write a program to count the number of 1’s in a binary representation of the number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int pos = n;
        // int count = 0;
        // int bitMask = 1<<pos;

        // while(n>0){
        //     n = n >> 1 << 1;
        //     if(pos-n==1)
        //         count++;
        //     pos = n >> 1;
        //     n = pos;
        // }
        // System.out.println(count);


        //Q3.Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another
        // binary number
        long num = 110110111;
        
        // call method by passing the binary number
        int decimal = convertBinaryToDecimal(num);
        System.out.println("Binary to Decimal");
        System.out.println(num + " = " + decimal);
        }
        //convertBinaryToDecimal
        public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        
        while (num != 0) {
        remainder = num % 10;
        num /= 10;
        decimalNumber += remainder * Math.pow(2, i);
        ++i;
        }
        
        return decimalNumber;
        }   
        
        //DEC to BIN
        // int num = 19;
        // System.out.println("Decimal to Binary");
        // long binary = convertDecimalToBinary(num);
        // System.out.println("\n" + num + " = " + binary);
        // }
        // public static long convertDecimalToBinary(int n) {
        //     long binaryNumber = 0;
        //     int remainder, i = 1, step = 1;
        //     while (n!=0) {
        //         remainder = n % 2;
        //         System.out.println("Step " + step++ + ": " + n + "/2");
        //         System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
        //         n = n/2;
        //         binaryNumber = binaryNumber + remainder * i;
        //         i = i*10;
        //     }
        //     return binaryNumber;
        
}
