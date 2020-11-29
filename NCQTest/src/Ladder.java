public class Ladder {
    public int[] solution2(int[] a, int[] b) {
        final int[] combinaison = new  int[a.length < 2 ? 2 : a.length];
        /*boolean test = false ; 
        if (a.length < 2) {
            test = true ; 
            final int[] combinaison = new  int [2];
        } 
        else {
            final int [] combinaison = new int[a.length];
            test = false ;
        */
       
        combinaison[0] = 1;
        combinaison[1] = 2;
        for (int i = 2; i < a.length; i++) {
            
            combinaison[i] = (combinaison[i - 1] + combinaison[i - 2]) & ((1 << 30) - 1);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = combinaison[a[i] - 1] & ((1 << b[i]) - 1);
        }
        return a;
    }
}
