import java.util.*;

class Main {
    public static void main(String[] args) {
        // for (int i = 0; i <= 100; i++) {
        //     System.out.print(i );
        //     System.out.println("Hello world");
        // }
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=2;i<=10;i++){
            int table =num*i;
            System.out.println(table);
        }
        // while(i <11){
        //     System.out.println("HEllo world");
        //     i++;
        // }
        // do{
        //     System.out.println(num);
        //     System.out.println("HELLO DOSTO");
        //     i++;
        // }while(i<num);
    }
}