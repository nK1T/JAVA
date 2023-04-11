import java.util.*;


class Main{
    public static void main(String[]args){
        System.out.println("Enter number of rows: ");
        Scanner in1 = new Scanner(System.in);
        int r = in1.nextInt();
        System.out.println("Enter number of columns: ");
        Scanner in2 = new Scanner(System.in);
        int c = in2.nextInt();
         
        // Q1=SOLID RECTANGLE
        // for(int j=0;j<r;j++){
        //     for(int i=0;i<c;i++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q2=HOLLOW RECTANGLE
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         if(i==1||j==1||i==r||j==c){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q3=HALF PYRAMID
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }

        //Q4=INVERTED HALF PYRAMID
        // for(int i=r;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }

        //Q5=HALF PYRAMID FROM RIGHT SIDE
        // for(int i=0;i<=r;i++){
        //     for(int j=1;j<=r-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q6=HALF PYRAMID OF NUMBERS
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        // System.out.println();
        // }

        //Q6=INVERTED HALF PYRAMID OF NUMBERS
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        // System.out.println();
        // }

        //Q7=HALF PYRAMID OF NUMBERS FROM RIGHT SIDE
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=r-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
        //Q8=INVERTED HALF PYRAMID OF NUMBERS 
        // for(int i=r;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Q9=FLOYD'S TRIANGLE
        // int number=1;
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number=number+1;
        //     }
        //     System.out.println();
        // }

        //Q10=PRINT 0-1 TRIANGLE
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum=i+j;
        //         if(sum%2==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q11=PRINT SOLID RHOMBUS
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=r-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=r;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q12=NUMBER PYRAMID
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        }
}
