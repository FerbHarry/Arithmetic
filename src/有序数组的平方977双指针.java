public class 有序数组的平方977双指针 {
    public static void main(String[] args){

    }

    public static int[] sortedSquares(int[] arr){
        int[] nArrays = new int[arr.length];
        int left = 0;
        int right = arr.length;
        int indext = nArrays.length-1;
        while(left<=right){
            if(arr[left] * arr[left] >= arr[right] * arr[right]){
                nArrays[indext--] = arr[left]*arr[left];
                left++;
            } else {
                nArrays[indext--] = arr[right] * arr[right];
                right--;
            }
        }
        return nArrays;
    }
}
//问题描述
//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，
//        要求也按 非递减顺序 排序。