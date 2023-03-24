import java.util.*;

public class lec9arrays {
    public static void main(String args[]){
        System.out.println("Enter number of elements : ");
        Scanner sc = new Scanner(System.in);
        
        //Q1. Get input and print that
        // int size = sc.nextInt();
        // int marks[] = new int[size];

        // //input
        // for(int i=0;i<size;i++){
        //     marks[i] = sc.nextInt();
        // }

        // //output
        // for(int i=0;i<size;i++){
        //     System.out.println(marks[i]);
        // }

        //Q2.Take an array as input from the user. Search for a given number x and print the index number in which it occrs
        // int size = sc.nextInt();
        // String names[] = new String[size];

        // //input
        // for(int i=0;i<size;i++){
        //     marks[i] = sc.nextInt();
        // }

        // int x = sc.nextInt();
        
        // //output
        // for(int i=0;i<size;i++){
        //     if(x==marks[i]){
        //         System.out.println("Given number found at index: "+i);
        //     }
        // }
        //input

        //Q3. Take an array of names as input from the user and print them on the screen.
        // int size = sc.nextInt();
        // String names[] = new String[size];
        // for(int i=0; i<size; i++) {
        //     names[i] = sc.next();
        //  }
   
        // //output
        // for(int i=0; i<names.length; i++) {
        //     System.out.println("name " + (i+1) +" is : " + names[i]);
        // }
        //Q4.Find the maximum & minimum number in an array of integers. 
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        // for(int i=0;i<size;i++){
        //     numbers[i] = sc.nextInt();
        // }
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // int max = numbers[0];
        // int min = numbers[0];
     
        // for(int i=0; i<size; i++) {
        //     if(numbers[i] < min) {
        //         min = numbers[i];
        //     }
        //     if(numbers[i] > max) {
        //         max = numbers[i];
        //     }
        // }
        // for (int i = 1; i < size; i++)
        // {
            // if the current element is greater than the maximum found so far
            // if (numbers[i] > max) {
            //     max = numbers[i];
            // }
 
            // if the current element is smaller than the minimum found so far
        //     else if (numbers[i] < min) {
        //         min = numbers[i];
        //     }
        // }
        // System.out.println("maximum: "+max);
        // System.out.println("minimum: "+min);

        //Q5.Take an array of numbers as input and check if it is an array sorted in ascending order.
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        boolean isAscending = true;
         
        for(int i=0;i<size-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("Sorted in ascending");
        }else{
            System.out.println("Not sorted in ascending");
        }
    }
}
