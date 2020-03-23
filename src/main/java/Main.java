import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;

class Main {
    static int maxNum;

    public static int maxUniqueNum(int intNumber, int subArraySize, int[] arrayQueue) {

        maxNum = 0;
        Deque<Object> queue = new ArrayDeque<>();
        for (int x = 0; x <= intNumber - 1; x++) queue.add(arrayQueue[x]);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x = 0; x < intNumber - subArraySize; x++) {
            Object[] temp = queue.toArray();
            for (int i = 0; i < subArraySize; i++) {
                hashSet.add((Integer) temp[i]);
            }
            queue.remove();
            if (hashSet.size() > maxNum) maxNum = hashSet.size();
            hashSet.clear();
        }
        return maxNum;
    }


    public static void main(String[] args) {
        int[] queue = {7,5,5,7,5,5,7,5,5,6};
        int intNumber = 10;
        int subArrySize = 3;
        System.out.println(maxUniqueNum(intNumber, subArrySize, queue));
    }
}