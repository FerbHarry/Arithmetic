import java.util.HashMap;
import java.util.Map;
/*题目描述
给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，
使得 A[i] + B[j] + C[k] + D[l] = 0。
为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。
所有整数的范围在 -2^28 到 2^28 - 1 之间，最终结果不会超过 2^31 - 1 。
 */


public class 四数相加力扣454哈希表 {
    public static int    fourSumCount(int[] num1, int[] num2, int[] num3, int[] num4){
        int result = 0;

        Map<Integer,Integer> m = new HashMap<>();
        for (int i : num1){
            for (int j: num2){
                int temp = i + j;
                if(m.containsKey(temp)) m.put(temp, m.get(temp)+1);
                else m.put(temp,1);
            }
        }

        for (int i : num3){
            for (int j : num4){
                int temp = 0 - (i+j);
                //这里不是result++，而是使用result+=m.get(temp),因为在map里这个键值有多个代表有多个组合所以不能++
                if(m.containsKey(temp)) result+=m.get(temp);
            }
        }

        return result;
    }
}
