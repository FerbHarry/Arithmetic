
/*
给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
注意： 答案中不可以包含重复的三元组。
 */
//此题虽说可以用哈希表但是非常麻烦，故而使用双指针可以比哈希表简单很多，
//关于去重:因为此题使用双指针前将数组重新排序了，只要相邻的两个数是相同的，就证明是重复的
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之合15虚假的哈希表双指针 {
    public static List<List<Integer>> threeSum(int[] num){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(num);
        if(num[0]>0) return result;
        for (int i = 0; i<num.length; i++){
            if(num[i] > 0) return result;
            if(i > 0 && num[i]==num[i-1]){ //去重
                continue;
            }
            int left = i+1;
            int right = num.length-1;
            while(left<right){
                int sum = num[i] + num[left] + num[right];
                if(sum > 0){
                    right--;
                } else if(sum<0) {
                    left++;
                } else{
                    result.add(Arrays.asList(num[i],num[left],num[right]));
                    while(right>left && num[left] == num[left++]) left++;//去重
                    while(right>left && num[right] == num[right--]) right--;//去重
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}
