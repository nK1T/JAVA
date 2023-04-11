// import java.util.*;

// public class lec7functions {
    //Q1.print my name
    // public static void myName(String name){ //create function
    //     System.out.println(name+ " is a good boy");
    //     return;
    // }
    // public static void main(String[]args){
    //     Scanner in = new Scanner(System.in);
    //     String name = in.next();

    //     myName(name); //calling function
    // }

    //Q2. print sum of two numbers
    // public static void sum(int num1,int num2){
    //     System.out.println("Sum of given two numbers: "+ (num1+num2));
    // }

    // public static void main(String[]args){
    //     System.out.println("Enter first number: ");
    //     Scanner sc = new Scanner(System.in);
    //     int num1 = sc.nextInt();
    //     System.out.println("Enter second number: ");
    //     int num2 = sc.nextInt();
        
    //     sum(num1, num2);
    // }
    //or
    // public static int sum(int num1,int num2){
    //     // int sum = num1*num2;
    //     return num1+num2;
    // }

    // public static void main(String[]args){
    //     System.out.println("Enter first number: ");
    //     Scanner sc = new Scanner(System.in);
    //     int num1 = sc.nextInt();
    //     System.out.println("Enter second number: ");
    //     int num2 = sc.nextInt();
        
    //     System.out.println("mul of given two numbers: "+ sum(num1, num2));
    // }

    //Q3. calculate factorial of a number
    // public static void factorial(int num){
    //     int fact=1;
    //     for(int i=num;i>=1;i--){
    //         fact=fact*i;
    //     }
    //     System.out.println("Factorial of given number: " + fact);
    // }
    // public static void main(String[]args){
    //     System.out.println("Enter a number: ");
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
        
    //     factorial(num);
    // }

    //Q4. Check even or odd
    // public static void evenodd(int num){
    //     if(num%2==0){
    //         System.out.println("EVEN");
    //     }else{
    //         System.out.println("ODD");
    //     }
    // }
    // public static void main(String[]args){
    //     System.out.println("Enter a number: ");
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
        
    //     evenodd(num);
    // }

    //Q5. Print table
        // public static void table(int num){
        //     for(int i=1;i<=10;i++){
        //         System.out.println(num*i);
        //     }
        // }
        // public static void main(String[]args){
        //     System.out.println("Enter a number: ");
        //     Scanner sc = new Scanner(System.in);
        //     int num = sc.nextInt();
            
        //     table(num);
        // }

    //Q6. prime or not
        // public static void isPrime(int num){
        //     int count = 0;

        //     // There is no prime number less than 2.
        //     if (num <= 1) {
        //       System.out.println("The number is not prime");
        //       return;
        //     }
        
        //     // Do a for loop
        //     for (int i = 1; i <= num/2; i++) {
        //       if (num % i == 0) {
        //         count++;
        //       }
        //     }
        //     // If the number of factors is greater than 1,
        //     // the number is not prime.
        //     if (count > 1) {
        //         System.out.println("The number is not prime");
        //     }
        //     else {
        //       System.out.println("The number is prime");
        //     }
        // }
        // public static void main(String[]args){
        //     System.out.println("Enter a number: ");
        //     Scanner sc = new Scanner(System.in);
        //     int num = sc.nextInt();
            
        //     isPrime(num);;
        // }
  //  Q7. Enter 3 numbers from the user & make a function to print their average.
  // public static int average(int num1,int num2,int num3){
  //   return(num1+num2+num3)/3;
  // }

  // public static void main(String[]args){
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter first number: ");
  //   int num1 =sc.nextInt();
  //   System.out.println("Enter second number: ");
  //   int num2 =sc.nextInt();
  //   System.out.println("Enter third number : ");
  //   int num3 =sc.nextInt();
    
  //   System.out.println("Average of given numbers: " + average(num1, num2, num3));
  // }

  //Q8.Write a function to print the sum of all odd numbers from 1 to n.
  // public static int printOdd(int num){
  //   int sum=0;
  //     for(int i=1;i<=num;i+=2){
  //       sum+=i;
  //     }
  //   return sum;
  // }

  // public static void main(String[]args){
  //   System.out.println("Enter a number: ");
  //   Scanner sc = new Scanner(System.in);
  //   int num = sc.nextInt();
    
  //   System.out.println(printOdd(num));
  // }

  //Q9.Write a function which takes in 2 numbers and returns the greater of those two
  // public static void isGreater(int num1, int num2){
  //   if(num1>num2){
  //     System.out.println("first number is greater");
  //   }else if(num1<num2){
  //     System.out.println("second number is greater");
  //   }else{
  //     System.out.println("both numbers are same");
  //   }
  // }

  // public static void main(String[]args){
  //   System.out.println("Enter first number: ");
  //   Scanner sc = new Scanner(System.in);
  //   int num1 = sc.nextInt();
  //   System.out.println("Enter second number: ");
  //   int num2 = sc.nextInt();
    
  //   isGreater(num1, num2);;
  // }

  //Q10.Write a function that takes in the radius as input and returns the circumference of a circle
  // public static float circumference(float radius){
  //   return (float) (2*3.14*radius);
  // }

  // public static void main(String[]args){
  //   System.out.println("Enter radius of circle: ");
  //   Scanner sc = new Scanner(System.in);
  //   float radius = sc.nextFloat();

  //   System.out.println("circumference of given radis is "+ circumference(radius));
  // }

  //Q11.Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    // public static void isValid(int age){
    //   if(age>100  || age<0 ){
    //     System.out.println("invalid");
    //   }else if(age>18){
    //     System.out.println("You are eligible <3");
    //   }else if(age<18){
    //     System.out.println("Sorry you are not eligible :(");
    //   }
    // }

    // public static void main(String[]args){
    //   System.out.println("Enter your age: ");
    //   Scanner sc = new Scanner(System.in);
    //   int age = sc.nextInt();
      
    //   isValid(age);
    // }

    //Q12.Write an infinite loop using do while condition.
    // public static void main(String[]args){
    //   Scanner sc = new Scanner(System.in);
    //   int n = sc.nextInt();
    //   for(int i=1;i<=n;i--){
    //     System.out.println("i");
    //   }
    // }

    // //Q13.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    // public static void main(String[]args){
    //     Scanner console = new Scanner(System.in);
    //     int number,pos = 0,neg = 0,zero = 0;
    //     char choice;
    //     do{   System.out.print("Enter the number ");
    //         number = console.nextInt();
 
    //         if(number > 0){
    //             pos++;
    //         }
    //         else if(number < 0){
    //             neg++;
    //         }
    //         else{
    //             zero++;
    //         }
    //         System.out.print("Do you want to continue y/n? ");
    //         choice = console.next().charAt(0);
    //     }while(choice=='y' || choice == 'Y');
    //     System.out.println("Positive numbers: " + pos);
    //     System.out.println("Negative numbers: " + neg);
    //     System.out.println("Zero numbers: " + zero);
    // }

    //Q14.Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn
    // public static double power(int n1, int n2){
    //     return Math.pow(n1, n2);  // return a^b i.e. 5^2
    // }

    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter first number: ");
    //     int n1 = sc.nextInt();
    //     System.out.println("Enter second number: ");
    //     int n2 = sc.nextInt();

    //     System.out.println("Final answer : "+ power(n1, n2));
    // }

    //Q15.Write a function that calculates the Greatest Common Divisor of 2 numbers. 
    // public static int greatestCommonFactor(int n1,int n2){
    //     int GCD=1;
    //     for(int i=1;i<=n1 && i<=n2;i++){  //running loop form 1 to the smallest of both numbers 
    //         if(n1%i==0 && n2%i==0){  //returns true if both conditions are satisfied   
    //             GCD++;  //storing the variable i in the variable gcd 
    //         }
    //     }
    //     return GCD;
    // }

    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter first number: ");
    //     int n1 = sc.nextInt();
    //     System.out.println("Enter second number: ");
    //     int n2 = sc.nextInt();

    //     System.out.println("Greatest Common Divisor is "+greatestCommonFactor(n1, n2));
    // }

    //Q16.Write a program to print Fibonacci series of n terms where n is input by user :
    // 0 1 1 2 3 5 8 13 21 ..... 
//        public static void main(String[]args){
//         System.out.println("Enter number of elements: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int n1=0,n2=1;int n3;
//         System.out.print(n1+" "+n2);
//         for(int i=1;i<=num;i++){
//             n3=n1+n2;
//             n1=n2;
//             n2=n3;
//             System.out.print(" "+n3);
//         }
//     }
// }

