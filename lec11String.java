import java.util.*;

public class lec11String {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        //1.STRING DECLARATION
        // String name  = sc.nextLine();
        // System.out.println("The name is "+name);

        //2.CONCATENATION
        // String firstname = sc.nextLine();
        // String lastname = sc.nextLine();
        // String fullname = firstname+" "+lastname;

        // System.out.println("Fullname is "+ fullname);
        
        //3. GET LENGTH = fullname.length()
        // System.out.println("Fullname's length is "+ fullname.length());

        //get character at index
        // for(int i=0;i<fullname.length();i++){
        //     System.out.print(fullname.charAt(i)+" ");
        // }

        //4. COMPARING STRINGS = s1.compareTo(s2)
        //compare to function checks
        //a. str1>str2 +ve value
        //b. str==str2 0
        //c. str1<str2 -ve value
        // String str1 = sc.nextLine();
        // String str2 = sc.nextLine();

        // if(str1.compareTo(str2)==0){
        //     System.out.println("Eql");
        // }else{
        //     System.out.println("Not eql");
        // }

        //5. SUBSTRING = s1.substring(start index,end index) note;end index is excluded
        // String sentence = "My name is ankit";
        // String substring = sentence.substring(11,sentence.length());
        // System.out.println(substring);

        //6. STRING to INT Integer.parseINT(str)
        //   String str = "12345";
        //   int  number = Integer.parseInt(str);
        //   System.out.println(number);

        //6. INT Tto STRING Integer.toString(str)
        //   int number = 12345;
        //   String str = Integer.toString(number);
        //   System.out.println(number);


        //QUESTIONS
        //Q1.Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int i;
        int totlength = 0;
        String str[] = new String[size];
        for(i=0;i<size;i++){
            str[i] = sc.next();
            totlength+=str[i].length();
        }
        System.out.println(totlength);
        

        //Q2.Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // String result = "";
        // for(int i=0; i<str.length(); i++) {
        //     if(str.charAt(i) == 'e') {
        //       result += 'i';
        //     } else {
        //       result += str.charAt(i);
        //     }
        //   System.out.println(result);


        //Q3.Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

        // Scanner sc = new Scanner (System.in);
        // String email = sc.next();
        // String userName = "";
        // for(int i=0; i<email.length(); i++) {
        //   if(email.charAt(i) == '@') {
        //    break;
        //   } else {
        //     userName += email.charAt(i);
        //   }
        // }
        // System.out.println(userName);
    }
}
