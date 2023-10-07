public class 长度最小的子数组209双指针 {
    public static void main(String[] args){

    }
    public static int minSubArrayLen(int[] arr, int n){
        int sum = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++){
            sum += arr[right];
            while(sum>=n){
                minLen = Math.min(minLen,right-left);
                sum-=arr[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
// 问题描述
//    给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，
//        并返回其长度。如果不存在符合条件的子数组，返回0。