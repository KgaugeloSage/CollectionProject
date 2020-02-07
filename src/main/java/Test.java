import java.util.HashMap;

class GFG {

    // Function to find maximum number of 
    // Unique integers in Sub-Array 
    // of given size 
    public static void maxUniqueNum(int arr[],
                                   int N, int M)
    {
        int maxUnique = 0;

        // Generate all subarrays of size M 
        for (int i = 0; i < N - M; i++) {
            int currentUnique = 0;

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (int k = i; k < i + M; k++) {

                // if the key is new to the map, 
                // push the key in map and increment 
                // count for unique number 
                if (!map.containsKey(arr[k])) {
                    map.put(arr[i], 1);
                    currentUnique++;
                    continue;
                }
            }

            if (currentUnique > maxUnique)
                maxUnique = currentUnique;
        }

        System.out.println(maxUnique);
    }

    // Driver Code 
    public static void main(String[] args)
    {
        int[] arr = { 5, 3, 5, 2, 3, 2 };
        int N = 6;

        int M = 3;

       maxUniqueNum(arr,N,M);
    }
} 