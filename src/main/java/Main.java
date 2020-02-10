import java.util.HashMap;

class Main {
    public static int maxUniqueNum(int intNumber, int subArrySize, int... arr) {
        int maxNum = 0;
        for (int i = 0; i < intNumber - subArrySize; ++i) {
            int currentUnique = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i; j < i + subArrySize; ++j) {
                if (!map.containsKey(arr[j])) {
                    map.put(arr[i], 1);
                    ++currentUnique;
                }
            }
            if (currentUnique > maxNum)
                maxNum = currentUnique;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] queue = {2, 2, 2, 2, 2, 2};
        int intNumber = 6;
        int subArrySize = 3;
        System.out.println(maxUniqueNum(intNumber, subArrySize, queue));
    }
}