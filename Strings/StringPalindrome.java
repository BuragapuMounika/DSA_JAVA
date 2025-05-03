import java.util.*;
public class StringPalindrome{
    public static void main(String args[]){
        String str= "amma";
        Boolean palindrome  = false;
        int n =str.length();
        for(int i=1;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                palindrome =true;
                break;

            }
        }

        if(palindrome){
            System.out.println( str + " is a palindrome");
        }
else{
    System.out.println(" they are not palindrome");
}
    }


}