/*
 Find the number that contains even no of digits
 count the digit
 check whether it is even or not
*/
package linearsearch;
public class EvenNoofDigits {
    public static void main(String[] args){
        int[] nums={17,23,-11,0};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(-732580));
        System.out.println(digits(0));
    }
    static int findNumbers(int[] nums){   
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
     return count;
    }     
    static boolean even(int n) {
        int noofdig= digits(n);
        //Finding the number has even no of digits
        if(noofdig % 2 == 0){
            return true;
        }
        return false;  
    }
     
    // Count no. of digits
    static int digits(int num) {
        //changing negative number to positive
        if(num<0){
           num*=-1;
        }
        // 0 is also a number itself
        //while loop does not include 0 
        if(num==0){
            return 1;
        }
        int count =0;
        while(num > 0){  //not if(numbers>0)
            count++;
            num/=10;           
        }
        return count;
    }
    // counting no of digits way 2
    static int digits2(int num){
        if(num<0){
           num*=-1;
        }
        return (int)Math.log10(num)+1;
    }
}
