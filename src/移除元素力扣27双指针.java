public class    移除元素力扣27双指针 {
        public static void main(String[] args) {

        }

        public static int doubleIndext(int[] arr, int n){
                int left = 0;
                for (int i = 0;i < arr.length; i++){
                        if(arr[i] != n){
                                left++;
                                arr[left] =  arr[i];
                        }
                }
                return left;
        }
}
//问题描述
//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//
//        不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
//
//        元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。