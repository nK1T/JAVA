import java.util.*;

//Q1=Print butterfly pattern
class Main{
    public static void main(String[]args){
        System.out.println("ENTER A NUMBER: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // //upper half
        // for(int i=1;i<=n;i++){
        //     //first pyramid
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     //third pyramid
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //down half
        // for(int i=n;i>=1;i--){
        //     //first pyramid
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     //third pyramid
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q2=DIAMOND PATTERN
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}