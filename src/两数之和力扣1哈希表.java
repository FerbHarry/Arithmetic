import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍
public class 两数之和力扣1哈希表 {
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};
        int n = 9;
        Set<Integer> result = new HashSet<>();
        result = getAns(arr,n);
        for (int i: result) {
            System.out.print(i + " ");
        }
    }

    public static Set getAns(int[] arr, int n){
        Map<Integer,Integer> m = new HashMap<>();//创建hashmap存放数组
        Set<Integer>  s = new HashSet<>();//创建set存放结果
        //遍历更新hashmap
        for (int i = 0;i<arr.length;i++){
            m.put(arr[i],i);
        }
        //查找可能的数组并加入结果set集合
        for (int i = 0;i<arr.length;i++){
            if(m.containsKey(n-arr[i])) {
                s.add(m.get(arr[i]));
                s.add(m.get(n-arr[i]));
                break;
            }
        }
        return s;
    }
}
//    public int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        if(nums == null || nums.length == 0){
//            return res;
//        }
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            int temp = target - nums[i];   // 遍历当前元素，并在map中寻找是否有匹配的key
//            if(map.containsKey(temp)){
//                res[1] = i;
//                res[0] = map.get(temp);
//                break;
//            }
//            map.put(nums[i], i);    // 如果没找到匹配对，就把访问过的元素和下标加入到map中
//        }
//        return res;
//    }
