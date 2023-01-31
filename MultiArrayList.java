package arraylistdemo;
import java.util.ArrayList;
import java.util.Scanner;
public class MultiArrayList {
   public static void main(String[]  args){
       Scanner sc=new Scanner(System.in);
       ArrayList<ArrayList<Integer>> list=new ArrayList<>();
       //Initialization of ArrayList
       for(int i=0;i<3;i++){
           list.add(new ArrayList<>());
       }
       // adding elements to the arraylist
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               list.get(i).add(sc.nextInt());
           }
         //  System.out.println();
       }
       System.out.println(list);
   }    
}
