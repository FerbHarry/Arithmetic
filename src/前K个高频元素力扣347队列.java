import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 *  示例 1:
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 * 输入: nums = [1], k = 1
 * 输出: [1]
 */


public class 前K个高频元素力扣347队列 {
    public int[] topKFrequent1(int[] num,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i< num.length;i++){
             map.put(num[i],map.getOrDefault(num[i],0)+1);
        }
        //lambda表达式重写comparator方法返回负数是第一个形参在前，返回正数是第二个形参在前
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1,pair2) -> pair2[1] - pair1[1]);
        //用lambda表达式遍历图
        map.forEach((key,value) -> {
            pq.add(new int[]{key,value});
        });
        int[] res = new int[k];
        for (int i = 0;i<k;i++){
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
