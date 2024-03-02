/*
Amortized time complexity O(1)
*/
package arraylistdemo;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Double> list=new ArrayList<Double>();
        list.add(17.23);
        list.add(11.9);
        list.add(94.00);
        for(Double i:list){
        //Enhanced for loop
        //data Type Double not int
            System.out.println(i);
        }
        
        // TODO code application logic here
    }
    
}

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.print(list);
        System.out.println();
    }
}
