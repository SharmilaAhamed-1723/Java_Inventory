package binarysearch;
/*
The smallest character that is greater than the target
*/
public class CeilingofCharacter {
    public static void main(String[] args){
        char[] ch={'b','f','i','k','m','r','s'};
        char target='r';
        int result=ceilingofchar(ch, target);
        System.out.print("The character at the index: "+result+" is ");
        System.out.print(ch[result]);
        System.out.println(" is the character that is the smallest among the characters that is greater than the target");
    }    

    static int ceilingofchar(char[] chararray, char target) {
        int start=0;
        int end=chararray.length-1;
        // if the target is greater than the largest element of the array
               
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<chararray[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        // the character array is wrapped around if there is no character  greater than the target then it will return the first index 
        return start % chararray.length ;
    }
  
}
    

