/*
You are given an m x n integer grid accounts where accounts[i][j] is
the amount of money the ith customer has in the jth bank. Return the
wealth that the richest customer has.

A customer's wealth is the amount of money they have in all bank accounts.
The richest customer is the customer that has the maximum wealth.
*/
package richestcustomerwealth;
public class RichestCustomerWealth {
    static int largestAmtHolder(int[][] accounts){
       int maxAmount=Integer.MIN_VALUE;
        int person, customer=0;
        for(person=0; person<accounts.length; person++){
            int sum=0; 
            for(int bankAcc=0; bankAcc<accounts[person].length; bankAcc++){
                sum+=accounts[person][bankAcc];
            }
            if(sum>maxAmount){
                maxAmount=sum;
                customer=person;
            }
        }
        System.out.print("The largest amount holding person is person "+customer+" and the amount he holds is ");
        return maxAmount;
    }
    public static void main(String[] args) {
        int[][] accounts={{15_000, 10_000, 20_000},
                          {17_000, 23_000, 10_000},
                          {2_000, 94_000, 20_000}};
        int result=largestAmtHolder(accounts);
        System.out.println(result);
    }  
}
