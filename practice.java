import java.util.*;

public class practice {
    public static void main(String[]args){
        System.out.println("ENTER NUMBER OF ROWS: ");
        Scanner in1 = new Scanner(System.in);
        int n = in1.nextInt();
        // System.out.println("ENTER NUMBER OF COLUMNS: ");
        // Scanner in2 = new Scanner(System.in);
        // int c = in1.nextInt();
        //Q1. SOLID RECTANGLE
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q2. HOLLOW RECTANGLE
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

        //Q3. HALF PYRAMID
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //Q4.INVERTED HALF PYRAMID
        // for(int i=1;i<=n;i++){
        //     for(int j=n;j>=i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q5. HALF PYRAMID FROM RIGHT SIDE
        //    for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //         }

        //         for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        //    }
        //    //add this to make half rhombus
        //    for(int i=n;i>=1;i--){
        //         for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //         }

        //         for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        //    }

        //Q6. HALF PYRAMID OF NUMBERS
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //Q7. INNVERTED HALF PYRAMID OF NUMBERS
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //Q7. HALF PYRAMID OF NUMBERS FROM RIGHT SIDE
        //    for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //numbers
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //    }
           
        //Q9. FLOYD'S TRIANGLE
        //   

        //Q10.PRINT 1-0 TRIANGLE
        // for(int i=1;i<=n;i++){
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

        //Q11. PRINT SOLID RHOMBUS
        //upper part
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("x");
        //     }
        //     System.out.println();
        // }

        // //lower part
        // for(int i=n;i>=1;i--){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("x");
        //     }
        //     System.out.println();
        // }

        //Q12. BUTTERFLY
        //upper part
        // for(int i=1;i<=n;i++){
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // //lower part
        // for(int i=n;i>=1;i--){
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Q13. PARALELLOGRAM
        // for(int i=1;i<=n;i++){
        //     ///spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=n;j++){
        //         System.out.print("X");
        //     }
        //     System.out.println();
        // }

        //Q14.HOLLOW BUTTERFLY
        //upper part
        // for(int i=1;i<=n;i++){
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         if(j==1 || i==j){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     //spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j=1;j<=i;j++){
        //         if(j==1 || i==j){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // //lower part
        // for(int i=n;i>=1;i--){
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         if(j==1 || i==j){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     //spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j=1;j<=i;j++){
        //         if(j==1 || i==j){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q15. HOLLOW PARALELLOGRAM
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //    //stars
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || i==n){
        //             System.out.print("*");
        //         }else if(j==1 || j==n){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q16. PASCAL'S TRIANGLE
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     int c=1;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(c+" ");
        //         c=c*(i-j)/j;
        //     }
        //     System.out.println();
        // }

        //Q17. SANDGLASS PATTERN
        //upper
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=n;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //lower
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Q18. ALPHABET 'A' PATTERN
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n/2;j++){
        //         if((j==1 || j==n/2) && i!=1 || i==1 && j!=n/2 || i==n/2) {
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q19. CHRISTMAS TREE
        //first part
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=2*n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second part
        n=n+2;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=5;j<=2*n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //third part
        n=n+2;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //fourth part
        n=n+2;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //fifth part
        n=n-6;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=8;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
