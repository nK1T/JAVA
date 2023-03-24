import java.util.*;

public class lec12StringBuilder {
    public static void main(String args[]){
        // StringBuilder str = new StringBuilder("tony is a good boy");
        // System.out.println(str);

        // //1.Char at index
        // System.out.println(str.charAt(0));

        // //2.replace characters
        // str.setCharAt(2, 'A');
        // System.out.println(str);

        // //3.insert char at index
        // str.insert(2,'a');
        // System.out.println(str);

        // //4.delete character
        // str.delete(2, 4);
        // System.out.println(str);

        // //5. append(add char at end)
        // str.append('e');
        // str.append('l');
        // System.out.println(str);

        //Q1. REVERSE A STRING
        // for(int i=0;i<str.length()/2;i++){
        //     int front = i;  //0
        //     int back = str.length()-1-i;  //5-1-0

        //     char frontChar = str.charAt(front);
        //     char backChar = str.charAt(back);

        //     str.setCharAt(front, backChar);
        //     str.setCharAt(back, frontChar);
        // }
        // System.out.println(str);

        //or
            // str.reverse();
            // System.out.println(str);
        
        //Q2. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str[] = new String[size];
        int length = 0;
        for(int i=0;i<size;i++){
            str[i] = sc.next();
            // StringBuilder string = new StringBuilder(str[]);
            length += str[i].length();
        }
        System.out.println(length);
    }
}
