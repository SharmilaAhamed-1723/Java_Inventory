package fibonacciseries;

/**
  Time Complexity fo Fibonacci Series in Recurrence Relation
  f(n) = O[((1+sqrt(5))/2)^n ]
*/
public class FiboFormula {
   static int fiboUsingFormula(int n){
       int ans=(int)((Math.pow(((1+Math.sqrt(5))/2),n)- Math.pow(((1-Math.sqrt(5))/2),n)) / Math.sqrt(5));
       return ans;
   }
   public static void main(String[] args){
       for(int i=0;i<50;i++){
           System.out.println(fiboUsingFormula(i));
       }
   }
}
