public class Solution {
    
    public int[] solution1(int N , int[] A){ //N number of counters given by the user
        int[] result = new int[N];
        int max =0 ; int k  = 0;
        int resetLimit = 0;
        for (int K = 0; K < A.length; K++)
    {
        if (A[K] < 1 || A[K] > N + 1)
            System.out.println(" Exception");

             if (A[K] >= 1 && A[K] <= N)
                {
            if (result[A[K] - 1] < resetLimit) {
                result[A[K] - 1] = resetLimit + 1;
            } else {
                result[A[K] - 1]++;
            }

            if (result[A[K] - 1] > max)
            {
                max = result[A[K] - 1];
            }
        }
        else
        {
        
            resetLimit = max;
        }
    }

    for (int i = 0; i < result.length; i++)
        result[i] = Math.max(resetLimit, result[i]);

    return result;
    }
}
/*public int[] solution1(int n, int[] a) {
int max = 0 ;
        int setmax = 0;
        final int[] result = new int[n];
        for (final int value : a) {
            if (value >= 1 && value <= n) {
                final int ci = value - 1;
                if (result[ci] < setmax) {
                    result[ci] = setmax;
                }
                result[ci]++;
                if (result[ci] > max) {
                    max = result[ci];
                }
            } else if (value == n + 1) {
                setmax = max;
            }
        }
        for (int i = 0; i < n; i++) {
            if (result[i] < setmax) {
                result[i] = setmax;
            }
        }
        return result;
    }}*/





        
    

