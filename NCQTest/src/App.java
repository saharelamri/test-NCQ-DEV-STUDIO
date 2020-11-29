import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //Algo1
        Solution s1 = new Solution();
        int[] A = { 1, 2, 4, 6, 2 };
        Scanner scanner = new Scanner( System.in ) ;
            
        System.out.print( "Veuillez saisir un entier : " );
         int N = scanner.nextInt();
        int result[] ;
        for(int i = 0 ; i < A.length;i++) {
            result = s1.solution1(N, A ) ;
            System.out.println(result[i]);
        }
      /*  //Algo2
        Ladder l1 = new Ladder();
            
        System.out.print( "Veuillez saisir un entier : " );
         int L = scanner.nextInt();// range from 1-L a integres
         System.out.print( "Suite de combinaisons possibles " );
         int[] a = { 4, 4, 5, 5, 1 };
         int[] b = { 3, 2, 4, 3, 1 };
         int result2[] ;
         //int[] com [] = {};
         for(int i = 0 ; i < a.length;i++) {
             result2 = l1.solution2(a, b);
             System.out.println(result2[i]);
         }*/
        //Algo3
        MinVal minv = new MinVal();
        int [] v = {1,5,4,-2} ;
        int result3 ;
        result3 = minv.solution(v);
        System.out.println( "val(A,S) vaut "+result3);
    
}
}