import java.util.*;

public class lec2Recursion {

    //Q1.Print numbers from 5 to 1
    // public static void printNum(int n){
    //     if(n==0)  //base case
    //     return;
    //     System.out.println(n);  //print
    //     printNum(n-1); //recursion
    // }

    //Q2. Print numbers from 1 to 5
    // public static void printNum(int n){
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNum(n+1);
    // }

    //Q3. Print sum of first n natural numbers
    // public static void sum(int i, int n, int sum){
    //     if(i==n){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=i;
    //     sum(i+1, n, sum);
    // }

    //Q4. Print factorial of n
    // public static int fact(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     int fact_nm1 = fact(n-1);
    //     int fact_n = n*fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String args[]){
    //     System.out.println("Enter a number: ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     // int sum = 0;
    //     int ans  = fact(n);
    //     System.out.println(ans);
    // }

    //Q5. Print a fibonacci series till nth term
    // public static void fibS(int a, int b,int n){
    //     if(n==0){
    //         return;
    //     }
    //     int c = a+b;
    //     System.out.print(c+" ");
    //     a=b;
    //     b=c;
    //     fibS(a, b, n-1);
    //     //or
    //     // fibS(b, c, n-1);
    // }

    // public static void main(String args[]){
    //     System.out.println("Enter the term: ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int a = 0;
    //     int b = 1;
    //     System.out.print(a+" "+b+" ");
    //     fibS(a, b, n-2);
    // }

    //Q6. Print x^n where n = stack height
    // public static int calcP(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0;
    //     }
    //     int calcP_nm1 = calcP(x, n-1);
    //     int calP = x*calcP_nm1;
    //     return calP;
    // }

    // public static void main(String []args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the value of x: ");
    //     int x =  sc.nextInt();
    //     System.out.println("Enter the value of n: ");
    //     int n =  sc.nextInt();
    //     System.out.println(calcP(x, n));
    // }


    //Q6. Print x^n where tack height =
    // public static int calcP(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0;
    //     }

    //     //if n=even
    //     if(n%2==0){
    //         int calcP = calcP(x, n/2) * calcP(x, n/2);
    //         return calcP;
    //     }else{ //if n = odd
    //         int calcP = calcP(x, n/2) * calcP(x, n/2) * x;
    //         return calcP;
    //     }
    // }

    // public static void main(String []args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the value of x: ");
    //     int x =  sc.nextInt();
    //     System.out.println("Enter the value of n: ");
    //     int n =  sc.nextInt();
    //     System.out.println(calcP(x, n));
    // }

    //INTERMEDIATE LEVEL QSTNS
    // Q1.Tower of Hanoi
    // public static void towerOfHanoi(int n,String S, String H, String D){
    //     if(n==1){
    //         System.out.println("Transfer disk " + n + " from " + S + "to " + D);
    //         return;
    //     }
    //     towerOfHanoi(n-1, S, D, H);
    //     System.out.println("Transfer disk " + n + " from " + S + "to " + D);
    //     towerOfHanoi(n-1, H, S, D);
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Number of Disks: ");
    //     int n = sc.nextInt();
    //     towerOfHanoi(n, "S ","H ","D ");
    // }

    //Q2.Reverse a string
    // public static void revString(String str, int idx){
    //     if(idx == 0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.print(str.charAt(idx));
    //     revString(str, idx-1);
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your string: ");
    //     String str = sc.nextLine();
    //     System.out.println("Original string = "+ str);
    //     System.out.print("Reversed String = ");
    //     revString(str, str.length()-1);
    // }

    //Q3. Find first and last occurence of an element
    // public  static int first = -1;
    // public  static int last = -1;

    // public static void printOccurance(String str, int idx, char element){
    //     if(idx==str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char current = str.charAt(idx);
    //     if(current==element){
    //         if(first==-1){
    //             first = idx;
    //         }else{
    //             last = idx;
    //         }
    //     }
    //     printOccurance(str, idx+1, element);
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your string: ");
    //     String str = sc.nextLine();
    //     printOccurance(str, 0, 'a');
    // }

    //Q4.Check if an array is strictly sorted or not
    // public static boolean checkSorted(int num[],int idx){
    //     if(idx==num.length-1){
    //         return true;
    //     }
    //     if(num[idx]>=num[idx+1]){
    //         return false;
    //     }else{
    //         return checkSorted(num, idx+1);
    //     }
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int num[] = new int[size];
    //     //input in array
    //     for(int i = 0;i<size;i++){
    //         num[i] = sc.nextInt();
    //     }
    //     System.out.println(checkSorted(num, 0));
    // }

    //Q5. Move all 'x' to the end of string 
    // public static void moveX(String str, int idx, int count,String newStr){
    //     if(idx==str.length()){
    //         for(int i=0;i<count;i++){
    //             newStr+='x';
    //         }
    //         System.out.println(newStr + " " + count);
    //         return;
    //     }
    //     char currentChar = str.charAt(idx);
    //     if(currentChar=='x'){
    //         count++;
    //         moveX(str, idx+1, count, newStr);
    //     }else{
    //         newStr = newStr + currentChar;
    //         moveX(str, idx+1, count, newStr);
    //     }
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String str = sc.nextLine();
    //     moveX(str, 0, 0,"");
    // }

    //Q6. Remove duplicates from a string
    // public static boolean map[] = new boolean[26];

    // public static void removeDuplicates(String str, int idx, String newStr){
    //     if(idx==str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a']){
    //         removeDuplicates(str, idx+1, newStr);
    //     }else{
    //         newStr+=currChar;
    //         map[currChar-'a']=true;
    //         removeDuplicates(str, idx+1, newStr);
    //     }
    // }
    // public static void main(String args []){
    //     Scanner sc =  new Scanner(System.in);
    //     System.out.println("Enter your string");
    //     String str = sc.nextLine();
    //     removeDuplicates(str, 0,"");
    // }
    
    // //Q7. Print all the subsequences of string
    // public static void subsequences(String str,int idx, String newStr){
    //     if(idx==str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char currentChar = str.charAt(idx);
    //     //to be
    //     subsequences(str, idx+1, newStr + currentChar);
    //     //not to be
    //     subsequences(str, idx+1, newStr);
    // }
    // public static void main(String args []){
    //     Scanner sc =  new Scanner(System.in);
    //     System.out.println("Enter your string");
    //     String str = sc.nextLine();
    //     subsequences(str, 0,"");
    // }

    //Q7. Print all the unique subsequences of string
    // public static void subsequences(String str,int idx, String newStr, HashSet<String> set){
    //     if(idx==str.length()){
    //         if(set.contains(newStr)){
    //             return;
    //         }else{
    //             System.out.println(newStr);
    //             set.add(newStr);
    //             return;
    //         }
    //     }
    //     char currentChar = str.charAt(idx);
    //     //to be
    //     subsequences(str, idx+1, newStr + currentChar, set);
    //     //not to be
    //     subsequences(str, idx+1, newStr, set);
    // }
    // public static void main(String args []){
    //     Scanner sc =  new Scanner(System.in);
    //     System.out.println("Enter your string");
    //     String str = sc.nextLine();
    //     HashSet<String> set = new HashSet<>();
    //     subsequences(str, 0,"",set);
    // }
    

    //Q8. Print combination of keypad mobile
    // public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    // public static void printComb(String str, int idx, String combination){
    //     if(idx==str.length()){
    //         System.out.println(combination);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     String mapping = keypad[currChar -'0'];
    //     for(int i=0;i<mapping.length();i++){
    //         printComb(str, idx+1, combination + mapping.charAt(i));
    //     }

    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String str = sc.nextLine();
    //     printComb(str, 0,"");
    // }

    //ADVANCED LEVEL QUESTIONS
    //Q1. Calculate total paths in a maze from (0,0) to (n,m)
    // public static int countPath(int i, int j, int n, int m ){
    //     if(i==n || j==m){
    //         return 0;
    //     }
    //     if(i==n-1 && j==m-1){
    //         return 1;
    //     }

    //     //move downwards
    //     int downpaths = countPath(i+1, j, n, m);
    //     //move right
    //     int rightpaths = countPath(i, j+1, n, m);

    //     return downpaths + rightpaths;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the value of n: ");
    //     int n = sc.nextInt();
    //     System.out.println("Enter the value of m: ");
    //     int m = sc.nextInt();
    //     int totalPaths = countPath(0, 0, n, m);
    //     System.out.println(totalPaths);
    // }
}
