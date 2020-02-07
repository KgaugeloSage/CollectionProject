import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
     colloection(8,4,2, 2, 2,2, 2, 2, 2, 2);
    }




   static void colloection(int IntNumber, int subArraySize, int ...queue){
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < IntNumber; ++i){
            list.add(queue[i]);
        }

        System.out.println("intNumber = " + list.size());
        System.out.println("queue = " + list);

        int maxNumbers =0;
        for(int i=0; i< subArraySize-maxNumbers; i++)
        {
            int unique =0;
            HashMap<LinkedList, Integer> map = new HashMap<LinkedList, Integer>();
            for(int j=0; j< i+maxNumbers; j++)
            {
                if(!map.containsKey(list))
                {
                    map.put(list,1); //adding elements in my list
                    unique++;
                }
            }
            if(unique > maxNumbers){
                maxNumbers = unique;
            }
        }
        System.out.println("Output = " + maxNumbers);
    }
}
