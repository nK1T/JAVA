import java.util.Scanner;


//Q1= Adult or not
// class Main{
//     public static void main(String[] args){
//         System.out.println("Enter your age: ");
//         Scanner in = new Scanner(System.in);
//         int age = in.nextInt();
//         if(age>18){
//             System.out.println("Adult");
//         }
//         else if(age==18){
//             System.out.println("Cant decide");
//         }
//         else{
//             System.out.println("Nibba");
//         }
//         in.close();
//     }
// }


// Q2= odd/even
// class Main{
//     public static void main(String[]args){
//         System.out.println("Enter a number: ");
//         Scanner in = new Scanner(System.in);
//         int number = in.nextInt();
//         if(number%2==0){
//             System.out.println("EVEN");
//         }else{
//             System.out.println("ODD");
//         }
//         in.close();
//     }
// }


//Q3=comparison
// class Main{
//     public static void main(String[]args){
//         System.out.println("Enter first number: ");
//         Scanner in1 = new Scanner(System.in);
//         int a = in1.nextInt();
//         System.out.println("Enter second number: ");
//         Scanner in2 = new Scanner(System.in);
//         int b = in2.nextInt();
//         if(a==b){
//             System.out.println("Equal");
//         }else if(a>b){
//             System.out.println("a is Greater");
//         }else{
//             System.out.println("b is Greater");
//         }
//         in1.close();
//         in2.close();
//     }
// }


//Q4= switch statements
// class Main{
//     public static void main(String[] args) {
//         System.out.println("Enter a number: ");
//         Scanner in = new Scanner(System.in);
//         int button = in.nextInt();
//         switch(button){
//             case 1:System.out.println("HEllo");
//             break;
//             case 2:System.out.println("namaste");
//             break;
//             case 3:System.out.println("bonjour");
//             break;
//             default: System.out.println("INVALID!!!");
//         }
//         in.close();
//     }
// }


//Q4=Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	// 1 : + (Addition) a + b
    // 2 : - (Subtraction) a - b
    // 3 : * (Multiplication) a * b
    // 4 : / (Division) a / b
    // 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the user.

// class Main{
//     public static void main(String[]args){
//         System.out.println("Enter first number: ");
//         Scanner in1 = new Scanner(System.in);
//         int a = in1.nextInt();
//         System.out.println("Enter second number: ");
//         Scanner in2 = new Scanner(System.in);
//         int b = in2.nextInt();
//         int Addition = a+b;
//         int Subtraction = a-b;
//         int Multiplication = a*b;
//         int Division = a/b;
//         int Modulo = a%b;
//         System.out.println("Enter the symbol: ");
//         Scanner ch = new Scanner(System.in);
//         String symbol = ch.next();
//         switch(symbol){
//             case "+":System.out.println(Addition);
//             break;
//             case "-":System.out.println(Subtraction);
//             break;
//             case "*":System.out.println(Multiplication);
//             break;
//             case "/":System.out.println(Division);
//             break;
//             case "%":System.out.println(Modulo);
//             break;
//             default: System.out.println("INVALID!!");
//         }
//         in1.close();
//         in2.close();
//         ch.close();
//     }
// }
    

//Q5=Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

class Main{
    public static void main(String[]args){
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        switch(number){
            case 1:System.out.println("January");
            break;
            case 2:System.out.println("February");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("August");
            break;
            case 9:System.out.println("September");
            break;
            case 10:System.out.println("October");
            break;
            case 11:System.out.println("November");
            break;
            case 12:System.out.println("December");
            break;
            default: System.out.println("INVALID!!!");
        }
        in.close();
    }
}