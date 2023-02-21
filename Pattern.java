package kkpattern;

public class KKPattern {

    /*

    *****
    *****
    *****
    *****
    *****
     */
    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
   
    *
    **
    ***
     */
    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
   
    ***
    **
    *
     */
    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = n; col > row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
   
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    /*
   
    1 
    2 2
    3 3 3 
    4 4 4 4
    5 5 5 5 5
     */
    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    /*
 
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
     */
    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = (row > n) ? 2 * n - row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
   
            *
          * *
        * * *
      * * * *
    * * * * *
     */
    static void pattern7(int n) {

        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
   
    *****
     ****
      ***
       **
        *
     */
    static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = n; col > row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*

      *
     * *
    * * *
        
     */
    static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < n - 1 - row; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
   
    * * * *
     * * *
      * *
       *
     */
    static void pattern10(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = n - row; col > 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
   
      *
     ***
    *****
     */
    static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = n - 1; s > row; s--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= 2 * row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        
        *****
         ***
          *
     */
    static void pattern12(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = 2 * row; col < 2 * n - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
     */
    static void pattern13(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int s = (row < n) ? (row) : (2 * n - 1) - row;
            for (int space = 0; space < s; space++) {
                System.out.print(" ");
            }
            int j = (row < n) ? (n - row) : (row - n + 1);
            for (int col = 0; col < j; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
     */
    static void pattern14(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int s = (row < n) ? n - row - 1 : (row % n) + 1;
            for (int space = 0; space < s; space++) {
                System.out.print(" ");
            }
            int j = (row < n) ? (row) : (2 * n - 2) - row;
            for (int col = 0; col <= j; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
   1 
  1 2 
 1 2 3 
1 2 3 4 
     */
    static void pattern15(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < n - 1 - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
    //Pascal's Triangle
            1
          1   1
        1   2   1
      1   3   3   1
    1   4   6   4   1
     */
    static void PascalSTriangle(int n){
        for(int i=0;i<n; i++){
           for (int s = 0; s < n - 1 - i; s++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i ;j++){
              System.out.print(nCr(i,j)+" ");  
            }
            System.out.println();
        }
    }
    static int nCr(int n, int r) {
        if(n < r || n==0)
            return 1;
        int num=1, den=1;
        for(int i = r ; r>=1; i--){
             num *= n--;
             den *= r--;
        }
        return num / den;
    }
    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = i; space < n - 1; space++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                // Every row starts and ends with 1
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
/*
    1
   212
  32123
 4321234
543212345
*/
    static void pattern17(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1; col--) {
               System.out.print(col);
            }
            for (int col = 2; col <=row; col++) {
               System.out.print(col);
            }
            System.out.println();
        }
    }
/*
    
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1    
*/
       static void pattern18(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int s = (row <=  n) ? n - row  : (row % n) ;
            for (int space = 0; space < s; space++) {
                System.out.print(" ");
            }
            int j = (row <= n) ? row : (2 * n - row);
            for (int col = j; col >= 1; col--) {
                System.out.print(col);
            }
            int i = (row <= n )? row : 2*n-row;
            for(int col=2; col<=i;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
       /*
1 1 1 1 1 1 1 
1 2 2 2 2 2 1 
1 2 3 3 3 2 1 
1 2 3 4 3 2 1 
1 2 3 3 3 2 1 
1 2 2 2 2 2 1 
1 1 1 1 1 1 1 
       */
    static void pattern19(int n){
        n=2*n;
        for(int row = 1; row<n; row++){
            for(int col=1;col<n ; col++){
                //min of distance from left, right , bottom, up;
                int atEveryIndex = (Math.min(Math.min(row,col), Math.min(n-row, n-col)));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    /*
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4
    */
    static void pattern20(int n){
        int originalN=n;
        n=2*n;
        for(int row = 1; row<n; row++){
            for(int col=1;col<n ; col++){
                //min of distance from left, right , bottom, up;
                int atEveryIndex = originalN-(Math.min(Math.min(row,col), Math.min(n-row, n-col)))+1;
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("PATTERN 1");
        pattern1(5);
        System.out.println();
        System.out.println("PATTERN 2");
        pattern2(3);
        System.out.println();
        System.out.println("PATTERN 3");
        pattern3(3);
        System.out.println();
        System.out.println("PATTERN 4");
        pattern4(5);
        System.out.println();
        System.out.println("PATTERN 5");
        pattern5(5);
        System.out.println();
        System.out.println("PATTERN 6");
        pattern6(5);
        System.out.println();
        System.out.println("PATTERN 7");
        pattern7(5);
        System.out.println();
        System.out.println("PATTERN 8 ");
        pattern8(5);
        System.out.println();
        System.out.println("PATTERN 9 ");
        pattern9(4);
        System.out.println();
        System.out.println("PATTERN 10 ");
        pattern10(4);
        System.out.println();
        System.out.println("PATTERN 11 ");
        pattern11(3);
        System.out.println();
        System.out.println("PATTERN 12 ");
        pattern12(3);
        System.out.println();
        System.out.println("PATTERN 13 ");
        pattern13(5);
        System.out.println();
        System.out.println("PATTERN 14 ");
        pattern14(5);
        System.out.println();
        System.out.println("PATTERN 15 ");
        pattern15(5);
        System.out.println();
        System.out.println("PATTERN 16");
        pattern16(7);
        System.out.println();
        System.out.println("PATTERN 17");
        pattern17(5);
        System.out.println();
        System.out.println("PATTERN 18");
        pattern18(5);
        System.out.println();
        System.out.println("PATTERN 19");
        pattern19(4);
        System.out.println();
        System.out.println("PATTERN 20");
        pattern20(4);
        System.out.println();
        PascalSTriangle(6);
    }

}
