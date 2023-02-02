package linearsearch;
//import java.util.Scanner;
import java.util.Arrays;
public class LinearSearchString {
    public static void main(String[] args){
        String str="Hai how are you?";
        char[] ch=str.toCharArray();
        System.out.println(ch);
        char target='a';
        int ans=linearSearchstr1(str,target,2,7);
        System.out.println(ans);
        System.out.println(Arrays.toString(str.toCharArray()));
        int answer=linearSearchstr2(str,target);
        System.out.println(answer);
    }    

    static int linearSearchstr1(String s, char target, int start, int end) {
        if(s.length()==0)
            return -1;
        /*
        enhanced for loop is used that the loop iterates from the beginning
        */
        for(int i=start;i<=end;i++){
        // s.length() -this is a method in string and arr.length -- this a variable
            if(target==s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    static int linearSearchstr2(String s, char target) {
        if(s.length()==0)
            return -1;
        for(char ch: s.toCharArray()){
             if(ch==target){
                 return 1;
             }
        }            
        return -1;
    }
}
